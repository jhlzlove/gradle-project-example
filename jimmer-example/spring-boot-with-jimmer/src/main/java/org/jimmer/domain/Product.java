package org.jimmer.domain;

import org.babyfish.jimmer.sql.*;
import org.jspecify.annotations.Nullable;

import java.math.BigDecimal;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_product")
public interface Product extends ID {

    @Key
    String proName();

    String code();

    @IdView
    Long categoryId();

    @Nullable
    @ManyToOne
    Category category();

    @Nullable
    Long stockNum();

    @Nullable
    BigDecimal price();
}
