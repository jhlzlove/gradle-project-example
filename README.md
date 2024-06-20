# Overview

Gradle example

include：

- jimmer-example

> [!IMPORTANT]
> 除了 **quarkus-with-jimmer-kt** 外，其它 demo 都使用了 `db_jimmer` 数据库，SQL
> 脚本在 `jimmer-example/spring-boot-with-jimmer-kt` 中；
>
> Jimmer 案例中使用了 dto 语言，所以第一次打开时会有报错。创建数据库并运行指定的脚本后，使用 Gradle 或者 IDEA 集成的 Gradle
> 插件运行 build 命令，然后报错就会消失。

## Use Tools

- JDK 21+
- Gradle 8.7+
- Kotlin 1.9.23
- [Jimmer](https://babyfish-ct.github.io/jimmer-doc/zh/) 0.8.130+
- Spring Boot 3.x+
- Postgresql 16.x+

> [!CAUTION]
> PG 的数据库不能为 user，这是内置关键字，建库时尽量避开关键字。让我看看是谁建表还用关键字 ~~好吧，看起来是我自己了~~。
