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

public final class BuyGoodsScRspOuterClass {
  /**
   * Protobuf type {@code BuyGoodsScRsp}
   */
  public static final class BuyGoodsScRsp extends ProtoMessage<BuyGoodsScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 goods_buy_times = 8;</code>
     */
    private int goodsBuyTimes;

    /**
     * <code>optional uint32 goods_id = 14;</code>
     */
    private int goodsId;

    /**
     * <code>optional uint32 shop_id = 15;</code>
     */
    private int shopId;

    /**
     * <code>optional .ItemList return_item_list = 4;</code>
     */
    private final ItemListOuterClass.ItemList returnItemList = ItemListOuterClass.ItemList.newInstance();

    private BuyGoodsScRsp() {
    }

    /**
     * @return a new empty instance of {@code BuyGoodsScRsp}
     */
    public static BuyGoodsScRsp newInstance() {
      return new BuyGoodsScRsp();
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return this
     */
    public BuyGoodsScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 3;</code>
     * @param value the retcode to set
     * @return this
     */
    public BuyGoodsScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 goods_buy_times = 8;</code>
     * @return whether the goodsBuyTimes field is set
     */
    public boolean hasGoodsBuyTimes() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 goods_buy_times = 8;</code>
     * @return this
     */
    public BuyGoodsScRsp clearGoodsBuyTimes() {
      bitField0_ &= ~0x00000002;
      goodsBuyTimes = 0;
      return this;
    }

    /**
     * <code>optional uint32 goods_buy_times = 8;</code>
     * @return the goodsBuyTimes
     */
    public int getGoodsBuyTimes() {
      return goodsBuyTimes;
    }

    /**
     * <code>optional uint32 goods_buy_times = 8;</code>
     * @param value the goodsBuyTimes to set
     * @return this
     */
    public BuyGoodsScRsp setGoodsBuyTimes(final int value) {
      bitField0_ |= 0x00000002;
      goodsBuyTimes = value;
      return this;
    }

    /**
     * <code>optional uint32 goods_id = 14;</code>
     * @return whether the goodsId field is set
     */
    public boolean hasGoodsId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 goods_id = 14;</code>
     * @return this
     */
    public BuyGoodsScRsp clearGoodsId() {
      bitField0_ &= ~0x00000004;
      goodsId = 0;
      return this;
    }

    /**
     * <code>optional uint32 goods_id = 14;</code>
     * @return the goodsId
     */
    public int getGoodsId() {
      return goodsId;
    }

    /**
     * <code>optional uint32 goods_id = 14;</code>
     * @param value the goodsId to set
     * @return this
     */
    public BuyGoodsScRsp setGoodsId(final int value) {
      bitField0_ |= 0x00000004;
      goodsId = value;
      return this;
    }

    /**
     * <code>optional uint32 shop_id = 15;</code>
     * @return whether the shopId field is set
     */
    public boolean hasShopId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 shop_id = 15;</code>
     * @return this
     */
    public BuyGoodsScRsp clearShopId() {
      bitField0_ &= ~0x00000008;
      shopId = 0;
      return this;
    }

    /**
     * <code>optional uint32 shop_id = 15;</code>
     * @return the shopId
     */
    public int getShopId() {
      return shopId;
    }

    /**
     * <code>optional uint32 shop_id = 15;</code>
     * @param value the shopId to set
     * @return this
     */
    public BuyGoodsScRsp setShopId(final int value) {
      bitField0_ |= 0x00000008;
      shopId = value;
      return this;
    }

    /**
     * <code>optional .ItemList return_item_list = 4;</code>
     * @return whether the returnItemList field is set
     */
    public boolean hasReturnItemList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .ItemList return_item_list = 4;</code>
     * @return this
     */
    public BuyGoodsScRsp clearReturnItemList() {
      bitField0_ &= ~0x00000010;
      returnItemList.clear();
      return this;
    }

    /**
     * <code>optional .ItemList return_item_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableReturnItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ItemListOuterClass.ItemList getReturnItemList() {
      return returnItemList;
    }

    /**
     * <code>optional .ItemList return_item_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ItemListOuterClass.ItemList getMutableReturnItemList() {
      bitField0_ |= 0x00000010;
      return returnItemList;
    }

    /**
     * <code>optional .ItemList return_item_list = 4;</code>
     * @param value the returnItemList to set
     * @return this
     */
    public BuyGoodsScRsp setReturnItemList(final ItemListOuterClass.ItemList value) {
      bitField0_ |= 0x00000010;
      returnItemList.copyFrom(value);
      return this;
    }

    @Override
    public BuyGoodsScRsp copyFrom(final BuyGoodsScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        goodsBuyTimes = other.goodsBuyTimes;
        goodsId = other.goodsId;
        shopId = other.shopId;
        returnItemList.copyFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public BuyGoodsScRsp mergeFrom(final BuyGoodsScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasGoodsBuyTimes()) {
        setGoodsBuyTimes(other.goodsBuyTimes);
      }
      if (other.hasGoodsId()) {
        setGoodsId(other.goodsId);
      }
      if (other.hasShopId()) {
        setShopId(other.shopId);
      }
      if (other.hasReturnItemList()) {
        getMutableReturnItemList().mergeFrom(other.returnItemList);
      }
      return this;
    }

    @Override
    public BuyGoodsScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      goodsBuyTimes = 0;
      goodsId = 0;
      shopId = 0;
      returnItemList.clear();
      return this;
    }

    @Override
    public BuyGoodsScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      returnItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BuyGoodsScRsp)) {
        return false;
      }
      BuyGoodsScRsp other = (BuyGoodsScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasGoodsBuyTimes() || goodsBuyTimes == other.goodsBuyTimes)
        && (!hasGoodsId() || goodsId == other.goodsId)
        && (!hasShopId() || shopId == other.shopId)
        && (!hasReturnItemList() || returnItemList.equals(other.returnItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(goodsBuyTimes);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(goodsId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(shopId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 34);
        output.writeMessageNoTag(returnItemList);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(goodsBuyTimes);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(goodsId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(shopId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(returnItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BuyGoodsScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // goodsBuyTimes
            goodsBuyTimes = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // goodsId
            goodsId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // shopId
            shopId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // returnItemList
            input.readMessage(returnItemList);
            bitField0_ |= 0x00000010;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.goodsBuyTimes, goodsBuyTimes);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.goodsId, goodsId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.shopId, shopId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.returnItemList, returnItemList);
      }
      output.endObject();
    }

    @Override
    public BuyGoodsScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case -1410858538:
          case -230536540: {
            if (input.isAtField(FieldNames.goodsBuyTimes)) {
              if (!input.trySkipNullValue()) {
                goodsBuyTimes = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 207037201:
          case 2123207332: {
            if (input.isAtField(FieldNames.goodsId)) {
              if (!input.trySkipNullValue()) {
                goodsId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -903151951:
          case 2067081988: {
            if (input.isAtField(FieldNames.shopId)) {
              if (!input.trySkipNullValue()) {
                shopId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -6533215:
          case -807051781: {
            if (input.isAtField(FieldNames.returnItemList)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(returnItemList);
                bitField0_ |= 0x00000010;
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
    public BuyGoodsScRsp clone() {
      return new BuyGoodsScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BuyGoodsScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BuyGoodsScRsp(), data).checkInitialized();
    }

    public static BuyGoodsScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BuyGoodsScRsp(), input).checkInitialized();
    }

    public static BuyGoodsScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BuyGoodsScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating BuyGoodsScRsp messages
     */
    public static MessageFactory<BuyGoodsScRsp> getFactory() {
      return BuyGoodsScRspFactory.INSTANCE;
    }

    private enum BuyGoodsScRspFactory implements MessageFactory<BuyGoodsScRsp> {
      INSTANCE;

      @Override
      public BuyGoodsScRsp create() {
        return BuyGoodsScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName goodsBuyTimes = FieldName.forField("goodsBuyTimes", "goods_buy_times");

      static final FieldName goodsId = FieldName.forField("goodsId", "goods_id");

      static final FieldName shopId = FieldName.forField("shopId", "shop_id");

      static final FieldName returnItemList = FieldName.forField("returnItemList", "return_item_list");
    }
  }
}
