package com.flashshare.protocol;

import java.nio.ByteBuffer;

public final class PacketReader {

    private PacketReader(){}

    public static Packet read(byte[] bytes){

        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        int magic = buffer.getInt();

        short major = buffer.getShort();

        short minor = buffer.getShort();

        PacketType type = PacketType.values()[buffer.getShort()];

        buffer.getShort();

        var uuid = ByteBufferUtils.getUUID(buffer);

        long sequence = buffer.getLong();

        int payloadLength = buffer.getInt();

        byte[] payload = new byte[payloadLength];

        buffer.get(payload);

        PacketHeader header = new PacketHeader(
                magic,
                major,
                minor,
                type,
                uuid,
                sequence
        );

        return new Packet(header,payload);
    }
}
