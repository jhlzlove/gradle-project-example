package org.jimmer.service

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.kt.new
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.jimmer.domain.*
import org.jimmer.domain.dto.TeacherInput
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.util.*

/**
 * @author jhlz
 * @version x.x.x
 */
@Service
class TeacherService(val sqlClient: KSqlClient) {

    fun page(): Page<Teacher> {
        return sqlClient.createQuery(Teacher::class) {
            where(table.delete eq 0)
            where(table.courses { delete eq 0 })
            select(table.fetchBy {
                teacherName()
                teacherCode()
                remark()
                courses {
                    courseName()
                    courseCode()
                }
            })
        }.fetchPage(0, 10)
    }

    @Transactional
    fun add(teacher: TeacherInput): Boolean {
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
        return sqlClient.save(target).isRowAffected
        // 由于本示例中 Course 实体使用 @Key 修饰了 courseName，Jimmer 会自动检查数据库是否有重复的 courseName
        // 如果有，则不执行任何操作，没有就添加
        // sqlClient.save(target) {setAssociatedMode(TeacherProps.COURSES, AssociatedSaveMode.MERGE)}
    }
}