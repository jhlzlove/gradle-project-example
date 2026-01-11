package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_score")
interface Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val studentId: Long

    // val courseId: Long
    //
    // val score: String
    //
    // @ManyToOne
    // val student: Student?
    //
    // @ManyToOne
    // val course: Course?
}