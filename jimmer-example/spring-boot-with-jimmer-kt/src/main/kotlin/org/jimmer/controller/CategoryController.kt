package org.jimmer.controller

import org.babyfish.jimmer.kt.isLoaded
import org.babyfish.jimmer.kt.new
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.isNull
import org.jimmer.domain.Category
import org.jimmer.domain.by
import org.jimmer.domain.fetchBy
import org.jimmer.domain.parentId
import org.springframework.web.bind.annotation.*
import java.time.Instant

/**
 * @author jhlz
 * @version x.x.x
 */
@RequestMapping("/category")
@RestController
class CategoryController(
    val sqlClient: KSqlClient
) {

    @PostMapping("/add")
    fun save(@RequestBody category: Category) {
        if (isLoaded(category, Category::id)) {
            sqlClient.save(category)
            return
        }

        val target = new(Category::class).by {
            name = category.name
            code = Instant.now().toEpochMilli().toString()
            // 传值就设置，没有就不设置
            parentId = when (isLoaded(category, Category::parentId)) {
                true -> category.parentId
                false -> null
            }
        }
        sqlClient.save(target)
    }

    @GetMapping("/list")
    fun categoryList(): List<Category> {
        val list = sqlClient.createQuery(Category::class) {
            where(table.parentId.isNull())
            select(table.fetchBy {
                allScalarFields()
                // kotlin 的递归写法
                `childs*`()
            })
        }.execute()
        return list
    }
}