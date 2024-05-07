package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.sql.*;

import java.time.LocalDateTime;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_role")
public interface Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long roleId();

    String roleCode();

    String roleName();

    LocalDateTime createDatetime();

    LocalDateTime updateDatetime();

    String remark();

    int status();
}
