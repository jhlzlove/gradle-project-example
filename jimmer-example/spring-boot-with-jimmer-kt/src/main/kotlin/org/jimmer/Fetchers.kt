package org.jimmer

import org.babyfish.jimmer.sql.kt.fetcher.newFetcher
import org.jimmer.domain.Student
import org.jimmer.domain.by

/**
 * @author jhlz
 * @since 2024/4/16 19:27
 * @version x.x.x
 */
class Fetchers {
    /**
     * 定义自己需要的一个查询形状
     */
    companion object {
        val STUDENT_FETCHER = newFetcher(Student::class).by {
            fullName()
            gender()
            courses {
                courseName()
            }
        }
    }
}