package org.jimmer.jimmerdatasouce.domain;

import jakarta.annotation.Nullable;
import org.babyfish.jimmer.sql.*;

import java.time.LocalDateTime;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "db_author")
public interface Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();

    String username();

    int age();

    String gender();

    @Nullable
    String address();

    LocalDateTime createTime();
    LocalDateTime updateTime();
    String createBy();
    @Nullable
    String updateBy();
}
