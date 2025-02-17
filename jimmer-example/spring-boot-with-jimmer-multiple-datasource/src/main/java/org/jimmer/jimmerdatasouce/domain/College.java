package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.sql.*;

import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_college")
public interface College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();

    @Key
    String collegeName();

    @OneToMany(mappedBy = "college")
    List<Student> students();
}
