package org.jimmer.domain;

import org.babyfish.jimmer.sql.*;
import org.babyfish.jimmer.sql.meta.UUIDIdGenerator;
import org.jspecify.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_order")
public interface Order {

    @Id
    @GeneratedValue(generatorType = UUIDIdGenerator.class)
    @Column(sqlType = "varchar")
    UUID id();

    @IdView
    Long personId();

    @Nullable
    LocalDateTime createTime();

    @OneToMany(mappedBy = "order")
    List<OrderItem> items();

    @Nullable
    @ManyToOne
    Person person();
}
