package com.flashshare.protocol;

public enum PacketType {
    DISCOVER,
    DISCOVER_RESPONSE,
    CONNECT,
    ACCEPT,
    REJECT,
    FILE_INFO,
    CHUNK,
    ACK,
    RESUME,
    COMPLETE,
    CANCEL,
    ERROR,
    PING,
    PONG
}
