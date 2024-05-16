package org.jimmer.domain

import org.babyfish.jimmer.sql.EnumItem
import org.babyfish.jimmer.sql.EnumType

/**
 * @EnumType 的参数被指定为"NAME", 表示映射为字符串。默认情况下，两个枚举项映射后的字符串和它们的名字相同，即"MALE"和"FEMALE"。
 * 若期望枚举的字符串和枚举项名称不同，你可以使用 @EnumItem 修饰枚举项。
 * @author jhlz
 * @since 2024/4/15 18:49
 * @version x.x.x
 */
// 这也是 jimmer 默认的映射方案
@EnumType(EnumType.Strategy.NAME)
enum class Gender {
    @EnumItem(name = "MALE")
    男,
    @EnumItem(name = "FEMALE")
    女,
    @EnumItem(name = "UN")
    UNKNOWN,
}