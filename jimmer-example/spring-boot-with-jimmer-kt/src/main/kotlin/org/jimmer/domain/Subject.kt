package org.jimmer.domain

import org.babyfish.jimmer.sql.*
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_subject")
interface Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    @IdView
    val parentId: Long?
    @Key
    val name: String
    val code: String
    val createTime: LocalDateTime?

    @LogicalDeleted("1")
    @Column(name = "is_delete")
    val delete: Int


    /**
     * 自关联的树
     */
    @ManyToOne
    @JoinColumn( foreignKeyType = ForeignKeyType.FAKE)
    val parent: Subject?
    @OneToMany(mappedBy = "parent")
    val childs: List<Subject>

    @ManyToMany
    @JoinTable(
        name = "db_subject_course",
        joinColumnName = "subject_id",
        inverseJoinColumnName = "course_id",
    )
    val courses: List<Course>
}