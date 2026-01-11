package org.jimmer.domain;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;
import org.babyfish.jimmer.sql.OneToMany;
import org.babyfish.jimmer.sql.Table;
import org.jspecify.annotations.Nullable;

import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_person")
public interface Person extends ID {

    @Key
    String username();

    String address();

    @Nullable
    String phone();

    @OneToMany(mappedBy = "person")
    List<Order> orders();
}
