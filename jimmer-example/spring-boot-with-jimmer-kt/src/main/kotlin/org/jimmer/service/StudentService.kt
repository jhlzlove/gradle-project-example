package org.jimmer.service

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.client.FetchBy
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.Fetchers
import org.jimmer.domain.Student
import org.springframework.stereotype.Service

/**
 * 学生服务类
 * @author jhlz
 * @since 2024/4/15 18:53
 * @version x.x.x
 */
@Service
class StudentService(val sqlClient: KSqlClient) {

    /**
     * 选课
     * 注意：这里没有中间表的实体，直接保存关联关系。只有在最简单的增量操作时使用
     */
    fun takeCourse(studentId: Long, courseId: Long) {
        sqlClient.getAssociations(Student::courses).save(studentId, courseId)
    }

    /**
     * 添加学生
     */
    fun add(student: Student): Student {
        return sqlClient.save(student).originalEntity
    }

    fun page(pageIndex: Int, pageSize: Int):
            Page<@FetchBy(value = "STUDENT_FETCH") Student> {
        return sqlClient.createQuery(Student::class) {
            select(table.fetch(Fetchers.STUDENT_FETCHER))
        }.fetchPage(pageIndex, pageSize)
    }

}