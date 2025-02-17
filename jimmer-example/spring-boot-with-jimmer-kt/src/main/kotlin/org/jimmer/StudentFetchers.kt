package org.jimmer

import org.babyfish.jimmer.sql.kt.fetcher.newFetcher
import org.jimmer.domain.Student
import org.jimmer.domain.by

/**
 * @author jhlz
 * @version x.x.x
 */
class StudentFetchers {

    companion object {
        val STUDENT_INFO = newFetcher(Student::class).by {
            allScalarFields()
            courses {
                courseName()
            }
            college {
                collegeName()
            }
        }
    }
}