// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v1.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string node = 1;</code>
   * @return The node.
   */
  java.lang.String getNode();
  /**
   * <code>string node = 1;</code>
   * @return The bytes for node.
   */
  com.google.protobuf.ByteString
      getNodeBytes();

  /**
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>uint32 qos = 3;</code>
   * @return The qos.
   */
  int getQos();

  /**
   * <code>string from = 4;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 4;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>string topic = 5;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 5;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>bytes payload = 6;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();

  /**
   * <code>uint64 timestamp = 7;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
