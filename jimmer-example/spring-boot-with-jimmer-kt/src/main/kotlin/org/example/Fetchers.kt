package org.example.org.example

import org.babyfish.jimmer.sql.kt.fetcher.newFetcher
import org.example.org.example.domain.Student
import org.example.org.example.domain.by

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
            courseIds {
                courseName()
            }
        }
    }
}