package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.sql.EnumItem;
import org.babyfish.jimmer.sql.EnumType;

/**
 * 基于名称的枚举映射，即使不指定，默认也是基于名称
 * @author jhlz
 * @version x.x.x
 */
@EnumType(EnumType.Strategy.NAME)
public enum Gender {
    /**
     * 枚举名称是查询使用的，数据库存储使用的是 @EnumItem(name = "xxx") 指定的
     * 不使用此注解默认和枚举值相同
     */
    @EnumItem(name = "MALE")
    男,
    @EnumItem(name = "FEMALE")
    女,
    @EnumItem(name = "UN")
    UNKNOWN,
}
