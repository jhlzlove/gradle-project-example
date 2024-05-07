package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.sql.*;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_dept")
public interface Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long deptId();

    String deptName();

    Long leaderId();

    Long roleId();
}
