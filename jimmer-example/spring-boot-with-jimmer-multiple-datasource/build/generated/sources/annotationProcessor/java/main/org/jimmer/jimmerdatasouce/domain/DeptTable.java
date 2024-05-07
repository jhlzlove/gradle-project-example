package org.jimmer.jimmerdatasouce.domain;

import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.sql.ast.PropExpression;
import org.babyfish.jimmer.sql.ast.impl.table.TableImplementor;
import org.babyfish.jimmer.sql.ast.table.TableEx;
import org.babyfish.jimmer.sql.ast.table.spi.AbstractTypedTable;

@GeneratedBy(
        type = Dept.class
)
public class DeptTable extends AbstractTypedTable<Dept> implements DeptProps {
    public static final DeptTable $ = new DeptTable();

    public DeptTable() {
        super(Dept.class);
    }

    public DeptTable(AbstractTypedTable.DelayedOperation<Dept> delayedOperation) {
        super(Dept.class, delayedOperation);
    }

    public DeptTable(TableImplementor<Dept> table) {
        super(table);
    }

    protected DeptTable(DeptTable base, String joinDisabledReason) {
        super(base, joinDisabledReason);
    }

    @Override
    public PropExpression.Num<Long> deptId() {
        return __get(DeptProps.DEPT_ID.unwrap());
    }

    @Override
    public PropExpression.Str deptName() {
        return __get(DeptProps.DEPT_NAME.unwrap());
    }

    @Override
    public PropExpression.Num<Long> leaderId() {
        return __get(DeptProps.LEADER_ID.unwrap());
    }

    @Override
    public PropExpression.Num<Long> roleId() {
        return __get(DeptProps.ROLE_ID.unwrap());
    }

    @Override
    public DeptTableEx asTableEx() {
        return new DeptTableEx(this, null);
    }

    @Override
    public DeptTable __disableJoin(String reason) {
        return new DeptTable(this, reason);
    }

    @GeneratedBy(
            type = Dept.class
    )
    public static class Remote extends AbstractTypedTable<Dept> {
        public Remote(AbstractTypedTable.DelayedOperation delayedOperation) {
            super(Dept.class, delayedOperation);
        }

        public Remote(TableImplementor<Dept> table) {
            super(table);
        }

        public PropExpression.Num<Long> deptId() {
            return __get(DeptProps.DEPT_ID.unwrap());
        }

        @Override
        @Deprecated
        public TableEx<Dept> asTableEx() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Remote __disableJoin(String reason) {
            return this;
        }
    }
}
