// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student/student.proto

package com.studentDemo.student;

public final class studentProto {
  private studentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025student/student.proto\"\034\n\016StudentReques" +
      "t\022\n\n\002id\030\001 \001(\t\"+\n\017StudentResponse\022\n\n\002id\030\001" +
      " \001(\t\022\014\n\004name\030\002 \001(\t2G\n\016StudentService\0225\n\016" +
      "getStudentInfo\022\017.StudentRequest\032\020.Studen" +
      "tResponse\"\000B)\n\027com.studentDemo.studentB\014" +
      "studentProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentResponse_descriptor,
        new java.lang.String[] { "Id", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}