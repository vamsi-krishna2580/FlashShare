package com.flashshare.protocol;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public final class ByteBufferUtils {

    private ByteBufferUtils(){}

    public static void putUUID(ByteBuffer buffer, UUID uuid){
        buffer.putLong(uuid.getMostSignificantBits());
        buffer.putLong(uuid.getLeastSignificantBits());
    }

    public static UUID getUUID(ByteBuffer buffer){
        return new UUID(buffer.getLong(), buffer.getLong());
    }

    public static void putString(ByteBuffer buffer, String value){
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        buffer.putInt(bytes.length);
        buffer.put(bytes);
    }

    public static String getString(ByteBuffer buffer){
        int length = buffer.getInt();
        byte[] bytes = new byte[length];
        buffer.get(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
