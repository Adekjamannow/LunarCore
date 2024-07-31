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

public final class SetGameplayBirthdayScRspOuterClass {
  /**
   * Protobuf type {@code SetGameplayBirthdayScRsp}
   */
  public static final class SetGameplayBirthdayScRsp extends ProtoMessage<SetGameplayBirthdayScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 6;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 birthday = 11;</code>
     */
    private int birthday;

    private SetGameplayBirthdayScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetGameplayBirthdayScRsp}
     */
    public static SetGameplayBirthdayScRsp newInstance() {
      return new SetGameplayBirthdayScRsp();
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
    public SetGameplayBirthdayScRsp clearRetcode() {
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
    public SetGameplayBirthdayScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 birthday = 11;</code>
     * @return whether the birthday field is set
     */
    public boolean hasBirthday() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 birthday = 11;</code>
     * @return this
     */
    public SetGameplayBirthdayScRsp clearBirthday() {
      bitField0_ &= ~0x00000002;
      birthday = 0;
      return this;
    }

    /**
     * <code>optional uint32 birthday = 11;</code>
     * @return the birthday
     */
    public int getBirthday() {
      return birthday;
    }

    /**
     * <code>optional uint32 birthday = 11;</code>
     * @param value the birthday to set
     * @return this
     */
    public SetGameplayBirthdayScRsp setBirthday(final int value) {
      bitField0_ |= 0x00000002;
      birthday = value;
      return this;
    }

    @Override
    public SetGameplayBirthdayScRsp copyFrom(final SetGameplayBirthdayScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        birthday = other.birthday;
      }
      return this;
    }

    @Override
    public SetGameplayBirthdayScRsp mergeFrom(final SetGameplayBirthdayScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBirthday()) {
        setBirthday(other.birthday);
      }
      return this;
    }

    @Override
    public SetGameplayBirthdayScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      birthday = 0;
      return this;
    }

    @Override
    public SetGameplayBirthdayScRsp clearQuick() {
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
      if (!(o instanceof SetGameplayBirthdayScRsp)) {
        return false;
      }
      SetGameplayBirthdayScRsp other = (SetGameplayBirthdayScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBirthday() || birthday == other.birthday);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(birthday);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(birthday);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetGameplayBirthdayScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // birthday
            birthday = input.readUInt32();
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.birthday, birthday);
      }
      output.endObject();
    }

    @Override
    public SetGameplayBirthdayScRsp mergeFrom(final JsonSource input) throws IOException {
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
          case 1069376125: {
            if (input.isAtField(FieldNames.birthday)) {
              if (!input.trySkipNullValue()) {
                birthday = input.readUInt32();
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
    public SetGameplayBirthdayScRsp clone() {
      return new SetGameplayBirthdayScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetGameplayBirthdayScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetGameplayBirthdayScRsp(), data).checkInitialized();
    }

    public static SetGameplayBirthdayScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetGameplayBirthdayScRsp(), input).checkInitialized();
    }

    public static SetGameplayBirthdayScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetGameplayBirthdayScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetGameplayBirthdayScRsp messages
     */
    public static MessageFactory<SetGameplayBirthdayScRsp> getFactory() {
      return SetGameplayBirthdayScRspFactory.INSTANCE;
    }

    private enum SetGameplayBirthdayScRspFactory implements MessageFactory<SetGameplayBirthdayScRsp> {
      INSTANCE;

      @Override
      public SetGameplayBirthdayScRsp create() {
        return SetGameplayBirthdayScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName birthday = FieldName.forField("birthday");
    }
  }
}
