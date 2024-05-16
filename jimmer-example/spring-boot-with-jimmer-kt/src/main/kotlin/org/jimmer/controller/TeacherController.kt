package org.example.org.jimmer.controller

import org.babyfish.jimmer.kt.new
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Teacher
import org.jimmer.domain.addBy
import org.jimmer.domain.by
import org.jimmer.domain.dto.TeacherInput
import org.jimmer.domain.dto.TeacherView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime
import java.util.*

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
@RequestMapping("/teacher")
class TeacherController @Autowired constructor(val sqlClient: KSqlClient) {

    /**
     * 由于教师编码使用了 @Key，倘若 编码 不变，修改了其它数据，那么保存会自动成为更新
     *
     * 更新时要注意 courses，如果 courses 也有变化，这个时候可能会出现 脱钩 操作，需要自己根据业务选择
     * 默认关联对象的插入策略是 REPLACE 模式，即替换
     * https://babyfish-ct.github.io/jimmer-doc/zh/docs/mutation/save-command/associated-save-mode
     */
    @PostMapping("/add")
    fun add(@RequestBody teacher: TeacherInput) {
        val target = new(Teacher::class).by {
            teacherCode = teacher.teacherCode
            teacherName = teacher.teacherName
            createTime = LocalDateTime.now()

            teacher.courses.forEach {
                courses().addBy {
                    courseName = it.courseName
                    courseCode = UUID.randomUUID().toString().replace("-", "")
                }
            }
        }
        sqlClient.save(target)
        // 由于本示例中 Course 实体使用 @Key 修饰了 courseName，Jimmer 会自动检查数据库是否有重复的 courseName
        // 如果有，则不执行任何操作，没有就添加
        // sqlClient.save(target) {setAssociatedMode(TeacherProps.COURSES, AssociatedSaveMode.MERGE)}
    }

    @GetMapping
    fun getList(): List<TeacherView> {
        val list = sqlClient.createQuery(Teacher::class) {
            // 通过 http 返回客户端的 DTO 尽量使用 Fetcher
            // 这里使用 Output DTO 只是一个示例，可以达到和 Fetcher 一样的效果
            select(table.fetch(TeacherView::class))
        }.execute()
        return list
    }

    @GetMapping("{id}")
    fun deleteTeacher(@PathVariable id: Long) {
        sqlClient.deleteById(Teacher::class, id)
    }
}