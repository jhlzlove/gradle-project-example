# quarkus-with-jimmer-kt

Quarkus 支持的注入方式和 Spring 是一样的。

> ![IMPORTANT]
> 虽然本例子使用了 repository 层，但是由于来回切较为麻烦，直接注入 sqlClient 到 resource 层。哪怕不是例子，我们也要学会活学活用

## 构建本机可执行文件

如果对 GraalVM 感兴趣，可以尝试使用以下命令：

```bash
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=false
```
