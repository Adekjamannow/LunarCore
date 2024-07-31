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

public final class SetAssistAvatarScRspOuterClass {
  /**
   * Protobuf type {@code SetAssistAvatarScRsp}
   */
  public static final class SetAssistAvatarScRsp extends ProtoMessage<SetAssistAvatarScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 3;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 avatar_id = 9;</code>
     */
    private int avatarId;

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     */
    private final RepeatedInt avatarIdList = RepeatedInt.newEmptyInstance();

    private SetAssistAvatarScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetAssistAvatarScRsp}
     */
    public static SetAssistAvatarScRsp newInstance() {
      return new SetAssistAvatarScRsp();
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
    public SetAssistAvatarScRsp clearRetcode() {
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
    public SetAssistAvatarScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 9;</code>
     * @return whether the avatarId field is set
     */
    public boolean hasAvatarId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 avatar_id = 9;</code>
     * @return this
     */
    public SetAssistAvatarScRsp clearAvatarId() {
      bitField0_ &= ~0x00000002;
      avatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 avatar_id = 9;</code>
     * @return the avatarId
     */
    public int getAvatarId() {
      return avatarId;
    }

    /**
     * <code>optional uint32 avatar_id = 9;</code>
     * @param value the avatarId to set
     * @return this
     */
    public SetAssistAvatarScRsp setAvatarId(final int value) {
      bitField0_ |= 0x00000002;
      avatarId = value;
      return this;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @return whether the avatarIdList field is set
     */
    public boolean hasAvatarIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @return this
     */
    public SetAssistAvatarScRsp clearAvatarIdList() {
      bitField0_ &= ~0x00000004;
      avatarIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getAvatarIdList() {
      return avatarIdList;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableAvatarIdList() {
      bitField0_ |= 0x00000004;
      return avatarIdList;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @param value the avatarIdList to add
     * @return this
     */
    public SetAssistAvatarScRsp addAvatarIdList(final int value) {
      bitField0_ |= 0x00000004;
      avatarIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @param values the avatarIdList to add
     * @return this
     */
    public SetAssistAvatarScRsp addAllAvatarIdList(final int... values) {
      bitField0_ |= 0x00000004;
      avatarIdList.addAll(values);
      return this;
    }

    @Override
    public SetAssistAvatarScRsp copyFrom(final SetAssistAvatarScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        avatarId = other.avatarId;
        avatarIdList.copyFrom(other.avatarIdList);
      }
      return this;
    }

    @Override
    public SetAssistAvatarScRsp mergeFrom(final SetAssistAvatarScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasAvatarId()) {
        setAvatarId(other.avatarId);
      }
      if (other.hasAvatarIdList()) {
        getMutableAvatarIdList().addAll(other.avatarIdList);
      }
      return this;
    }

    @Override
    public SetAssistAvatarScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      avatarId = 0;
      avatarIdList.clear();
      return this;
    }

    @Override
    public SetAssistAvatarScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetAssistAvatarScRsp)) {
        return false;
      }
      SetAssistAvatarScRsp other = (SetAssistAvatarScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasAvatarId() || avatarId == other.avatarId)
        && (!hasAvatarIdList() || avatarIdList.equals(other.avatarIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < avatarIdList.length(); i++) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(avatarIdList.array()[i]);
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
        size += 1 + ProtoSink.computeUInt32SizeNoTag(avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * avatarIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(avatarIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetAssistAvatarScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // avatarId
            avatarId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // avatarIdList [packed=true]
            input.readPackedUInt32(avatarIdList, tag);
            bitField0_ |= 0x00000004;
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
          case 56: {
            // avatarIdList [packed=false]
            tag = input.readRepeatedUInt32(avatarIdList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.avatarId, avatarId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.avatarIdList, avatarIdList);
      }
      output.endObject();
    }

    @Override
    public SetAssistAvatarScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1787287636:
          case -428636735: {
            if (input.isAtField(FieldNames.avatarId)) {
              if (!input.trySkipNullValue()) {
                avatarId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1214270702:
          case 1824281692: {
            if (input.isAtField(FieldNames.avatarIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(avatarIdList);
                bitField0_ |= 0x00000004;
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
    public SetAssistAvatarScRsp clone() {
      return new SetAssistAvatarScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetAssistAvatarScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetAssistAvatarScRsp(), data).checkInitialized();
    }

    public static SetAssistAvatarScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetAssistAvatarScRsp(), input).checkInitialized();
    }

    public static SetAssistAvatarScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetAssistAvatarScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetAssistAvatarScRsp messages
     */
    public static MessageFactory<SetAssistAvatarScRsp> getFactory() {
      return SetAssistAvatarScRspFactory.INSTANCE;
    }

    private enum SetAssistAvatarScRspFactory implements MessageFactory<SetAssistAvatarScRsp> {
      INSTANCE;

      @Override
      public SetAssistAvatarScRsp create() {
        return SetAssistAvatarScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName avatarId = FieldName.forField("avatarId", "avatar_id");

      static final FieldName avatarIdList = FieldName.forField("avatarIdList", "avatar_id_list");
    }
  }
}
