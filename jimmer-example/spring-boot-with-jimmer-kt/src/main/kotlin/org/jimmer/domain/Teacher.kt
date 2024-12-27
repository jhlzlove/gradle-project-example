package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_teacher")
interface Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val teacherId: Long

    val teacherName: String

    /**
     * 教师资格证编号不能重复
     */
    @Key
    val teacherCode: String

    val remark: String?

    val createTime: LocalDateTime?

    @LogicalDeleted("1")
    @Column(name = "is_delete")
    val delete: Int

    @ManyToMany
    @JoinTable(
        name = "db_teacher_course",
        joinColumnName = "teacher_id",
        inverseJoinColumnName = "course_id",
    )
    val  courses : List<Course>
}