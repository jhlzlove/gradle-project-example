# Overview

- jimmer-example

> [!IMPORTANT]
> 除了 **quarkus-with-jimmer-kt** 外，其它 demo 都使用了 `db_jimmer` 数据库，SQL
> 脚本在 `jimmer-example/spring-boot-with-jimmer-kt` 中；
>
> Jimmer 案例中使用了 dto 语言，所以第一次打开时会有报错。创建数据库并运行指定的脚本后，使用 Gradle 或者 IDEA 集成的 Gradle
> 插件运行 build 命令，然后报错就会消失。

## Use Tools

| Tool Name                                              | Version |
|--------------------------------------------------------|---------|
| JDK                                                    | 21      |
| [Gradle](https://gradle.org)                           | 8.8     |
| [Kotlin](https://kotlinlang.org/)                      | 2.0     |
| [Jimmer](https://babyfish-ct.github.io/jimmer-doc/zh/) | 0.8.134 |
| [Spring Boot](https://spring.io/projects/spring-boot)  | 3.3.1   |
| [Quarkus](https://quarkus.io/)                         | 3.10.2  |
| [Postgresql](https://www.postgresql.org)               | 16.2+   |

> [!CAUTION]
> PG 的数据库不能为 user，这是内置关键字，建库时尽量避开关键字。让我看看是谁建表还用关键字 ~~好吧，看起来是我自己了~~。
