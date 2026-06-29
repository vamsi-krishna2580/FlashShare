package com.flashshare.protocol;

import java.nio.ByteBuffer;

public final class PacketWriter {

    private PacketWriter(){}

    public static byte[] write(Packet packet){

        byte[] payload = packet.payload();

        ByteBuffer buffer = ByteBuffer.allocate(
                ProtocolConstants.HEADER_SIZE + payload.length
        );

        PacketHeader h = packet.header();

        buffer.putInt(h.magic());
        buffer.putShort(h.versionMajor());
        buffer.putShort(h.versionMinor());
        buffer.putShort((short)h.type().ordinal());
        buffer.putShort((short)0);

        ByteBufferUtils.putUUID(buffer,h.transferId());

        buffer.putLong(h.sequence());

        buffer.putInt(payload.length);

        buffer.put(payload);

        return buffer.array();
    }
}
