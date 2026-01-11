package org.jimmer.domain;

import org.babyfish.jimmer.sql.GeneratedValue;
import org.babyfish.jimmer.sql.GenerationType;
import org.babyfish.jimmer.sql.Id;
import org.babyfish.jimmer.sql.MappedSuperclass;

/**
 * @author jhlz
 * @version x.x.x
 */
@MappedSuperclass
public interface ID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();
}
