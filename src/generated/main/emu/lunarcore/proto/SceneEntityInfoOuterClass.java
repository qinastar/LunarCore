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

public final class SceneEntityInfoOuterClass {
  /**
   * Protobuf type {@code SceneEntityInfo}
   */
  public static final class SceneEntityInfo extends ProtoMessage<SceneEntityInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 inst_id = 4;</code>
     */
    private int instId;

    /**
     * <code>optional uint32 entity_id = 6;</code>
     */
    private int entityId;

    /**
     * <code>optional uint32 group_id = 11;</code>
     */
    private int groupId;

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     */
    private final ScenePropInfoOuterClass.ScenePropInfo prop = ScenePropInfoOuterClass.ScenePropInfo.newInstance();

    /**
     * <code>optional .MotionInfo motion = 8;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 9;</code>
     */
    private final SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo npcMonster = SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo.newInstance();

    /**
     * <code>optional .SceneSummonUnitInfo summon_unit = 12;</code>
     */
    private final SceneSummonUnitInfoOuterClass.SceneSummonUnitInfo summonUnit = SceneSummonUnitInfoOuterClass.SceneSummonUnitInfo.newInstance();

    /**
     * <code>optional .SceneActorInfo actor = 13;</code>
     */
    private final SceneActorInfoOuterClass.SceneActorInfo actor = SceneActorInfoOuterClass.SceneActorInfo.newInstance();

    /**
     * <code>optional .SceneNpcInfo npc = 14;</code>
     */
    private final SceneNpcInfoOuterClass.SceneNpcInfo npc = SceneNpcInfoOuterClass.SceneNpcInfo.newInstance();

    private SceneEntityInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityInfo}
     */
    public static SceneEntityInfo newInstance() {
      return new SceneEntityInfo();
    }

    /**
     * <code>optional uint32 inst_id = 4;</code>
     * @return whether the instId field is set
     */
    public boolean hasInstId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 inst_id = 4;</code>
     * @return this
     */
    public SceneEntityInfo clearInstId() {
      bitField0_ &= ~0x00000001;
      instId = 0;
      return this;
    }

    /**
     * <code>optional uint32 inst_id = 4;</code>
     * @return the instId
     */
    public int getInstId() {
      return instId;
    }

    /**
     * <code>optional uint32 inst_id = 4;</code>
     * @param value the instId to set
     * @return this
     */
    public SceneEntityInfo setInstId(final int value) {
      bitField0_ |= 0x00000001;
      instId = value;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 6;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 6;</code>
     * @return this
     */
    public SceneEntityInfo clearEntityId() {
      bitField0_ &= ~0x00000002;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 6;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 6;</code>
     * @param value the entityId to set
     * @return this
     */
    public SceneEntityInfo setEntityId(final int value) {
      bitField0_ |= 0x00000002;
      entityId = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 11;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 group_id = 11;</code>
     * @return this
     */
    public SceneEntityInfo clearGroupId() {
      bitField0_ &= ~0x00000004;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 11;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 11;</code>
     * @param value the groupId to set
     * @return this
     */
    public SceneEntityInfo setGroupId(final int value) {
      bitField0_ |= 0x00000004;
      groupId = value;
      return this;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     * @return whether the prop field is set
     */
    public boolean hasProp() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     * @return this
     */
    public SceneEntityInfo clearProp() {
      bitField0_ &= ~0x00000008;
      prop.clear();
      return this;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableProp()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ScenePropInfoOuterClass.ScenePropInfo getProp() {
      return prop;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ScenePropInfoOuterClass.ScenePropInfo getMutableProp() {
      bitField0_ |= 0x00000008;
      return prop;
    }

    /**
     * <code>optional .ScenePropInfo prop = 5;</code>
     * @param value the prop to set
     * @return this
     */
    public SceneEntityInfo setProp(final ScenePropInfoOuterClass.ScenePropInfo value) {
      bitField0_ |= 0x00000008;
      prop.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 8;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 8;</code>
     * @return this
     */
    public SceneEntityInfo clearMotion() {
      bitField0_ &= ~0x00000010;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000010;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 8;</code>
     * @param value the motion to set
     * @return this
     */
    public SceneEntityInfo setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000010;
      motion.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 9;</code>
     * @return whether the npcMonster field is set
     */
    public boolean hasNpcMonster() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 9;</code>
     * @return this
     */
    public SceneEntityInfo clearNpcMonster() {
      bitField0_ &= ~0x00000020;
      npcMonster.clear();
      return this;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNpcMonster()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo getNpcMonster() {
      return npcMonster;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo getMutableNpcMonster() {
      bitField0_ |= 0x00000020;
      return npcMonster;
    }

    /**
     * <code>optional .SceneNpcMonsterInfo npc_monster = 9;</code>
     * @param value the npcMonster to set
     * @return this
     */
    public SceneEntityInfo setNpcMonster(
        final SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo value) {
      bitField0_ |= 0x00000020;
      npcMonster.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneSummonUnitInfo summon_unit = 12;</code>
     * @return whether the summonUnit field is set
     */
    public boolean hasSummonUnit() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional .SceneSummonUnitInfo summon_unit = 12;</code>
     * @return this
     */
    public SceneEntityInfo clearSummonUnit() {
      bitField0_ &= ~0x00000040;
      summonUnit.clear();
      return this;
    }

    /**
     * <code>optional .SceneSummonUnitInfo summon_unit = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSummonUnit()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneSummonUnitInfoOuterClass.SceneSummonUnitInfo getSummonUnit() {
      return summonUnit;
    }

    /**
     * <code>optional .SceneSummonUnitInfo summon_unit = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneSummonUnitInfoOuterClass.SceneSummonUnitInfo getMutableSummonUnit() {
      bitField0_ |= 0x00000040;
      return summonUnit;
    }

    /**
     * <code>optional .SceneSummonUnitInfo summon_unit = 12;</code>
     * @param value the summonUnit to set
     * @return this
     */
    public SceneEntityInfo setSummonUnit(
        final SceneSummonUnitInfoOuterClass.SceneSummonUnitInfo value) {
      bitField0_ |= 0x00000040;
      summonUnit.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneActorInfo actor = 13;</code>
     * @return whether the actor field is set
     */
    public boolean hasActor() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .SceneActorInfo actor = 13;</code>
     * @return this
     */
    public SceneEntityInfo clearActor() {
      bitField0_ &= ~0x00000080;
      actor.clear();
      return this;
    }

    /**
     * <code>optional .SceneActorInfo actor = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableActor()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneActorInfoOuterClass.SceneActorInfo getActor() {
      return actor;
    }

    /**
     * <code>optional .SceneActorInfo actor = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneActorInfoOuterClass.SceneActorInfo getMutableActor() {
      bitField0_ |= 0x00000080;
      return actor;
    }

    /**
     * <code>optional .SceneActorInfo actor = 13;</code>
     * @param value the actor to set
     * @return this
     */
    public SceneEntityInfo setActor(final SceneActorInfoOuterClass.SceneActorInfo value) {
      bitField0_ |= 0x00000080;
      actor.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .SceneNpcInfo npc = 14;</code>
     * @return whether the npc field is set
     */
    public boolean hasNpc() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>optional .SceneNpcInfo npc = 14;</code>
     * @return this
     */
    public SceneEntityInfo clearNpc() {
      bitField0_ &= ~0x00000100;
      npc.clear();
      return this;
    }

    /**
     * <code>optional .SceneNpcInfo npc = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNpc()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneNpcInfoOuterClass.SceneNpcInfo getNpc() {
      return npc;
    }

    /**
     * <code>optional .SceneNpcInfo npc = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneNpcInfoOuterClass.SceneNpcInfo getMutableNpc() {
      bitField0_ |= 0x00000100;
      return npc;
    }

    /**
     * <code>optional .SceneNpcInfo npc = 14;</code>
     * @param value the npc to set
     * @return this
     */
    public SceneEntityInfo setNpc(final SceneNpcInfoOuterClass.SceneNpcInfo value) {
      bitField0_ |= 0x00000100;
      npc.copyFrom(value);
      return this;
    }

    @Override
    public SceneEntityInfo copyFrom(final SceneEntityInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        instId = other.instId;
        entityId = other.entityId;
        groupId = other.groupId;
        prop.copyFrom(other.prop);
        motion.copyFrom(other.motion);
        npcMonster.copyFrom(other.npcMonster);
        summonUnit.copyFrom(other.summonUnit);
        actor.copyFrom(other.actor);
        npc.copyFrom(other.npc);
      }
      return this;
    }

    @Override
    public SceneEntityInfo mergeFrom(final SceneEntityInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasInstId()) {
        setInstId(other.instId);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasProp()) {
        getMutableProp().mergeFrom(other.prop);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      if (other.hasNpcMonster()) {
        getMutableNpcMonster().mergeFrom(other.npcMonster);
      }
      if (other.hasSummonUnit()) {
        getMutableSummonUnit().mergeFrom(other.summonUnit);
      }
      if (other.hasActor()) {
        getMutableActor().mergeFrom(other.actor);
      }
      if (other.hasNpc()) {
        getMutableNpc().mergeFrom(other.npc);
      }
      return this;
    }

    @Override
    public SceneEntityInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      instId = 0;
      entityId = 0;
      groupId = 0;
      prop.clear();
      motion.clear();
      npcMonster.clear();
      summonUnit.clear();
      actor.clear();
      npc.clear();
      return this;
    }

    @Override
    public SceneEntityInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      prop.clearQuick();
      motion.clearQuick();
      npcMonster.clearQuick();
      summonUnit.clearQuick();
      actor.clearQuick();
      npc.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityInfo)) {
        return false;
      }
      SceneEntityInfo other = (SceneEntityInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasInstId() || instId == other.instId)
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasProp() || prop.equals(other.prop))
        && (!hasMotion() || motion.equals(other.motion))
        && (!hasNpcMonster() || npcMonster.equals(other.npcMonster))
        && (!hasSummonUnit() || summonUnit.equals(other.summonUnit))
        && (!hasActor() || actor.equals(other.actor))
        && (!hasNpc() || npc.equals(other.npc));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(instId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(prop);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(motion);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(npcMonster);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(summonUnit);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 106);
        output.writeMessageNoTag(actor);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(npc);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(instId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(prop);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(npcMonster);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(summonUnit);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(actor);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(npc);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // instId
            instId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // prop
            input.readMessage(prop);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // motion
            input.readMessage(motion);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // npcMonster
            input.readMessage(npcMonster);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // summonUnit
            input.readMessage(summonUnit);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // actor
            input.readMessage(actor);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // npc
            input.readMessage(npc);
            bitField0_ |= 0x00000100;
            tag = input.readTag();
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.instId, instId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.prop, prop);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.npcMonster, npcMonster);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeMessage(FieldNames.summonUnit, summonUnit);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.actor, actor);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeMessage(FieldNames.npc, npc);
      }
      output.endObject();
    }

    @Override
    public SceneEntityInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1183779327:
          case 1957567924: {
            if (input.isAtField(FieldNames.instId)) {
              if (!input.trySkipNullValue()) {
                instId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3449699: {
            if (input.isAtField(FieldNames.prop)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(prop);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1367251527:
          case 119679100: {
            if (input.isAtField(FieldNames.npcMonster)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(npcMonster);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 80492037:
          case -1790265822: {
            if (input.isAtField(FieldNames.summonUnit)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(summonUnit);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 92645877: {
            if (input.isAtField(FieldNames.actor)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(actor);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109281: {
            if (input.isAtField(FieldNames.npc)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(npc);
                bitField0_ |= 0x00000100;
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
    public SceneEntityInfo clone() {
      return new SceneEntityInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityInfo(), data).checkInitialized();
    }

    public static SceneEntityInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityInfo(), input).checkInitialized();
    }

    public static SceneEntityInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityInfo messages
     */
    public static MessageFactory<SceneEntityInfo> getFactory() {
      return SceneEntityInfoFactory.INSTANCE;
    }

    private enum SceneEntityInfoFactory implements MessageFactory<SceneEntityInfo> {
      INSTANCE;

      @Override
      public SceneEntityInfo create() {
        return SceneEntityInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName instId = FieldName.forField("instId", "inst_id");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName prop = FieldName.forField("prop");

      static final FieldName motion = FieldName.forField("motion");

      static final FieldName npcMonster = FieldName.forField("npcMonster", "npc_monster");

      static final FieldName summonUnit = FieldName.forField("summonUnit", "summon_unit");

      static final FieldName actor = FieldName.forField("actor");

      static final FieldName npc = FieldName.forField("npc");
    }
  }
}
