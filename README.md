# gradle-project-example

## env

- jdk25
- gradle9

## dir

```bash
 .
├──  base-code                         # 基础代码
├──  http                              # idea http 请求文件
├──  jimmer-example                    # jimmer example
│   ├──  jimmer-simple-kt              # 最简单的 jimmer example
│   ├──  spring-boot-with-jimmer       # java jimmer spring boot
│   ├──  spring-boot-with-jimmer-kt    # kotlin jimmer spring boot
├──  sb-4                              # spring boot 4 test
├──  script                            # 脚本文件
│   └──  sql
```

## db init

如果不想使用 [dbmate](https://github.com/amacneil/dbmate)，可以手动建库：`db_jimmer`、`db_test`，然后复制 `script/sql/db/*schema.sql` 文件中的内容到 SQL 编辑器中运行。

如果使用 dbmate，修改 `script/sql/.env` 中的连接信息为本机的实际信息，然后执行以下命令：

```bash
cd script/sql
dbmate create
dbmate load

dbmate -e DB_TEST create
dbmate -s db/db_test_schema.sql load
```

之后就可以运行相关应用啦~ 程序启动之后可以运行 http 目录下的脚本（Jetbrains IDEA 支持），或者你也可以用其它 API 测试工具

## notice

- jimmer example 中使用了 dto 语言，所以第一次打开时会有报错，这是正常现象，使用 gradle 或者 IDE build 后报错就会消失。
