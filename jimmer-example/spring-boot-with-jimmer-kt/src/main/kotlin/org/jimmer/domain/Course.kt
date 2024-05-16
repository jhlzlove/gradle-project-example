package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * 课程信息
 * @author jhlz
 * @since 2024/4/16 9:57
 * @version x.x.x
 */
@Entity
@Table(name = "db_course")
interface Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val courseId: Long

    /**
     * 课程名称不能重复
     */
    @Key
    val courseName: String

    val courseCode: String

    val createTime: LocalDateTime?

    @ManyToMany(mappedBy = "courseIds")
    val students: List<Student>

    @ManyToMany(mappedBy = "courses")
    val teachers: List<Teacher>
}