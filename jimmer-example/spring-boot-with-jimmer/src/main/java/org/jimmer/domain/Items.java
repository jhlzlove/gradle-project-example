package org.jimmer.domain;

import org.babyfish.jimmer.Immutable;

/**
 * @author jhlz
 * @version x.x.x
 */
@Immutable
public interface Items {
    Long productId();

    Long num();
}
