package com.flashshare.protocol;

public final class ProtocolConstants {

    public static final int MAGIC_NUMBER = 0x46534852; // FSHR

    public static final int DEFAULT_CHUNK_SIZE = 4 * 1024 * 1024;

    public static final int HEADER_SIZE = 40;

    private ProtocolConstants() {}
}
