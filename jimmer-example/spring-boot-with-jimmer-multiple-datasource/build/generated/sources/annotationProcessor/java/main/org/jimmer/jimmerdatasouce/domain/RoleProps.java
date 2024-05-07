package org.jimmer.jimmerdatasouce.domain;

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDateTime;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Role.class
)
@PropsFor(Role.class)
public interface RoleProps extends Props {
    TypedProp.Scalar<Role, Long> ROLE_ID = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleId"));

    TypedProp.Scalar<Role, String> ROLE_CODE = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleCode"));

    TypedProp.Scalar<Role, String> ROLE_NAME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("roleName"));

    TypedProp.Scalar<Role, LocalDateTime> CREATE_DATETIME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("createDatetime"));

    TypedProp.Scalar<Role, LocalDateTime> UPDATE_DATETIME = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("updateDatetime"));

    TypedProp.Scalar<Role, String> REMARK = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("remark"));

    TypedProp.Scalar<Role, Integer> STATUS = 
        TypedProp.scalar(ImmutableType.get(Role.class).getProp("status"));

    PropExpression.Num<Long> roleId();

    PropExpression.Str roleCode();

    PropExpression.Str roleName();

    PropExpression.Cmp<LocalDateTime> createDatetime();

    PropExpression.Cmp<LocalDateTime> updateDatetime();

    PropExpression.Str remark();

    PropExpression.Num<Integer> status();
}
