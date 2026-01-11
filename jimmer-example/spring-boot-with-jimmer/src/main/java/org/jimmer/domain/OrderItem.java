package org.jimmer.domain;

import org.babyfish.jimmer.sql.*;
import org.babyfish.jimmer.sql.meta.UUIDIdGenerator;
import org.jspecify.annotations.Nullable;

import java.util.UUID;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_order_item")
public interface OrderItem {
    @Id
    @GeneratedValue(generatorType = UUIDIdGenerator.class)
    @Column(sqlType = "varchar")
    UUID id();

    @IdView
    long productId();

    long productNum();

    @ManyToOne
    @Nullable
    Order order();

    @OneToOne
    Product product();
}
