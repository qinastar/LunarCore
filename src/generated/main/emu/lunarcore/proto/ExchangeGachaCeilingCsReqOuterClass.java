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

public final class ExchangeGachaCeilingCsReqOuterClass {
  /**
   * Protobuf type {@code ExchangeGachaCeilingCsReq}
   */
  public static final class ExchangeGachaCeilingCsReq extends ProtoMessage<ExchangeGachaCeilingCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     */
    private int avatarId;

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     */
    private int gachaType;

    private ExchangeGachaCeilingCsReq() {
    }

    /**
     * @return a new empty instance of {@code ExchangeGachaCeilingCsReq}
     */
    public static ExchangeGachaCeilingCsReq newInstance() {
      return new ExchangeGachaCeilingCsReq();
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @return this
     */
    public ExchangeGachaCeilingCsReq clearAvatarId() {
      bitField0_ &= ~0x00000001;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 1;</code>
     * @param value the avatarId to set
     * @return this
     */
    public ExchangeGachaCeilingCsReq setAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      avatarId = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @return whether the gachaType field is set
     */
    public boolean hasGachaType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @return this
     */
    public ExchangeGachaCeilingCsReq clearGachaType() {
      bitField0_ &= ~0x00000002;
      gachaType = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @return the gachaType
     */
    public int getGachaType() {
      return gachaType;
    }

    /**
     * <code>optional uint32 gacha_type = 5;</code>
     * @param value the gachaType to set
     * @return this
     */
    public ExchangeGachaCeilingCsReq setGachaType(final int value) {
      bitField0_ |= 0x00000002;
      gachaType = value;
      return this;
    }

    @Override
    public ExchangeGachaCeilingCsReq copyFrom(final ExchangeGachaCeilingCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        avatarId = other.avatarId;
        gachaType = other.gachaType;
      }
      return this;
    }

    @Override
    public ExchangeGachaCeilingCsReq mergeFrom(final ExchangeGachaCeilingCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasGachaType()) {
        setGachaType(other.gachaType);
      }
      return this;
    }

    @Override
    public ExchangeGachaCeilingCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarId = 0;
      gachaType = 0;
      return this;
    }

    @Override
    public ExchangeGachaCeilingCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ExchangeGachaCeilingCsReq)) {
        return false;
      }
      ExchangeGachaCeilingCsReq other = (ExchangeGachaCeilingCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasGachaType() || gachaType == other.gachaType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(gachaType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ExchangeGachaCeilingCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // gachaType
            gachaType = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.gachaType, gachaType);
      }
      output.endObject();
    }

    @Override
    public ExchangeGachaCeilingCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 802848732:
          case -871474217: {
            if (input.isAtField(FieldNames.gachaType)) {
              if (!input.trySkipNullValue()) {
                gachaType = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public ExchangeGachaCeilingCsReq clone() {
      return new ExchangeGachaCeilingCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ExchangeGachaCeilingCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ExchangeGachaCeilingCsReq(), data).checkInitialized();
    }

    public static ExchangeGachaCeilingCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExchangeGachaCeilingCsReq(), input).checkInitialized();
    }

    public static ExchangeGachaCeilingCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ExchangeGachaCeilingCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating ExchangeGachaCeilingCsReq messages
     */
    public static MessageFactory<ExchangeGachaCeilingCsReq> getFactory() {
      return ExchangeGachaCeilingCsReqFactory.INSTANCE;
    }

    private enum ExchangeGachaCeilingCsReqFactory implements MessageFactory<ExchangeGachaCeilingCsReq> {
      INSTANCE;

      @Override
      public ExchangeGachaCeilingCsReq create() {
        return ExchangeGachaCeilingCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName gachaType = FieldName.forField("gachaType", "gacha_type");
    }
  }
}
