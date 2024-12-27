package org.jimmer.service

import org.babyfish.jimmer.kt.isLoaded
import org.babyfish.jimmer.kt.new
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Course
import org.jimmer.domain.by
import org.springframework.stereotype.Service
import java.util.*

/**
 * 课程服务类
 * @author jhlz
 * @since 2024/4/15 18:53
 * @version x.x.x
 */
@Service
class CourseService(val sqlClient: KSqlClient) {

    /**
     * 添加或更新
     */
    fun addOrUpdateCourse(course: Course): Boolean {
        return when(isLoaded(course, Course::courseId)) {
            true -> sqlClient.save(course).isRowAffected
            false -> {
                val target = new(Course::class).by {
                    courseCode = UUID.randomUUID().toString().replace("-", "")
                    courseName = course.courseName
                }
                sqlClient.save(target).isRowAffected
            }
        }
    }

    fun getInfo(id: Long): Course? {
        return sqlClient.findById(Course::class, id)
    }

    /**
     * 删除
     */
    fun delete(id: Long): Int {
        return sqlClient.deleteById(Course::class, id).totalAffectedRowCount
    }
}