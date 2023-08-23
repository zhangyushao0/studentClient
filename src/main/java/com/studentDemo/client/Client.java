package com.studentDemo.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import com.studentDemo.student.StudentRequest;
import com.studentDemo.student.StudentResponse;
import com.studentDemo.student.StudentServiceGrpc;

public class Client {
    public static void main(String[] args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        StudentServiceGrpc.StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(channel);
        StudentResponse response = stub.getStudentInfo(StudentRequest.newBuilder()
                .setId("1")
                .build());
        System.out.println(response.getName());
        channel.shutdown();
    }
}
