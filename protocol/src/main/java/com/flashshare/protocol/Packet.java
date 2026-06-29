package com.flashshare.protocol;

public record Packet(
        PacketHeader header,
        byte[] payload
) {}
