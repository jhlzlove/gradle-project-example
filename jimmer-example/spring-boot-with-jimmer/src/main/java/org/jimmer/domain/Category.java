package org.jimmer.domain;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.Key;
import org.babyfish.jimmer.sql.OneToMany;
import org.babyfish.jimmer.sql.Table;

import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@Entity
@Table(name = "tb_category")
public interface Category extends ID {

    @Key
    String name();

    @OneToMany(mappedBy = "category")
    List<Product> products();

}
