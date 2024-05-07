package org.jimmer.jimmerdatasouce.domain;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.JoinType;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.impl.table.TableProxies;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.WeakJoin;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Role.class
)
public class RoleTableEx extends RoleTable implements TableEx<Role> {
    public static final RoleTableEx $ = new RoleTableEx(RoleTable.$, null);

    public RoleTableEx() {
        super();
    }

    public RoleTableEx(AbstractTypedTable.DelayedOperation<Role> delayedOperation) {
        super(delayedOperation);
    }

    public RoleTableEx(TableImplementor<Role> table) {
        super(table);
    }

    protected RoleTableEx(RoleTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public RoleTableEx asTableEx() {
        return this;
    }

    @Override
    public RoleTableEx __disableJoin(String reason) {
        return new RoleTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<RoleTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<RoleTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
