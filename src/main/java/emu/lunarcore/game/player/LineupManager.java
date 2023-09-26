package emu.lunarcore.game.player;

import java.util.List;

import dev.morphia.annotations.Entity;
import emu.lunarcore.GameConstants;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.server.packet.send.PacketSyncLineupNotify;
import lombok.Getter;

@Entity(useDiscriminator = false) @Getter
public class LineupManager {
    private transient Player player;

    private PlayerLineup[] lineups;
    private int currentIndex;
    private int currentLeader;

    @Deprecated
    public LineupManager() {
        // Morphia only!
    }

    public LineupManager(Player player) {
        this();

        this.validate(player);
    }

    public PlayerLineup getLineup(int index) {
        // Sanity
        if (index < 0 || index >= this.getLineups().length) {
            return null;
        }

        return this.lineups[index];
    }

    public PlayerLineup getCurrentLineup() {
        return getLineup(this.currentIndex);
    }

    // Lineup functions

    public boolean changeLeader(int slot) {
        if (slot >= 0 && slot < this.getCurrentLineup().size()) {
            this.currentLeader = slot;
            return true;
        }

        return false;
    }

    public boolean joinLineup(int index, int slot, int avatarId) {
        // Get lineup
        PlayerLineup lineup = this.getLineup(index);
        if (lineup == null) return false;

        boolean isCurrentLineup = lineup == getCurrentLineup();

        // Get avatar
        GameAvatar avatar = getPlayer().getAvatarById(avatarId);
        if (avatar == null) return false;

        // Join lineup
        if (slot >= 0 && slot < lineup.size()) {
            // Replace avatar
            lineup.getAvatars().set(slot, avatarId);
        } else if (lineup.size() < GameConstants.MAX_AVATARS_IN_TEAM) {
            // Add avatar
            lineup.getAvatars().add(avatarId);
        } else {
            // No changes were made
            return false;
        }

        // Save
        this.getPlayer().save();

        // Sync lineup with scene
        if (isCurrentLineup) {
            player.getScene().syncLineup();
        }

        // Sync lineup data
        player.sendPacket(new PacketSyncLineupNotify(lineup));

        return true;
    }

    public boolean quitLineup(int index, int avatarId) {
        // Get lineup
        PlayerLineup lineup = this.getLineup(index);
        if (lineup == null) return false;

        boolean isCurrentLineup = lineup == getCurrentLineup();

        // Sanity check to make sure were not removing the last member of our lineup
        if (isCurrentLineup && lineup.size() <= 1) {
            return false;
        }

        //
        int i = lineup.getAvatars().indexOf(avatarId);
        if (i != -1) {
            lineup.getAvatars().remove(i);
        } else {
            return false;
        }

        // Validate leader index
        if (this.getCurrentLeader() >= lineup.size()) {
            this.currentLeader = 0;
        }

        // Save
        this.getPlayer().save();

        // Sync lineup with scene
        if (isCurrentLineup) {
            player.getScene().syncLineup();
        }

        // Sync lineup data
        player.sendPacket(new PacketSyncLineupNotify(lineup));

        return true;
    }

    public boolean switchLineup(int index) {
        // Sanity
        if (index == this.getCurrentIndex()) {
            return false;
        }

        // Get lineup
        PlayerLineup lineup = this.getLineup(index);

        // Make sure lineup exists and has size
        if (lineup == null || lineup.size() == 0) {
            return false;
        }

        // Set index
        this.currentIndex = index;
        this.currentLeader = 0;

        // Save
        this.getPlayer().save();

        // Sync lineup data
        player.getScene().syncLineup();
        player.sendPacket(new PacketSyncLineupNotify(lineup));

        return true;
    }

    public boolean replaceLineup(int index, List<Integer> lineupList) {
        // Sanity - Make sure player cant remove all avatars from the current lineup
        if (index == this.currentIndex && lineupList.size() == 0) {
            return false;
        }

        // Get lineup
        PlayerLineup lineup = this.getLineup(index);
        if (lineup == null) return false;

        // Clear
        lineup.getAvatars().clear();

        // Add
        for (int avatarId : lineupList) {
            GameAvatar avatar = getPlayer().getAvatarById(avatarId);
            if (avatar != null) {
                lineup.getAvatars().add(avatarId);
            }
        }

        // Validate leader index
        if (this.getCurrentLeader() >= lineup.size()) {
            this.currentLeader = 0;
        }

        // Save
        this.getPlayer().save();

        // Sync lineup with scene
        if (lineup == getCurrentLineup()) {
            player.getScene().syncLineup();
        }

        // Sync lineup data
        player.sendPacket(new PacketSyncLineupNotify(lineup));

        return true;
    }

    public boolean swapLineup(int index, int src, int dest) {
        // Sanity
        if (src == dest) return false;

        // Get lineup
        PlayerLineup lineup = this.getLineup(index);
        // Validate slots
        if ((lineup == null) || (src < 0 && src >= lineup.size())) {
            return false;
        }
        if (dest < 0 && dest >= lineup.size()) {
            return false;
        }

        // Swap
        int srcId = lineup.getAvatars().get(src);
        int destId = lineup.getAvatars().get(dest);

        lineup.getAvatars().set(src, destId);
        lineup.getAvatars().set(dest, srcId);

        // Save
        this.getPlayer().save();

        // Sync lineup data
        player.sendPacket(new PacketSyncLineupNotify(lineup));

        return true;
    }

    public boolean changeLineupName(int index, String name) {
        // Get lineup
        PlayerLineup lineup = this.getLineup(index);
        if (lineup == null) return false;

        // Change name
        lineup.setName(name);
        return true;
    }

    // Max sure all lineups exist in the array
    public void validate(Player player) {
        // Set player
        this.player = player;

        // Make sure lineups exist
        if (this.getLineups() == null) {
            this.lineups = new PlayerLineup[GameConstants.DEFAULT_TEAMS];
        } else if (this.getLineups().length != GameConstants.DEFAULT_TEAMS) {
            // TODO move lineups from old array to this new one
            this.lineups = new PlayerLineup[GameConstants.DEFAULT_TEAMS];
        }

        // Create new lineups for any missing ones
        for (int i = 0; i < this.lineups.length; i++) {
            if (this.lineups[i] == null) {
                this.lineups[i] = new PlayerLineup(i);
            }
            this.lineups[i].setOwnerAndIndex(getPlayer(), i);
        }

        // Set current index if out of bounds
        if (this.currentIndex < 0) {
            this.currentIndex = 0;
        } else if (this.currentIndex >= this.lineups.length) {
            this.currentIndex = this.lineups.length - 1;
        }
    }
}