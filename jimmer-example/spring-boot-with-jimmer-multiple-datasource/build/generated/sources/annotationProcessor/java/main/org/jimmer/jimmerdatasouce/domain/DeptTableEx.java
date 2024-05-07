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
        type = Dept.class
)
public class DeptTableEx extends DeptTable implements TableEx<Dept> {
    public static final DeptTableEx $ = new DeptTableEx(DeptTable.$, null);

    public DeptTableEx() {
        super();
    }

    public DeptTableEx(AbstractTypedTable.DelayedOperation<Dept> delayedOperation) {
        super(delayedOperation);
    }

    public DeptTableEx(TableImplementor<Dept> table) {
        super(table);
    }

    protected DeptTableEx(DeptTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public DeptTableEx asTableEx() {
        return this;
    }

    @Override
    public DeptTableEx __disableJoin(String reason) {
        return new DeptTableEx(this, reason);
    }

    public <TT extends Table<?>, WJ extends WeakJoin<DeptTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType) {
        return weakJoin(weakJoinType, JoinType.INNER);
    }

    @SuppressWarnings("unchecked")
    public <TT extends Table<?>, WJ extends WeakJoin<DeptTable, TT>> TT weakJoin(
            Class<WJ> weakJoinType, JoinType joinType) {
        __beforeJoin();
        if (raw != null) {
            return (TT)TableProxies.wrap(raw.weakJoinImplementor(weakJoinType, joinType));
        }
        return (TT)TableProxies.fluent(joinOperation(weakJoinType, joinType));
    }
}
