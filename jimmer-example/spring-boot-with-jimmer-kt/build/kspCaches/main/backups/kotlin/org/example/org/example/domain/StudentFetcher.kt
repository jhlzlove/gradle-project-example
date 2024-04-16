@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)
@file:GeneratedBy(type = Student::class)

package org.example.org.example.domain

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import org.babyfish.jimmer.`internal`.GeneratedBy
import org.babyfish.jimmer.kt.DslScope
import org.babyfish.jimmer.sql.fetcher.Fetcher
import org.babyfish.jimmer.sql.fetcher.IdOnlyFetchType
import org.babyfish.jimmer.sql.fetcher.`impl`.FetcherImpl
import org.babyfish.jimmer.sql.kt.fetcher.FetcherCreator
import org.babyfish.jimmer.sql.kt.fetcher.KListFieldDsl
import org.babyfish.jimmer.sql.kt.fetcher.`impl`.JavaFieldConfigUtils

public fun FetcherCreator<Student>.`by`(block: StudentFetcherDsl.() -> Unit): Fetcher<Student> {
    val dsl = StudentFetcherDsl(emptyStudentFetcher)
    dsl.block()
    return dsl.internallyGetFetcher()
}

public fun FetcherCreator<Student>.`by`(base: Fetcher<Student>?,
        block: StudentFetcherDsl.() -> Unit): Fetcher<Student> {
    val dsl = StudentFetcherDsl(base ?: emptyStudentFetcher)
    dsl.block()
    return dsl.internallyGetFetcher()
}

@DslScope
public class StudentFetcherDsl(
    fetcher: Fetcher<Student> = emptyStudentFetcher,
) {
    private var _fetcher: Fetcher<Student> = fetcher

    public fun internallyGetFetcher(): Fetcher<Student> = _fetcher

    public fun allScalarFields() {
        _fetcher = _fetcher.allScalarFields()
    }

    public fun allTableFields() {
        _fetcher = _fetcher.allTableFields()
    }

    public fun createTime(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("createTime")
        } else {
            _fetcher.remove("createTime")
        }
    }

    public fun updateTime(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("updateTime")
        } else {
            _fetcher.remove("updateTime")
        }
    }

    public fun createBy(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("createBy")
        } else {
            _fetcher.remove("createBy")
        }
    }

    public fun updateBy(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("updateBy")
        } else {
            _fetcher.remove("updateBy")
        }
    }

    public fun remark(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("remark")
        } else {
            _fetcher.remove("remark")
        }
    }

    public fun firstName(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("firstName")
        } else {
            _fetcher.remove("firstName")
        }
    }

    public fun lastName(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("lastName")
        } else {
            _fetcher.remove("lastName")
        }
    }

    public fun gender(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("gender")
        } else {
            _fetcher.remove("gender")
        }
    }

    public fun fullName(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("fullName")
        } else {
            _fetcher.remove("fullName")
        }
    }

    public fun courseIds(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("courseIds")
        } else {
            _fetcher.remove("courseIds")
        }
    }

    public fun courseIds(childFetcher: Fetcher<Course>,
            cfgBlock: (KListFieldDsl<Course>.() -> Unit)? = null) {
        _fetcher = _fetcher.add(
            "courseIds",
            childFetcher,
            JavaFieldConfigUtils.list(cfgBlock)
        )
    }

    public fun courseIds(cfgBlock: (KListFieldDsl<Course>.() -> Unit)? = null,
            childBlock: CourseFetcherDsl.() -> Unit) {
        _fetcher = _fetcher.add(
            "courseIds",
            CourseFetcherDsl().apply { childBlock() }.internallyGetFetcher(),
            JavaFieldConfigUtils.list(cfgBlock)
        )
    }

    public fun courseIds(
        enabled: Boolean,
        childFetcher: Fetcher<Course>,
        cfgBlock: (KListFieldDsl<Course>.() -> Unit)? = null,
    ) {
        if (!enabled) {
            _fetcher = _fetcher.remove("courseIds")
        } else {
            courseIds(childFetcher, cfgBlock)
        }
    }

    public fun courseIds(
        enabled: Boolean,
        cfgBlock: (KListFieldDsl<Course>.() -> Unit)? = null,
        childBlock: CourseFetcherDsl.() -> Unit,
    ) {
        if (!enabled) {
            _fetcher = _fetcher.remove("courseIds")
        } else {
            courseIds(cfgBlock, childBlock)
        }
    }

    public fun courseIds(idOnlyFetchType: IdOnlyFetchType) {
        _fetcher = _fetcher.add("courseIds", idOnlyFetchType)
    }
}

private val emptyStudentFetcher: Fetcher<Student> = FetcherImpl(Student::class.java)
