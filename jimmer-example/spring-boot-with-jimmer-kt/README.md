# 使用 jimmer spring boot starter 的 demo

## 说明

本案例直接使用 Jimmer 提供的强大的 `sqlClient`，省略了 Repository 层和 Service 接口层。

## 其它

打开 Postgresql 客户端，创建一个新的数据库，名为 `db_jimmer`（如果不叫这个名字，请修改对应项目的 `application.yml` 配置），然后执行 `sql` 文件夹下的 sql 文件，启动本项目进行测试。

> [!IMPORTANT]
> - Jimmer 的 Spring Boot Starter 做了 Spring [事务整合](https://babyfish-ct.gitee.io/jimmer-doc/docs/spring/transaction)，非常容易，如果使用的不是 `org.babyfish.jimmer:jimmer-spring-boot-starter`，则需要自行整合事务。
> - 如果使用 Jimmer Spring Boot Starter，会自动注册 Jackson 的 ImmutableModule，无需用户关注。
> - Jimmer 高度依赖 JVM 生态的预编译技术，Java 语言使用 apt，Kotlin 语言使用 ksp，所以如果使用 Kotlin 的话需要引入 KSP。
> - Kotlin 语言开发使用 Gradle，Maven 会出现很多问题。
