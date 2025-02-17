package org.jimmer.domain

import org.babyfish.jimmer.sql.*

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_college")
interface College {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    val id: Long

    @Key
    val collegeName: String

    @OneToMany(mappedBy = "college")
    val students: List<Student>
}