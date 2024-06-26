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

    @LogicalDeleted("1")
    val isDelete: Int

    @ManyToMany
    @JoinTable(
        name = "db_stu_course",
        joinColumnName = "student_id",
        inverseJoinColumnName = "course_id",
        // 若中间表也有逻辑删除字段，则修改这里
        // logicalDeletedFilter = JoinTable.LogicalDeletedFilter(columnName = "is_delete", type = Int::class, value = "1", initializedValue = "0"),
        // 开启此项，若逻辑删除实体具有中间表，则被逻辑删除实体相关的中间表记录会被物理删除。
        deletedWhenEndpointIsLogicallyDeleted = true
    )
    val courseIds: List<Course>
}