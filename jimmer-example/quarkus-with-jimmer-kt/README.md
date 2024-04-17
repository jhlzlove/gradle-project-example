# quarkus-with-jimmer-kt

## 构建运行

创建名为 `quarkus_jimmer` 的数据库（如果名称不一样，则需要修改 `application.properties` 文件），执行 sql 文件夹下的脚本文件，然后启动项目进行测试。

## 构建本机可执行文件

如果对 GraalVM 感兴趣，可以尝试使用以下命令：

```bash
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=false
```
