# 使用 jimmer spring boot starter 的 demo

打开 Postgresql 客户端，创建一个新的数据库，名为 `db_jimmer`（如果不叫这个名字，请修改对应项目的 `application.yml` 配置），然后执行 `sql` 文件夹下的 sql 文件，启动本项目进行测试。

> [!IMPORTANT]
> - Jimmer 的 Spring Boot Starter 做了 Spring [事务整合](https://babyfish-ct.gitee.io/jimmer-doc/docs/spring/transaction)，非常容易，如果使用的不是 `org.babyfish.jimmer:jimmer-spring-boot-starter`，则需要自行整合事务。
> - 如果使用 Jimmer Spring Boot Starter，会自动注册 Jackson 的 ImmutableModule，无需用户关注。
