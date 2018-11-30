// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Response for the `ListSnapshots` method.&lt;br&gt;&lt;br&gt;
 * &lt;b&gt;ALPHA:&lt;/b&gt; This feature is part of an alpha release. This API might be
 * changed in backward-incompatible ways and is not recommended for production
 * use. It is not subject to any SLA or deprecation policy.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ListSnapshotsResponse}
 */
public final class ListSnapshotsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ListSnapshotsResponse)
    ListSnapshotsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSnapshotsResponse.newBuilder() to construct.
  private ListSnapshotsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSnapshotsResponse() {
    snapshots_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListSnapshotsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                snapshots_ = new java.util.ArrayList<com.google.pubsub.v1.Snapshot>();
                mutable_bitField0_ |= 0x00000001;
              }
              snapshots_.add(
                  input.readMessage(com.google.pubsub.v1.Snapshot.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        snapshots_ = java.util.Collections.unmodifiableList(snapshots_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ListSnapshotsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ListSnapshotsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ListSnapshotsResponse.class,
            com.google.pubsub.v1.ListSnapshotsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SNAPSHOTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.pubsub.v1.Snapshot> snapshots_;
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  public java.util.List<com.google.pubsub.v1.Snapshot> getSnapshotsList() {
    return snapshots_;
  }
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  public java.util.List<? extends com.google.pubsub.v1.SnapshotOrBuilder>
      getSnapshotsOrBuilderList() {
    return snapshots_;
  }
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  public int getSnapshotsCount() {
    return snapshots_.size();
  }
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  public com.google.pubsub.v1.Snapshot getSnapshots(int index) {
    return snapshots_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The resulting snapshots.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
   */
  public com.google.pubsub.v1.SnapshotOrBuilder getSnapshotsOrBuilder(int index) {
    return snapshots_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more snapshot that match the
   * request; this value should be passed in a new `ListSnapshotsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more snapshot that match the
   * request; this value should be passed in a new `ListSnapshotsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < snapshots_.size(); i++) {
      output.writeMessage(1, snapshots_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < snapshots_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, snapshots_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.pubsub.v1.ListSnapshotsResponse)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ListSnapshotsResponse other =
        (com.google.pubsub.v1.ListSnapshotsResponse) obj;

    boolean result = true;
    result = result && getSnapshotsList().equals(other.getSnapshotsList());
    result = result && getNextPageToken().equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSnapshotsCount() > 0) {
      hash = (37 * hash) + SNAPSHOTS_FIELD_NUMBER;
      hash = (53 * hash) + getSnapshotsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.ListSnapshotsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for the `ListSnapshots` method.&lt;br&gt;&lt;br&gt;
   * &lt;b&gt;ALPHA:&lt;/b&gt; This feature is part of an alpha release. This API might be
   * changed in backward-incompatible ways and is not recommended for production
   * use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ListSnapshotsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ListSnapshotsResponse)
      com.google.pubsub.v1.ListSnapshotsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListSnapshotsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ListSnapshotsResponse.class,
              com.google.pubsub.v1.ListSnapshotsResponse.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ListSnapshotsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSnapshotsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (snapshotsBuilder_ == null) {
        snapshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        snapshotsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ListSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListSnapshotsResponse getDefaultInstanceForType() {
      return com.google.pubsub.v1.ListSnapshotsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListSnapshotsResponse build() {
      com.google.pubsub.v1.ListSnapshotsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ListSnapshotsResponse buildPartial() {
      com.google.pubsub.v1.ListSnapshotsResponse result =
          new com.google.pubsub.v1.ListSnapshotsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (snapshotsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          snapshots_ = java.util.Collections.unmodifiableList(snapshots_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.snapshots_ = snapshots_;
      } else {
        result.snapshots_ = snapshotsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.ListSnapshotsResponse) {
        return mergeFrom((com.google.pubsub.v1.ListSnapshotsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ListSnapshotsResponse other) {
      if (other == com.google.pubsub.v1.ListSnapshotsResponse.getDefaultInstance()) return this;
      if (snapshotsBuilder_ == null) {
        if (!other.snapshots_.isEmpty()) {
          if (snapshots_.isEmpty()) {
            snapshots_ = other.snapshots_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSnapshotsIsMutable();
            snapshots_.addAll(other.snapshots_);
          }
          onChanged();
        }
      } else {
        if (!other.snapshots_.isEmpty()) {
          if (snapshotsBuilder_.isEmpty()) {
            snapshotsBuilder_.dispose();
            snapshotsBuilder_ = null;
            snapshots_ = other.snapshots_;
            bitField0_ = (bitField0_ & ~0x00000001);
            snapshotsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSnapshotsFieldBuilder()
                    : null;
          } else {
            snapshotsBuilder_.addAllMessages(other.snapshots_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.pubsub.v1.ListSnapshotsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.pubsub.v1.ListSnapshotsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.pubsub.v1.Snapshot> snapshots_ =
        java.util.Collections.emptyList();

    private void ensureSnapshotsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        snapshots_ = new java.util.ArrayList<com.google.pubsub.v1.Snapshot>(snapshots_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.Snapshot,
            com.google.pubsub.v1.Snapshot.Builder,
            com.google.pubsub.v1.SnapshotOrBuilder>
        snapshotsBuilder_;

    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public java.util.List<com.google.pubsub.v1.Snapshot> getSnapshotsList() {
      if (snapshotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(snapshots_);
      } else {
        return snapshotsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public int getSnapshotsCount() {
      if (snapshotsBuilder_ == null) {
        return snapshots_.size();
      } else {
        return snapshotsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public com.google.pubsub.v1.Snapshot getSnapshots(int index) {
      if (snapshotsBuilder_ == null) {
        return snapshots_.get(index);
      } else {
        return snapshotsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder setSnapshots(int index, com.google.pubsub.v1.Snapshot value) {
      if (snapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSnapshotsIsMutable();
        snapshots_.set(index, value);
        onChanged();
      } else {
        snapshotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder setSnapshots(int index, com.google.pubsub.v1.Snapshot.Builder builderForValue) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.set(index, builderForValue.build());
        onChanged();
      } else {
        snapshotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(com.google.pubsub.v1.Snapshot value) {
      if (snapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSnapshotsIsMutable();
        snapshots_.add(value);
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(int index, com.google.pubsub.v1.Snapshot value) {
      if (snapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSnapshotsIsMutable();
        snapshots_.add(index, value);
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(com.google.pubsub.v1.Snapshot.Builder builderForValue) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.add(builderForValue.build());
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder addSnapshots(int index, com.google.pubsub.v1.Snapshot.Builder builderForValue) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.add(index, builderForValue.build());
        onChanged();
      } else {
        snapshotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder addAllSnapshots(
        java.lang.Iterable<? extends com.google.pubsub.v1.Snapshot> values) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, snapshots_);
        onChanged();
      } else {
        snapshotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder clearSnapshots() {
      if (snapshotsBuilder_ == null) {
        snapshots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        snapshotsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public Builder removeSnapshots(int index) {
      if (snapshotsBuilder_ == null) {
        ensureSnapshotsIsMutable();
        snapshots_.remove(index);
        onChanged();
      } else {
        snapshotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public com.google.pubsub.v1.Snapshot.Builder getSnapshotsBuilder(int index) {
      return getSnapshotsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public com.google.pubsub.v1.SnapshotOrBuilder getSnapshotsOrBuilder(int index) {
      if (snapshotsBuilder_ == null) {
        return snapshots_.get(index);
      } else {
        return snapshotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public java.util.List<? extends com.google.pubsub.v1.SnapshotOrBuilder>
        getSnapshotsOrBuilderList() {
      if (snapshotsBuilder_ != null) {
        return snapshotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(snapshots_);
      }
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public com.google.pubsub.v1.Snapshot.Builder addSnapshotsBuilder() {
      return getSnapshotsFieldBuilder()
          .addBuilder(com.google.pubsub.v1.Snapshot.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public com.google.pubsub.v1.Snapshot.Builder addSnapshotsBuilder(int index) {
      return getSnapshotsFieldBuilder()
          .addBuilder(index, com.google.pubsub.v1.Snapshot.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The resulting snapshots.
     * </pre>
     *
     * <code>repeated .google.pubsub.v1.Snapshot snapshots = 1;</code>
     */
    public java.util.List<com.google.pubsub.v1.Snapshot.Builder> getSnapshotsBuilderList() {
      return getSnapshotsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.pubsub.v1.Snapshot,
            com.google.pubsub.v1.Snapshot.Builder,
            com.google.pubsub.v1.SnapshotOrBuilder>
        getSnapshotsFieldBuilder() {
      if (snapshotsBuilder_ == null) {
        snapshotsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.pubsub.v1.Snapshot,
                com.google.pubsub.v1.Snapshot.Builder,
                com.google.pubsub.v1.SnapshotOrBuilder>(
                snapshots_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        snapshots_ = null;
      }
      return snapshotsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more snapshot that match the
     * request; this value should be passed in a new `ListSnapshotsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more snapshot that match the
     * request; this value should be passed in a new `ListSnapshotsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more snapshot that match the
     * request; this value should be passed in a new `ListSnapshotsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more snapshot that match the
     * request; this value should be passed in a new `ListSnapshotsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more snapshot that match the
     * request; this value should be passed in a new `ListSnapshotsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ListSnapshotsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ListSnapshotsResponse)
  private static final com.google.pubsub.v1.ListSnapshotsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ListSnapshotsResponse();
  }

  public static com.google.pubsub.v1.ListSnapshotsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSnapshotsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSnapshotsResponse>() {
        @java.lang.Override
        public ListSnapshotsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListSnapshotsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListSnapshotsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSnapshotsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ListSnapshotsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
