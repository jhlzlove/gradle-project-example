package org.jimmer.jimmerdatasouce.domain;

import java.lang.Long;
import java.lang.String;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TypedProp;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.table.Props;
import org.babyfish.jimmer.sql.ast.table.PropsFor;

@GeneratedBy(
        type = Dept.class
)
@PropsFor(Dept.class)
public interface DeptProps extends Props {
    TypedProp.Scalar<Dept, Long> DEPT_ID = 
        TypedProp.scalar(ImmutableType.get(Dept.class).getProp("deptId"));

    TypedProp.Scalar<Dept, String> DEPT_NAME = 
        TypedProp.scalar(ImmutableType.get(Dept.class).getProp("deptName"));

    TypedProp.Scalar<Dept, Long> LEADER_ID = 
        TypedProp.scalar(ImmutableType.get(Dept.class).getProp("leaderId"));

    TypedProp.Scalar<Dept, Long> ROLE_ID = 
        TypedProp.scalar(ImmutableType.get(Dept.class).getProp("roleId"));

    PropExpression.Num<Long> deptId();

    PropExpression.Str deptName();

    PropExpression.Num<Long> leaderId();

    PropExpression.Num<Long> roleId();
}
