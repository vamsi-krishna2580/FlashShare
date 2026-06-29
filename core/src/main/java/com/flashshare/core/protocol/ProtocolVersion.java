package com.flashshare.core.protocol;

public final class ProtocolVersion {
    public static final short MAJOR = 1;
    public static final short MINOR = 0;

    private ProtocolVersion() {}

    public static String getVersion() {
        return MAJOR + "." + MINOR;
    }
}
