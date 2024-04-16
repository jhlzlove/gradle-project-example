package org.example.org.example.service

import org.babyfish.jimmer.kt.new
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.example.org.example.domain.Course
import org.example.org.example.domain.by
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant

/**
 * 课程服务类
 * @author jhlz
 * @since 2024/4/15 18:53
 * @version x.x.x
 */
@Service
class CourseService @Autowired constructor(val sqlClient: KSqlClient) {

    /**
     * 添加或更新
     */
    fun addOrUpdateCourse(course: Course): Course {
        sqlClient.findById(Course::class, course.courseId)?.let {
            return sqlClient.save(course).originalEntity
        }
        val target = new(Course::class).by {
            courseCode = Instant.now().toEpochMilli().toString()
            courseName = course.courseName
        }
        return sqlClient.save(target).originalEntity
    }

    fun getCourseById(id: Long): Course? {
        return sqlClient.findById(Course::class, id)
    }

    /**
     * 删除
     */
    fun deleteCourse(id: Long): Int {
        return sqlClient.deleteById(Course::class, id).totalAffectedRowCount
    }
}