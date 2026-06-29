package com.flashshare.protocol;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PacketTest {

    @Test
    void packetSerializationTest() {

        PacketHeader header = new PacketHeader(
                ProtocolConstants.MAGIC_NUMBER,
                ProtocolVersion.MAJOR,
                ProtocolVersion.MINOR,
                PacketType.FILE_INFO,
                UUID.randomUUID(),
                12345L
        );

        Packet original = new Packet(
                header,
                "Hello FlashShare".getBytes(StandardCharsets.UTF_8)
        );

        byte[] bytes = PacketWriter.write(original);

        Packet restored = PacketReader.read(bytes);

        assertEquals(original.header().magic(), restored.header().magic());
        assertEquals(original.header().versionMajor(), restored.header().versionMajor());
        assertEquals(original.header().versionMinor(), restored.header().versionMinor());
        assertEquals(original.header().type(), restored.header().type());
        assertEquals(original.header().transferId(), restored.header().transferId());
        assertEquals(original.header().sequence(), restored.header().sequence());
        assertArrayEquals(original.payload(), restored.payload());
    }
}
