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

public final class GetFriendListInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetFriendListInfoScRsp}
   */
  public static final class GetFriendListInfoScRsp extends ProtoMessage<GetFriendListInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 6;</code>
     */
    private int retcode;

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     */
    private final RepeatedMessage<FriendListInfoOuterClass.FriendListInfo> friendList = RepeatedMessage.newEmptyInstance(FriendListInfoOuterClass.FriendListInfo.getFactory());

    private GetFriendListInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFriendListInfoScRsp}
     */
    public static GetFriendListInfoScRsp newInstance() {
      return new GetFriendListInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return this
     */
    public GetFriendListInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 6;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetFriendListInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     * @return whether the friendList field is set
     */
    public boolean hasFriendList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     * @return this
     */
    public GetFriendListInfoScRsp clearFriendList() {
      bitField0_ &= ~0x00000002;
      friendList.clear();
      return this;
    }

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFriendList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<FriendListInfoOuterClass.FriendListInfo> getFriendList() {
      return friendList;
    }

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<FriendListInfoOuterClass.FriendListInfo> getMutableFriendList() {
      bitField0_ |= 0x00000002;
      return friendList;
    }

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     * @param value the friendList to add
     * @return this
     */
    public GetFriendListInfoScRsp addFriendList(
        final FriendListInfoOuterClass.FriendListInfo value) {
      bitField0_ |= 0x00000002;
      friendList.add(value);
      return this;
    }

    /**
     * <code>repeated .FriendListInfo friend_list = 2;</code>
     * @param values the friendList to add
     * @return this
     */
    public GetFriendListInfoScRsp addAllFriendList(
        final FriendListInfoOuterClass.FriendListInfo... values) {
      bitField0_ |= 0x00000002;
      friendList.addAll(values);
      return this;
    }

    @Override
    public GetFriendListInfoScRsp copyFrom(final GetFriendListInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        friendList.copyFrom(other.friendList);
      }
      return this;
    }

    @Override
    public GetFriendListInfoScRsp mergeFrom(final GetFriendListInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasFriendList()) {
        getMutableFriendList().addAll(other.friendList);
      }
      return this;
    }

    @Override
    public GetFriendListInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      friendList.clear();
      return this;
    }

    @Override
    public GetFriendListInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      friendList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFriendListInfoScRsp)) {
        return false;
      }
      GetFriendListInfoScRsp other = (GetFriendListInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasFriendList() || friendList.equals(other.friendList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < friendList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(friendList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * friendList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(friendList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFriendListInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // friendList
            tag = input.readRepeatedMessage(friendList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.friendList, friendList);
      }
      output.endObject();
    }

    @Override
    public GetFriendListInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1756909476:
          case 1388007839: {
            if (input.isAtField(FieldNames.friendList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(friendList);
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
    public GetFriendListInfoScRsp clone() {
      return new GetFriendListInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFriendListInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFriendListInfoScRsp(), data).checkInitialized();
    }

    public static GetFriendListInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendListInfoScRsp(), input).checkInitialized();
    }

    public static GetFriendListInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendListInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFriendListInfoScRsp messages
     */
    public static MessageFactory<GetFriendListInfoScRsp> getFactory() {
      return GetFriendListInfoScRspFactory.INSTANCE;
    }

    private enum GetFriendListInfoScRspFactory implements MessageFactory<GetFriendListInfoScRsp> {
      INSTANCE;

      @Override
      public GetFriendListInfoScRsp create() {
        return GetFriendListInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName friendList = FieldName.forField("friendList", "friend_list");
    }
  }
}
