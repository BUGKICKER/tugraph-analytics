/*
 * Copyright 2023 AntGroup CO., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics.proto

package com.antgroup.geaflow.rpc.proto;

public final class Metrics {
  private Metrics() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MetricQueryRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MetricQueryRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code MetricQueryRequest}
   */
  public static final class MetricQueryRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MetricQueryRequest)
      MetricQueryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MetricQueryRequest.newBuilder() to construct.
    private MetricQueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MetricQueryRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MetricQueryRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MetricQueryRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.class, com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest)) {
        return super.equals(obj);
      }
      com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest other = (com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest) obj;

      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MetricQueryRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MetricQueryRequest)
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.class, com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryRequest_descriptor;
      }

      @java.lang.Override
      public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest getDefaultInstanceForType() {
        return com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.getDefaultInstance();
      }

      @java.lang.Override
      public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest build() {
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest buildPartial() {
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest result = new com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest) {
          return mergeFrom((com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest other) {
        if (other == com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MetricQueryRequest)
    }

    // @@protoc_insertion_point(class_scope:MetricQueryRequest)
    private static final com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest();
    }

    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MetricQueryRequest>
        PARSER = new com.google.protobuf.AbstractParser<MetricQueryRequest>() {
      @java.lang.Override
      public MetricQueryRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MetricQueryRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MetricQueryRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricQueryRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MetricQueryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MetricQueryResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes payload = 1;</code>
     * @return The payload.
     */
    com.google.protobuf.ByteString getPayload();
  }
  /**
   * Protobuf type {@code MetricQueryResponse}
   */
  public static final class MetricQueryResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MetricQueryResponse)
      MetricQueryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MetricQueryResponse.newBuilder() to construct.
    private MetricQueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MetricQueryResponse() {
      payload_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MetricQueryResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MetricQueryResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {

              payload_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.class, com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.Builder.class);
    }

    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString payload_;
    /**
     * <code>bytes payload = 1;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!payload_.isEmpty()) {
        output.writeBytes(1, payload_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, payload_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse)) {
        return super.equals(obj);
      }
      com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse other = (com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse) obj;

      if (!getPayload()
          .equals(other.getPayload())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MetricQueryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MetricQueryResponse)
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.class, com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.Builder.class);
      }

      // Construct using com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        payload_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.antgroup.geaflow.rpc.proto.Metrics.internal_static_MetricQueryResponse_descriptor;
      }

      @java.lang.Override
      public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse getDefaultInstanceForType() {
        return com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse build() {
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse buildPartial() {
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse result = new com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse(this);
        result.payload_ = payload_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse) {
          return mergeFrom((com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse other) {
        if (other == com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse.getDefaultInstance()) return this;
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes payload = 1;</code>
       * @return The payload.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>bytes payload = 1;</code>
       * @param value The payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes payload = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayload() {
        
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MetricQueryResponse)
    }

    // @@protoc_insertion_point(class_scope:MetricQueryResponse)
    private static final com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse();
    }

    public static com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MetricQueryResponse>
        PARSER = new com.google.protobuf.AbstractParser<MetricQueryResponse>() {
      @java.lang.Override
      public MetricQueryResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MetricQueryResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MetricQueryResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricQueryResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.antgroup.geaflow.rpc.proto.Metrics.MetricQueryResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MetricQueryRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MetricQueryRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MetricQueryResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MetricQueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmetrics.proto\032\033google/protobuf/empty.p" +
      "roto\"\024\n\022MetricQueryRequest\"&\n\023MetricQuer" +
      "yResponse\022\017\n\007payload\030\001 \001(\0142L\n\rMetricServ" +
      "ice\022;\n\014queryMetrics\022\023.MetricQueryRequest" +
      "\032\024.MetricQueryResponse\"\000B\"\n\036com.antgroup" +
      ".geaflow.rpc.protoP\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_MetricQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MetricQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MetricQueryRequest_descriptor,
        new java.lang.String[] { });
    internal_static_MetricQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MetricQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MetricQueryResponse_descriptor,
        new java.lang.String[] { "Payload", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}