# 说明

该模块主要是个人编写的 [Jimmer](https://babyfish-ct.github.io/jimmer-doc/zh/) 的使用案例。

如何使用请参照各个模块的 `README.md` 文件。

## 注意事项

- PG 的数据库不能为 user，这是内置关键字，建库时尽量避开关键字。让我看看是谁建表还用关键字 ~~好吧，看起来是我自己了~~。
- 导入 SQL 文件时，数据库名名称需要与 sql 文件名相同(全量的 sql 脚本)，或者自行修改；
- Jimmer 案例中使用了 dto 语言，所以第一次打开时会有报错。创建数据库并运行指定的脚本后，使用 Gradle 或者 IDEA 集成的 Gradle 插件运行 build 命令，然后报错就会消失。
