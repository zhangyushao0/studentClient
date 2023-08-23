# 前端

## 拉取

```bash
git clone https://github.com/zhangyushao0/studentClient.git
```

## 介绍

后端接口在

```bash
target/generated-sources/protobuf
```

下

## 生成接口

```bash
src/main/proto
```

下对接口和消息作出了定义，例如 student.proto，定义了学生的接口和消息。
需要先使用 grpc 的编译器，例如使用终端的命令

```bash
mvn clean compile
```

或者 IDE 中也有图形化选项，将 student.proto 编译成 java 文件，生成的文件在

```bash
target/generated-sources/protobuf/grpc-java/com/studentDemo/
```

下。然后就可以仿照 client 中的例子，使用接口了。
