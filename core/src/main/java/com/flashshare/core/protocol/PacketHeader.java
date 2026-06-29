package com.flashshare.core.protocol;

import java.util.UUID;

public record PacketHeader(
        int magic,
        short versionMajor,
        short versionMinor,
        PacketType type,
        UUID transferId,
        long sequence
) {}
