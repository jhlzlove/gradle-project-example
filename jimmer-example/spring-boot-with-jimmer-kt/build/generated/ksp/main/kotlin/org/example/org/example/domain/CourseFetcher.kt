@file:Suppress(
    "RedundantVisibilityModifier",
    "Unused",
)
@file:GeneratedBy(type = org.example.org.example.domain.Course::class)

package org.example.org.example.domain

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import org.babyfish.jimmer.`internal`.GeneratedBy
import org.babyfish.jimmer.kt.DslScope
import org.babyfish.jimmer.sql.fetcher.Fetcher
import org.babyfish.jimmer.sql.fetcher.`impl`.FetcherImpl
import org.babyfish.jimmer.sql.kt.fetcher.FetcherCreator
import org.babyfish.jimmer.sql.kt.fetcher.KListFieldDsl
import org.babyfish.jimmer.sql.kt.fetcher.`impl`.JavaFieldConfigUtils

@GeneratedBy(type = Course::class)
public fun FetcherCreator<Course>.`by`(block: CourseFetcherDsl.() -> Unit): Fetcher<Course> {
    val dsl = CourseFetcherDsl(emptyCourseFetcher)
    dsl.block()
    return dsl.internallyGetFetcher()
}

@GeneratedBy(type = Course::class)
public fun FetcherCreator<Course>.`by`(base: Fetcher<Course>?, block: CourseFetcherDsl.() -> Unit):
        Fetcher<Course> {
    val dsl = CourseFetcherDsl(base ?: emptyCourseFetcher)
    dsl.block()
    return dsl.internallyGetFetcher()
}

@DslScope
@GeneratedBy(type = Course::class)
public class CourseFetcherDsl(
    fetcher: Fetcher<Course> = emptyCourseFetcher,
) {
    private var _fetcher: Fetcher<Course> = fetcher

    public fun internallyGetFetcher(): Fetcher<Course> = _fetcher

    public fun allScalarFields() {
        _fetcher = _fetcher.allScalarFields()
    }

    public fun allTableFields() {
        _fetcher = _fetcher.allTableFields()
    }

    public fun courseName(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("courseName")
        } else {
            _fetcher.remove("courseName")
        }
    }

    public fun courseCode(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("courseCode")
        } else {
            _fetcher.remove("courseCode")
        }
    }

    public fun createTime(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("createTime")
        } else {
            _fetcher.remove("createTime")
        }
    }

    public fun students(enabled: Boolean = true) {
        _fetcher = if (enabled) {
            _fetcher.add("students")
        } else {
            _fetcher.remove("students")
        }
    }

    public fun students(childFetcher: Fetcher<Student>,
            cfgBlock: (KListFieldDsl<Student>.() -> Unit)? = null) {
        _fetcher = _fetcher.add(
            "students",
            childFetcher,
            JavaFieldConfigUtils.list(cfgBlock)
        )
    }

    public fun students(cfgBlock: (KListFieldDsl<Student>.() -> Unit)? = null,
            childBlock: StudentFetcherDsl.() -> Unit) {
        _fetcher = _fetcher.add(
            "students",
            StudentFetcherDsl().apply { childBlock() }.internallyGetFetcher(),
            JavaFieldConfigUtils.list(cfgBlock)
        )
    }

    public fun students(
        enabled: Boolean,
        childFetcher: Fetcher<Student>,
        cfgBlock: (KListFieldDsl<Student>.() -> Unit)? = null,
    ) {
        if (!enabled) {
            _fetcher = _fetcher.remove("students")
        } else {
            students(childFetcher, cfgBlock)
        }
    }

    public fun students(
        enabled: Boolean,
        cfgBlock: (KListFieldDsl<Student>.() -> Unit)? = null,
        childBlock: StudentFetcherDsl.() -> Unit,
    ) {
        if (!enabled) {
            _fetcher = _fetcher.remove("students")
        } else {
            students(cfgBlock, childBlock)
        }
    }
}

private val emptyCourseFetcher: Fetcher<Course> = FetcherImpl(Course::class.java)
