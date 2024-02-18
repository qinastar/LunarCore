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

public final class ItemCostListOuterClass {
  /**
   * Protobuf type {@code ItemCostList}
   */
  public static final class ItemCostList extends ProtoMessage<ItemCostList> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     */
    private final RepeatedMessage<ItemCostOuterClass.ItemCost> itemList = RepeatedMessage.newEmptyInstance(ItemCostOuterClass.ItemCost.getFactory());

    private ItemCostList() {
    }

    /**
     * @return a new empty instance of {@code ItemCostList}
     */
    public static ItemCostList newInstance() {
      return new ItemCostList();
    }

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     * @return whether the itemList field is set
     */
    public boolean hasItemList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     * @return this
     */
    public ItemCostList clearItemList() {
      bitField0_ &= ~0x00000001;
      itemList.clear();
      return this;
    }

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ItemCostOuterClass.ItemCost> getItemList() {
      return itemList;
    }

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ItemCostOuterClass.ItemCost> getMutableItemList() {
      bitField0_ |= 0x00000001;
      return itemList;
    }

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     * @param value the itemList to add
     * @return this
     */
    public ItemCostList addItemList(final ItemCostOuterClass.ItemCost value) {
      bitField0_ |= 0x00000001;
      itemList.add(value);
      return this;
    }

    /**
     * <code>repeated .ItemCost item_list = 15;</code>
     * @param values the itemList to add
     * @return this
     */
    public ItemCostList addAllItemList(final ItemCostOuterClass.ItemCost... values) {
      bitField0_ |= 0x00000001;
      itemList.addAll(values);
      return this;
    }

    @Override
    public ItemCostList copyFrom(final ItemCostList other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        itemList.copyFrom(other.itemList);
      }
      return this;
    }

    @Override
    public ItemCostList mergeFrom(final ItemCostList other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasItemList()) {
        getMutableItemList().addAll(other.itemList);
      }
      return this;
    }

    @Override
    public ItemCostList clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemList.clear();
      return this;
    }

    @Override
    public ItemCostList clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ItemCostList)) {
        return false;
      }
      ItemCostList other = (ItemCostList) o;
      return bitField0_ == other.bitField0_
        && (!hasItemList() || itemList.equals(other.itemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < itemList.length(); i++) {
          output.writeRawByte((byte) 122);
          output.writeMessageNoTag(itemList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * itemList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(itemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ItemCostList mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 122: {
            // itemList
            tag = input.readRepeatedMessage(itemList, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.itemList, itemList);
      }
      output.endObject();
    }

    @Override
    public ItemCostList mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1177280081:
          case -2141396406: {
            if (input.isAtField(FieldNames.itemList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(itemList);
                bitField0_ |= 0x00000001;
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
    public ItemCostList clone() {
      return new ItemCostList().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ItemCostList parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ItemCostList(), data).checkInitialized();
    }

    public static ItemCostList parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ItemCostList(), input).checkInitialized();
    }

    public static ItemCostList parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ItemCostList(), input).checkInitialized();
    }

    /**
     * @return factory for creating ItemCostList messages
     */
    public static MessageFactory<ItemCostList> getFactory() {
      return ItemCostListFactory.INSTANCE;
    }

    private enum ItemCostListFactory implements MessageFactory<ItemCostList> {
      INSTANCE;

      @Override
      public ItemCostList create() {
        return ItemCostList.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName itemList = FieldName.forField("itemList", "item_list");
    }
  }
}
