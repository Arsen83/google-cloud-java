// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface UpdateJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.UpdateJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 2;</code>
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 2;</code>
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. The job ID.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * Required. The job ID.
   * </pre>
   *
   * <code>string job_id = 3;</code>
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The changes to the job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 4;</code>
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The changes to the job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 4;</code>
   */
  com.google.cloud.dataproc.v1.Job getJob();
  /**
   *
   *
   * <pre>
   * Required. The changes to the job.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Job job = 4;</code>
   */
  com.google.cloud.dataproc.v1.JobOrBuilder getJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to &lt;code&gt;Job&lt;/code&gt;, of
   * the field to update. For example, to update the labels of a Job the
   * &lt;code&gt;update_mask&lt;/code&gt; parameter would be specified as
   * &lt;code&gt;labels&lt;/code&gt;, and the `PATCH` request body would specify the new
   * value. &lt;strong&gt;Note:&lt;/strong&gt; Currently, &lt;code&gt;labels&lt;/code&gt; is the only
   * field that can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to &lt;code&gt;Job&lt;/code&gt;, of
   * the field to update. For example, to update the labels of a Job the
   * &lt;code&gt;update_mask&lt;/code&gt; parameter would be specified as
   * &lt;code&gt;labels&lt;/code&gt;, and the `PATCH` request body would specify the new
   * value. &lt;strong&gt;Note:&lt;/strong&gt; Currently, &lt;code&gt;labels&lt;/code&gt; is the only
   * field that can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to &lt;code&gt;Job&lt;/code&gt;, of
   * the field to update. For example, to update the labels of a Job the
   * &lt;code&gt;update_mask&lt;/code&gt; parameter would be specified as
   * &lt;code&gt;labels&lt;/code&gt;, and the `PATCH` request body would specify the new
   * value. &lt;strong&gt;Note:&lt;/strong&gt; Currently, &lt;code&gt;labels&lt;/code&gt; is the only
   * field that can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 5;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
