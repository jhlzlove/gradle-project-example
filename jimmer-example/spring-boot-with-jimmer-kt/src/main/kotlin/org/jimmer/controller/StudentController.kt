package org.jimmer.controller

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.client.FetchBy
import org.babyfish.jimmer.client.meta.DefaultFetcherOwner
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.StudentFetchers
import org.jimmer.StudentFetchers.Companion.STUDENT_INFO
import org.jimmer.domain.Student
import org.jimmer.domain.fetchBy
import org.springframework.web.bind.annotation.*
import java.time.Instant

/**
 * @author jhlz
 * @since 2024/4/16 10:02
 * @version x.x.x
 */
@RestController
@RequestMapping("/student")
@DefaultFetcherOwner(StudentFetchers::class)
class StudentController(val sqlClient: KSqlClient) {

    /**
     * 添加学生信息（并且直接添加课程和学院，相当于长关联）
     */
    @PostMapping
    fun add(@RequestBody student: Student): Student {

        println("source $student")
        // 接收到的参数需要修改后入库
        val target = Student(student) {
            courses().forEach {
                it.courseCode = Instant.now().toEpochMilli().toString()
            }
        }

        println("target = $target")
        return sqlClient.save(target).modifiedEntity
    }

    /**
     * 更新学生信息
     */
    @PutMapping
    fun update(@RequestBody student: Student) = sqlClient.save(student).modifiedEntity.id

    @GetMapping("/list")
    fun list() = sqlClient.createQuery(Student::class) {
        select(
            table.fetchBy {
                allScalarFields()
                courses {
                    courseName()
                }
                college {
                    collegeName()
                }
            }
        )
    }.execute()

    /**
     * 分页获取，这种写法将会生成对应的客户端代码，结构和后端定义代码一致供前端小伙伴使用
     *
     * 默认起始页是 0
     */
    @GetMapping("/page")
    fun page(
        @RequestParam(required = false, defaultValue = "0") pageIndex: Int,
        @RequestParam(required = false, defaultValue = "10") pageSize: Int
    ): Page<@FetchBy("STUDENT_INFO") Student> {
        return sqlClient.createQuery(Student::class) {
            select(table.fetch(STUDENT_INFO))
        }.fetchPage(pageIndex, pageSize)
    }

    /**
     * 删除将会使用逻辑删除
     */
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = sqlClient.deleteById(Student::class, id)
}