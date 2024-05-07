package org.jimmer.jimmerdatasouce.domain;

import java.lang.Override;
import java.util.function.Consumer;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.lang.NewChain;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.sql.ast.table.Table;
import org.babyfish.jimmer.sql.fetcher.Fetcher;
import org.babyfish.jimmer.sql.fetcher.FieldConfig;
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType;
import org.babyfish.jimmer.sql.fetcher.ListFieldConfig;
import org.babyfish.jimmer.sql.fetcher.impl.FetcherImpl;
import org.babyfish.jimmer.sql.fetcher.spi.AbstractTypedFetcher;

@GeneratedBy(
        type = Course.class
)
public class CourseFetcher extends AbstractTypedFetcher<Course, CourseFetcher> {
    public static final CourseFetcher $ = new CourseFetcher(null);

    private CourseFetcher(FetcherImpl<Course> base) {
        super(Course.class, base);
    }

    private CourseFetcher(CourseFetcher prev, ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        super(prev, prop, negative, idOnlyFetchType);
    }

    private CourseFetcher(CourseFetcher prev, ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        super(prev, prop, fieldConfig);
    }

    public static CourseFetcher $from(Fetcher<Course> base) {
        return base instanceof CourseFetcher ? 
        	(CourseFetcher)base : 
        	new CourseFetcher((FetcherImpl<Course>)base);
    }

    @NewChain
    public CourseFetcher courseName() {
        return add("courseName");
    }

    @NewChain
    public CourseFetcher courseName(boolean enabled) {
        return enabled ? add("courseName") : remove("courseName");
    }

    @NewChain
    public CourseFetcher courseCode() {
        return add("courseCode");
    }

    @NewChain
    public CourseFetcher courseCode(boolean enabled) {
        return enabled ? add("courseCode") : remove("courseCode");
    }

    @NewChain
    public CourseFetcher createTime() {
        return add("createTime");
    }

    @NewChain
    public CourseFetcher createTime(boolean enabled) {
        return enabled ? add("createTime") : remove("createTime");
    }

    @NewChain
    public CourseFetcher students() {
        return add("students");
    }

    @NewChain
    public CourseFetcher students(boolean enabled) {
        return enabled ? add("students") : remove("students");
    }

    @NewChain
    public CourseFetcher students(Fetcher<Student> childFetcher) {
        return add("students", childFetcher);
    }

    @NewChain
    public CourseFetcher students(Fetcher<Student> childFetcher,
            Consumer<ListFieldConfig<Student, StudentTable>> fieldConfig) {
        return add("students", childFetcher, fieldConfig);
    }

    @NewChain
    public CourseFetcher students(IdOnlyFetchType idOnlyFetchType) {
        return add("students", idOnlyFetchType);
    }

    @Override
    protected CourseFetcher createFetcher(ImmutableProp prop, boolean negative,
            IdOnlyFetchType idOnlyFetchType) {
        return new CourseFetcher(this, prop, negative, idOnlyFetchType);
    }

    @Override
    protected CourseFetcher createFetcher(ImmutableProp prop,
            FieldConfig<?, ? extends Table<?>> fieldConfig) {
        return new CourseFetcher(this, prop, fieldConfig);
    }
}
