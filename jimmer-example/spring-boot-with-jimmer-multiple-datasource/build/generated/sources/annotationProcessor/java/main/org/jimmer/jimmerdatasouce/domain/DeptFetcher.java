package org.jimmer.jimmerdatasouce.domain;

import java.lang.Override;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Dept.class
)
public class DeptFetcher extends AbstractTypedFetcher<Dept, DeptFetcher> {
    public static final DeptFetcher $ = new DeptFetcher(null);

    private DeptFetcher(FetcherImpl<Dept> base) {
        super(Dept.class, base);
    }

    private DeptFetcher(DeptFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private DeptFetcher(DeptFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static DeptFetcher $from(Fetcher<Dept> base) {
        return base instanceof DeptFetcher ? 
        	(DeptFetcher)base : 
        	new DeptFetcher((FetcherImpl<Dept>)base);
    }

    @NewChain
    public DeptFetcher deptName() {
        return add("deptName");
    }

    @NewChain
    public DeptFetcher deptName(boolean enabled) {
        return enabled ? add("deptName") : remove("deptName");
    }

    @NewChain
    public DeptFetcher leaderId() {
        return add("leaderId");
    }

    @NewChain
    public DeptFetcher leaderId(boolean enabled) {
        return enabled ? add("leaderId") : remove("leaderId");
    }

    @NewChain
    public DeptFetcher roleId() {
        return add("roleId");
    }

    @NewChain
    public DeptFetcher roleId(boolean enabled) {
        return enabled ? add("roleId") : remove("roleId");
    }

    @Override
    protected DeptFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new DeptFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected DeptFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new DeptFetcher(this, prop, fieldConfig);
    }
}
