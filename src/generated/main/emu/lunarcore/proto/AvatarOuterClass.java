// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class AvatarOuterClass {
  /**
   * Protobuf type {@code Avatar}
   */
  public static final class Avatar extends ProtoMessage<Avatar> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 first_met_timestamp = 15;</code>
     */
    private long firstMetTimestamp;

    /**
     * <code>optional uint32 dressed_skin_id = 1;</code>
     */
    private int dressedSkinId;

    /**
     * <code>optional uint32 promotion = 3;</code>
     */
    private int promotion;

    /**
     * <code>optional uint32 base_avatar_id = 5;</code>
     */
    private int baseAvatarId;

    /**
     * <code>optional uint32 rank = 7;</code>
     */
    private int rank;

    /**
     * <code>optional uint32 level = 9;</code>
     */
    private int level;

    /**
     * <code>optional uint32 exp = 11;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     */
    private int equipmentUniqueId;

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     */
    private final RepeatedInt takenRewards = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     */
    private final RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> skilltreeList = RepeatedMessage.newEmptyInstance(AvatarSkillTreeOuterClass.AvatarSkillTree.getFactory());

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     */
    private final RepeatedMessage<EquipRelicOuterClass.EquipRelic> equipRelicList = RepeatedMessage.newEmptyInstance(EquipRelicOuterClass.EquipRelic.getFactory());

    private Avatar() {
    }

    /**
     * @return a new empty instance of {@code Avatar}
     */
    public static Avatar newInstance() {
      return new Avatar();
    }

    /**
     * <code>optional uint64 first_met_timestamp = 15;</code>
     * @return whether the firstMetTimestamp field is set
     */
    public boolean hasFirstMetTimestamp() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 first_met_timestamp = 15;</code>
     * @return this
     */
    public Avatar clearFirstMetTimestamp() {
      bitField0_ &= ~0x00000001;
      firstMetTimestamp = 0L;
      return this;
    }

    /**
     * <code>optional uint64 first_met_timestamp = 15;</code>
     * @return the firstMetTimestamp
     */
    public long getFirstMetTimestamp() {
      return firstMetTimestamp;
    }

    /**
     * <code>optional uint64 first_met_timestamp = 15;</code>
     * @param value the firstMetTimestamp to set
     * @return this
     */
    public Avatar setFirstMetTimestamp(final long value) {
      bitField0_ |= 0x00000001;
      firstMetTimestamp = value;
      return this;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 1;</code>
     * @return whether the dressedSkinId field is set
     */
    public boolean hasDressedSkinId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 1;</code>
     * @return this
     */
    public Avatar clearDressedSkinId() {
      bitField0_ &= ~0x00000002;
      dressedSkinId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 1;</code>
     * @return the dressedSkinId
     */
    public int getDressedSkinId() {
      return dressedSkinId;
    }

    /**
     * <code>optional uint32 dressed_skin_id = 1;</code>
     * @param value the dressedSkinId to set
     * @return this
     */
    public Avatar setDressedSkinId(final int value) {
      bitField0_ |= 0x00000002;
      dressedSkinId = value;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 3;</code>
     * @return whether the promotion field is set
     */
    public boolean hasPromotion() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 promotion = 3;</code>
     * @return this
     */
    public Avatar clearPromotion() {
      bitField0_ &= ~0x00000004;
      promotion = 0;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 3;</code>
     * @return the promotion
     */
    public int getPromotion() {
      return promotion;
    }

    /**
     * <code>optional uint32 promotion = 3;</code>
     * @param value the promotion to set
     * @return this
     */
    public Avatar setPromotion(final int value) {
      bitField0_ |= 0x00000004;
      promotion = value;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 5;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 5;</code>
     * @return this
     */
    public Avatar clearBaseAvatarId() {
      bitField0_ &= ~0x00000008;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 5;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 5;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public Avatar setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000008;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 rank = 7;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 rank = 7;</code>
     * @return this
     */
    public Avatar clearRank() {
      bitField0_ &= ~0x00000010;
      rank = 0;
      return this;
    }

    /**
     * <code>optional uint32 rank = 7;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <code>optional uint32 rank = 7;</code>
     * @param value the rank to set
     * @return this
     */
    public Avatar setRank(final int value) {
      bitField0_ |= 0x00000010;
      rank = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 9;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 level = 9;</code>
     * @return this
     */
    public Avatar clearLevel() {
      bitField0_ &= ~0x00000020;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 9;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 9;</code>
     * @param value the level to set
     * @return this
     */
    public Avatar setLevel(final int value) {
      bitField0_ |= 0x00000020;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 exp = 11;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 exp = 11;</code>
     * @return this
     */
    public Avatar clearExp() {
      bitField0_ &= ~0x00000040;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 11;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 11;</code>
     * @param value the exp to set
     * @return this
     */
    public Avatar setExp(final int value) {
      bitField0_ |= 0x00000040;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @return whether the equipmentUniqueId field is set
     */
    public boolean hasEquipmentUniqueId() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @return this
     */
    public Avatar clearEquipmentUniqueId() {
      bitField0_ &= ~0x00000080;
      equipmentUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @return the equipmentUniqueId
     */
    public int getEquipmentUniqueId() {
      return equipmentUniqueId;
    }

    /**
     * <code>optional uint32 equipment_unique_id = 12;</code>
     * @param value the equipmentUniqueId to set
     * @return this
     */
    public Avatar setEquipmentUniqueId(final int value) {
      bitField0_ |= 0x00000080;
      equipmentUniqueId = value;
      return this;
    }

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     * @return whether the takenRewards field is set
     */
    public boolean hasTakenRewards() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     * @return this
     */
    public Avatar clearTakenRewards() {
      bitField0_ &= ~0x00000100;
      takenRewards.clear();
      return this;
    }

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTakenRewards()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getTakenRewards() {
      return takenRewards;
    }

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableTakenRewards() {
      bitField0_ |= 0x00000100;
      return takenRewards;
    }

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     * @param value the takenRewards to add
     * @return this
     */
    public Avatar addTakenRewards(final int value) {
      bitField0_ |= 0x00000100;
      takenRewards.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 taken_rewards = 13;</code>
     * @param values the takenRewards to add
     * @return this
     */
    public Avatar addAllTakenRewards(final int... values) {
      bitField0_ |= 0x00000100;
      takenRewards.addAll(values);
      return this;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     * @return whether the skilltreeList field is set
     */
    public boolean hasSkilltreeList() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     * @return this
     */
    public Avatar clearSkilltreeList() {
      bitField0_ &= ~0x00000200;
      skilltreeList.clear();
      return this;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSkilltreeList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getSkilltreeList() {
      return skilltreeList;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AvatarSkillTreeOuterClass.AvatarSkillTree> getMutableSkilltreeList() {
      bitField0_ |= 0x00000200;
      return skilltreeList;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     * @param value the skilltreeList to add
     * @return this
     */
    public Avatar addSkilltreeList(final AvatarSkillTreeOuterClass.AvatarSkillTree value) {
      bitField0_ |= 0x00000200;
      skilltreeList.add(value);
      return this;
    }

    /**
     * <code>repeated .AvatarSkillTree skilltree_list = 4;</code>
     * @param values the skilltreeList to add
     * @return this
     */
    public Avatar addAllSkilltreeList(final AvatarSkillTreeOuterClass.AvatarSkillTree... values) {
      bitField0_ |= 0x00000200;
      skilltreeList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     * @return whether the equipRelicList field is set
     */
    public boolean hasEquipRelicList() {
      return (bitField0_ & 0x00000400) != 0;
    }

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     * @return this
     */
    public Avatar clearEquipRelicList() {
      bitField0_ &= ~0x00000400;
      equipRelicList.clear();
      return this;
    }

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEquipRelicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EquipRelicOuterClass.EquipRelic> getEquipRelicList() {
      return equipRelicList;
    }

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EquipRelicOuterClass.EquipRelic> getMutableEquipRelicList() {
      bitField0_ |= 0x00000400;
      return equipRelicList;
    }

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     * @param value the equipRelicList to add
     * @return this
     */
    public Avatar addEquipRelicList(final EquipRelicOuterClass.EquipRelic value) {
      bitField0_ |= 0x00000400;
      equipRelicList.add(value);
      return this;
    }

    /**
     * <code>repeated .EquipRelic equip_relic_list = 8;</code>
     * @param values the equipRelicList to add
     * @return this
     */
    public Avatar addAllEquipRelicList(final EquipRelicOuterClass.EquipRelic... values) {
      bitField0_ |= 0x00000400;
      equipRelicList.addAll(values);
      return this;
    }

    @Override
    public Avatar copyFrom(final Avatar other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        firstMetTimestamp = other.firstMetTimestamp;
        dressedSkinId = other.dressedSkinId;
        promotion = other.promotion;
        baseAvatarId = other.baseAvatarId;
        rank = other.rank;
        level = other.level;
        exp = other.exp;
        equipmentUniqueId = other.equipmentUniqueId;
        takenRewards.copyFrom(other.takenRewards);
        skilltreeList.copyFrom(other.skilltreeList);
        equipRelicList.copyFrom(other.equipRelicList);
      }
      return this;
    }

    @Override
    public Avatar mergeFrom(final Avatar other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFirstMetTimestamp()) {
        setFirstMetTimestamp(other.firstMetTimestamp);
      }
      if (other.hasDressedSkinId()) {
        setDressedSkinId(other.dressedSkinId);
      }
      if (other.hasPromotion()) {
        setPromotion(other.promotion);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasEquipmentUniqueId()) {
        setEquipmentUniqueId(other.equipmentUniqueId);
      }
      if (other.hasTakenRewards()) {
        getMutableTakenRewards().addAll(other.takenRewards);
      }
      if (other.hasSkilltreeList()) {
        getMutableSkilltreeList().addAll(other.skilltreeList);
      }
      if (other.hasEquipRelicList()) {
        getMutableEquipRelicList().addAll(other.equipRelicList);
      }
      return this;
    }

    @Override
    public Avatar clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      firstMetTimestamp = 0L;
      dressedSkinId = 0;
      promotion = 0;
      baseAvatarId = 0;
      rank = 0;
      level = 0;
      exp = 0;
      equipmentUniqueId = 0;
      takenRewards.clear();
      skilltreeList.clear();
      equipRelicList.clear();
      return this;
    }

    @Override
    public Avatar clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      takenRewards.clear();
      skilltreeList.clearQuick();
      equipRelicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Avatar)) {
        return false;
      }
      Avatar other = (Avatar) o;
      return bitField0_ == other.bitField0_
        && (!hasFirstMetTimestamp() || firstMetTimestamp == other.firstMetTimestamp)
        && (!hasDressedSkinId() || dressedSkinId == other.dressedSkinId)
        && (!hasPromotion() || promotion == other.promotion)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasRank() || rank == other.rank)
        && (!hasLevel() || level == other.level)
        && (!hasExp() || exp == other.exp)
        && (!hasEquipmentUniqueId() || equipmentUniqueId == other.equipmentUniqueId)
        && (!hasTakenRewards() || takenRewards.equals(other.takenRewards))
        && (!hasSkilltreeList() || skilltreeList.equals(other.skilltreeList))
        && (!hasEquipRelicList() || equipRelicList.equals(other.equipRelicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt64NoTag(firstMetTimestamp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(dressedSkinId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(promotion);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < takenRewards.length(); i++) {
          output.writeRawByte((byte) 104);
          output.writeUInt32NoTag(takenRewards.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000200) != 0) {
        for (int i = 0; i < skilltreeList.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(skilltreeList.get(i));
        }
      }
      if ((bitField0_ & 0x00000400) != 0) {
        for (int i = 0; i < equipRelicList.length(); i++) {
          output.writeRawByte((byte) 66);
          output.writeMessageNoTag(equipRelicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(firstMetTimestamp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dressedSkinId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(promotion);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * takenRewards.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(takenRewards);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += (1 * skilltreeList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(skilltreeList);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        size += (1 * equipRelicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(equipRelicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Avatar mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 120: {
            // firstMetTimestamp
            firstMetTimestamp = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // dressedSkinId
            dressedSkinId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // promotion
            promotion = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // equipmentUniqueId
            equipmentUniqueId = input.readUInt32();
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // takenRewards [packed=true]
            input.readPackedUInt32(takenRewards, tag);
            bitField0_ |= 0x00000100;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // skilltreeList
            tag = input.readRepeatedMessage(skilltreeList, tag);
            bitField0_ |= 0x00000200;
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // equipRelicList
            tag = input.readRepeatedMessage(equipRelicList, tag);
            bitField0_ |= 0x00000400;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 104: {
            // takenRewards [packed=false]
            tag = input.readRepeatedUInt32(takenRewards, tag);
            bitField0_ |= 0x00000100;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt64(FieldNames.firstMetTimestamp, firstMetTimestamp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.dressedSkinId, dressedSkinId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.promotion, promotion);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeUInt32(FieldNames.equipmentUniqueId, equipmentUniqueId);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedUInt32(FieldNames.takenRewards, takenRewards);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRepeatedMessage(FieldNames.skilltreeList, skilltreeList);
      }
      if ((bitField0_ & 0x00000400) != 0) {
        output.writeRepeatedMessage(FieldNames.equipRelicList, equipRelicList);
      }
      output.endObject();
    }

    @Override
    public Avatar mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1893996906:
          case 329864996: {
            if (input.isAtField(FieldNames.firstMetTimestamp)) {
              if (!input.trySkipNullValue()) {
                firstMetTimestamp = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -407000018:
          case 2012697844: {
            if (input.isAtField(FieldNames.dressedSkinId)) {
              if (!input.trySkipNullValue()) {
                dressedSkinId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -799212381: {
            if (input.isAtField(FieldNames.promotion)) {
              if (!input.trySkipNullValue()) {
                promotion = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1867136902:
          case 760467160: {
            if (input.isAtField(FieldNames.equipmentUniqueId)) {
              if (!input.trySkipNullValue()) {
                equipmentUniqueId = input.readUInt32();
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -932367267:
          case 500229036: {
            if (input.isAtField(FieldNames.takenRewards)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(takenRewards);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1549763245:
          case 815647086: {
            if (input.isAtField(FieldNames.skilltreeList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(skilltreeList);
                bitField0_ |= 0x00000200;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1578968161:
          case -795441831: {
            if (input.isAtField(FieldNames.equipRelicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(equipRelicList);
                bitField0_ |= 0x00000400;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public Avatar clone() {
      return new Avatar().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Avatar parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Avatar(), data).checkInitialized();
    }

    public static Avatar parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Avatar(), input).checkInitialized();
    }

    public static Avatar parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Avatar(), input).checkInitialized();
    }

    /**
     * @return factory for creating Avatar messages
     */
    public static MessageFactory<Avatar> getFactory() {
      return AvatarFactory.INSTANCE;
    }

    private enum AvatarFactory implements MessageFactory<Avatar> {
      INSTANCE;

      @Override
      public Avatar create() {
        return Avatar.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName firstMetTimestamp = FieldName.forField("firstMetTimestamp", "first_met_timestamp");

      static final FieldName dressedSkinId = FieldName.forField("dressedSkinId", "dressed_skin_id");

      static final FieldName promotion = FieldName.forField("promotion");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName rank = FieldName.forField("rank");

      static final FieldName level = FieldName.forField("level");

      static final FieldName exp = FieldName.forField("exp");

      static final FieldName equipmentUniqueId = FieldName.forField("equipmentUniqueId", "equipment_unique_id");

      static final FieldName takenRewards = FieldName.forField("takenRewards", "taken_rewards");

      static final FieldName skilltreeList = FieldName.forField("skilltreeList", "skilltree_list");

      static final FieldName equipRelicList = FieldName.forField("equipRelicList", "equip_relic_list");
    }
  }
}
