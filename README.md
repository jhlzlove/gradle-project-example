# gradle-project-example

## 结构

```bash
├── base-code                                       # 基础代码模块
├── docs                                            # 文档模块
├── jimmer-example                                  # jimmer 案例模块
│   ├── jimmer-simple-kt                            # 最简单的 jimmer 示例模块
│   ├── quarkus-with-jimmer-kt                      # quarkus + jimmer 示例模块
│   ├── spring-boot-with-jimmer-kt                  
│   ├── spring-boot-with-jimmer-multiple-datasource # jimmer 多数据源示例模块
```

> [!NOTE]
> 以 **-kt** 结尾的使用的 Kotlin，不带的为 Java。

| 目录             | 说明          |
|----------------|-------------|
| base-code      | 基础联系代码      |
| jimmer-example | jimmer 示例代码 |

## 注意事项

- 如何使用请参照各个模块的 `README.md` 文件。
- PG 的数据库不能为 user，这是内置关键字，建库时尽量避开关键字。让我看看是谁建表还用关键字 ~~好吧，看起来是我自己了~~。
- 导入 SQL 文件时，数据库名名称需要与 sql 文件名相同(全量的 sql 脚本)，或者自行修改；
- Jimmer 案例中使用了 dto 语言，所以第一次打开时会有报错。创建数据库并运行指定的脚本后，使用 Gradle 或者 IDEA 集成的 Gradle 插件运行 build 命令，然后报错就会消失。
