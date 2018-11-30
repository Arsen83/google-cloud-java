// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

public interface CreateClusterMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.CreateClusterMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The request that prompted the initiation of this CreateCluster operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateClusterRequest original_request = 1;</code>
   */
  boolean hasOriginalRequest();
  /**
   *
   *
   * <pre>
   * The request that prompted the initiation of this CreateCluster operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateClusterRequest original_request = 1;</code>
   */
  com.google.bigtable.admin.v2.CreateClusterRequest getOriginalRequest();
  /**
   *
   *
   * <pre>
   * The request that prompted the initiation of this CreateCluster operation.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.CreateClusterRequest original_request = 1;</code>
   */
  com.google.bigtable.admin.v2.CreateClusterRequestOrBuilder getOriginalRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   */
  boolean hasRequestTime();
  /**
   *
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   */
  com.google.protobuf.Timestamp getRequestTime();
  /**
   *
   *
   * <pre>
   * The time at which the original request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   */
  boolean hasFinishTime();
  /**
   *
   *
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   */
  com.google.protobuf.Timestamp getFinishTime();
  /**
   *
   *
   * <pre>
   * The time at which the operation failed or was completed successfully.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();
}
