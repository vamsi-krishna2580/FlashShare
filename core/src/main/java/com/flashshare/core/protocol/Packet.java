package com.flashshare.core.protocol;

public record Packet(
        PacketHeader header,
        byte[] payload
) {}
