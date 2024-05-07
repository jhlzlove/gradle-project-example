package org.jimmer.jimmerdatasouce.domain;

import org.babyfish.jimmer.sql.MappedSuperclass;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;

/**
 * 公共实体 @MappedSuperclass 修饰，全部字段为可空
 * @author jhlz
 * @version x.x.x
 */
@MappedSuperclass
public interface BaseEntity {
    @Nullable
    LocalDateTime createTime();
    @Nullable
    LocalDateTime updateTime();
    @Nullable
    String createBy();
    @Nullable
    String updateBy();
    @Nullable
    String remark();
}
