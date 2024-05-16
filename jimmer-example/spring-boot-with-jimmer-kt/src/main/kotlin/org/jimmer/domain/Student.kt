package org.jimmer.domain;

import org.babyfish.jimmer.Formula
import org.babyfish.jimmer.sql.*

/**
 * 学生信息
 * @author jhlz
 * @since 2024/4/16 9:54
 * @version x.x.x
 */
@Entity
@Table(name = "db_student")
interface Student : BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long

    val firstName: String

    val lastName: String

    val gender: Gender

    /**
     * 简单计算属性，获取全名
     */
    @Formula(dependencies = ["firstName", "lastName"])
    val fullName: String get() = "$firstName$lastName"

    @ManyToMany
    @JoinTable(
        name = "db_stu_course",
        joinColumnName = "student_id",
        inverseJoinColumnName = "course_id",
    )
    val courseIds: List<Course>
}