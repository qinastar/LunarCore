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
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class GetPlayerBoardDataScRspOuterClass {
  /**
   * Protobuf type {@code GetPlayerBoardDataScRsp}
   */
  public static final class GetPlayerBoardDataScRsp extends ProtoMessage<GetPlayerBoardDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 current_head_icon_id = 10;</code>
     */
    private int currentHeadIconId;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional string signature = 2;</code>
     */
    private final Utf8String signature = Utf8String.newEmptyInstance();

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     */
    private final RepeatedMessage<HeadIconOuterClass.HeadIcon> unlockedHeadIconList = RepeatedMessage.newEmptyInstance(HeadIconOuterClass.HeadIcon.getFactory());

    private GetPlayerBoardDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetPlayerBoardDataScRsp}
     */
    public static GetPlayerBoardDataScRsp newInstance() {
      return new GetPlayerBoardDataScRsp();
    }

    /**
     * <code>optional uint32 current_head_icon_id = 10;</code>
     * @return whether the currentHeadIconId field is set
     */
    public boolean hasCurrentHeadIconId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 current_head_icon_id = 10;</code>
     * @return this
     */
    public GetPlayerBoardDataScRsp clearCurrentHeadIconId() {
      bitField0_ &= ~0x00000001;
      currentHeadIconId = 0;
      return this;
    }

    /**
     * <code>optional uint32 current_head_icon_id = 10;</code>
     * @return the currentHeadIconId
     */
    public int getCurrentHeadIconId() {
      return currentHeadIconId;
    }

    /**
     * <code>optional uint32 current_head_icon_id = 10;</code>
     * @param value the currentHeadIconId to set
     * @return this
     */
    public GetPlayerBoardDataScRsp setCurrentHeadIconId(final int value) {
      bitField0_ |= 0x00000001;
      currentHeadIconId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public GetPlayerBoardDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetPlayerBoardDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional string signature = 2;</code>
     * @return whether the signature field is set
     */
    public boolean hasSignature() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional string signature = 2;</code>
     * @return this
     */
    public GetPlayerBoardDataScRsp clearSignature() {
      bitField0_ &= ~0x00000004;
      signature.clear();
      return this;
    }

    /**
     * <code>optional string signature = 2;</code>
     * @return the signature
     */
    public String getSignature() {
      return signature.getString();
    }

    /**
     * <code>optional string signature = 2;</code>
     * @return internal {@code Utf8String} representation of signature for reading
     */
    public Utf8String getSignatureBytes() {
      return this.signature;
    }

    /**
     * <code>optional string signature = 2;</code>
     * @return internal {@code Utf8String} representation of signature for modifications
     */
    public Utf8String getMutableSignatureBytes() {
      bitField0_ |= 0x00000004;
      return this.signature;
    }

    /**
     * <code>optional string signature = 2;</code>
     * @param value the signature to set
     * @return this
     */
    public GetPlayerBoardDataScRsp setSignature(final CharSequence value) {
      bitField0_ |= 0x00000004;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string signature = 2;</code>
     * @param value the signature to set
     * @return this
     */
    public GetPlayerBoardDataScRsp setSignature(final Utf8String value) {
      bitField0_ |= 0x00000004;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     * @return whether the unlockedHeadIconList field is set
     */
    public boolean hasUnlockedHeadIconList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     * @return this
     */
    public GetPlayerBoardDataScRsp clearUnlockedHeadIconList() {
      bitField0_ &= ~0x00000008;
      unlockedHeadIconList.clear();
      return this;
    }

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedHeadIconList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<HeadIconOuterClass.HeadIcon> getUnlockedHeadIconList() {
      return unlockedHeadIconList;
    }

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<HeadIconOuterClass.HeadIcon> getMutableUnlockedHeadIconList() {
      bitField0_ |= 0x00000008;
      return unlockedHeadIconList;
    }

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     * @param value the unlockedHeadIconList to add
     * @return this
     */
    public GetPlayerBoardDataScRsp addUnlockedHeadIconList(
        final HeadIconOuterClass.HeadIcon value) {
      bitField0_ |= 0x00000008;
      unlockedHeadIconList.add(value);
      return this;
    }

    /**
     * <code>repeated .HeadIcon unlocked_head_icon_list = 6;</code>
     * @param values the unlockedHeadIconList to add
     * @return this
     */
    public GetPlayerBoardDataScRsp addAllUnlockedHeadIconList(
        final HeadIconOuterClass.HeadIcon... values) {
      bitField0_ |= 0x00000008;
      unlockedHeadIconList.addAll(values);
      return this;
    }

    @Override
    public GetPlayerBoardDataScRsp copyFrom(final GetPlayerBoardDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        currentHeadIconId = other.currentHeadIconId;
        retcode = other.retcode;
        signature.copyFrom(other.signature);
        unlockedHeadIconList.copyFrom(other.unlockedHeadIconList);
      }
      return this;
    }

    @Override
    public GetPlayerBoardDataScRsp mergeFrom(final GetPlayerBoardDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurrentHeadIconId()) {
        setCurrentHeadIconId(other.currentHeadIconId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasSignature()) {
        getMutableSignatureBytes().copyFrom(other.signature);
      }
      if (other.hasUnlockedHeadIconList()) {
        getMutableUnlockedHeadIconList().addAll(other.unlockedHeadIconList);
      }
      return this;
    }

    @Override
    public GetPlayerBoardDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      currentHeadIconId = 0;
      retcode = 0;
      signature.clear();
      unlockedHeadIconList.clear();
      return this;
    }

    @Override
    public GetPlayerBoardDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      unlockedHeadIconList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetPlayerBoardDataScRsp)) {
        return false;
      }
      GetPlayerBoardDataScRsp other = (GetPlayerBoardDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasCurrentHeadIconId() || currentHeadIconId == other.currentHeadIconId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasSignature() || signature.equals(other.signature))
        && (!hasUnlockedHeadIconList() || unlockedHeadIconList.equals(other.unlockedHeadIconList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(currentHeadIconId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 18);
        output.writeStringNoTag(signature);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < unlockedHeadIconList.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(unlockedHeadIconList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(currentHeadIconId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(signature);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * unlockedHeadIconList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(unlockedHeadIconList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetPlayerBoardDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // currentHeadIconId
            currentHeadIconId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // signature
            input.readString(signature);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // unlockedHeadIconList
            tag = input.readRepeatedMessage(unlockedHeadIconList, tag);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.currentHeadIconId, currentHeadIconId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeString(FieldNames.signature, signature);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.unlockedHeadIconList, unlockedHeadIconList);
      }
      output.endObject();
    }

    @Override
    public GetPlayerBoardDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2107487181:
          case -1003133880: {
            if (input.isAtField(FieldNames.currentHeadIconId)) {
              if (!input.trySkipNullValue()) {
                currentHeadIconId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1073584312: {
            if (input.isAtField(FieldNames.signature)) {
              if (!input.trySkipNullValue()) {
                input.readString(signature);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1875382586:
          case -1276395039: {
            if (input.isAtField(FieldNames.unlockedHeadIconList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(unlockedHeadIconList);
                bitField0_ |= 0x00000008;
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
    public GetPlayerBoardDataScRsp clone() {
      return new GetPlayerBoardDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetPlayerBoardDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetPlayerBoardDataScRsp(), data).checkInitialized();
    }

    public static GetPlayerBoardDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPlayerBoardDataScRsp(), input).checkInitialized();
    }

    public static GetPlayerBoardDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetPlayerBoardDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetPlayerBoardDataScRsp messages
     */
    public static MessageFactory<GetPlayerBoardDataScRsp> getFactory() {
      return GetPlayerBoardDataScRspFactory.INSTANCE;
    }

    private enum GetPlayerBoardDataScRspFactory implements MessageFactory<GetPlayerBoardDataScRsp> {
      INSTANCE;

      @Override
      public GetPlayerBoardDataScRsp create() {
        return GetPlayerBoardDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName currentHeadIconId = FieldName.forField("currentHeadIconId", "current_head_icon_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName signature = FieldName.forField("signature");

      static final FieldName unlockedHeadIconList = FieldName.forField("unlockedHeadIconList", "unlocked_head_icon_list");
    }
  }
}