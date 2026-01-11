package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * 课程信息
 * @author jhlz
 * @since 2024/4/16 9:57
 * @version x.x.x
 */
@Entity
interface Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    /**
     * 课程名称不能重复
     */
    @Key
    val courseName: String

    /**
     * code 只是用来演示修改
     */
    val courseCode: String

    /**
     * 与学生的关系
     */
    @ManyToMany(mappedBy = "courses")
    val students: List<Student>
}