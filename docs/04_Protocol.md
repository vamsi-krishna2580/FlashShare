# FlashShare Protocol v1.0

## Overview

FlashShare Protocol (FSP) is a custom binary protocol designed for high-speed,
secure, resumable, cross-platform file transfer.

Goals

- High performance
- Low overhead
- Cross-platform
- Secure
- Resumable
- Extensible

---

## Communication Flow

Discovery

↓

Handshake

↓

Authentication

↓

File Metadata

↓

Chunk Transfer

↓

Verification

↓

Complete

---

## Packet Types

DISCOVER

DISCOVER_RESPONSE

CONNECT

ACCEPT

REJECT

FILE_INFO

CHUNK

ACK

RESUME

CANCEL

PING

PONG

ERROR

COMPLETE

---

## Version

Protocol Version : 1.0