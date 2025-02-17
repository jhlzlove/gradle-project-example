package org.jimmer

import org.babyfish.jimmer.kt.new
import org.jimmer.config.JimmerConfig
import org.jimmer.domain.Student
import org.jimmer.domain.by
import java.time.LocalDateTime

/**
 * @author jhlz
 * @version x.x.x
 */
class MainKt

fun main() {
    val sqlClient = JimmerConfig.sqlClient()

    val user = new(Student::class).by {
        firstName = "白"
        lastName = "亦非"
        gender = "MALE"
        birthday = LocalDateTime.now()
    }

    sqlClient.save(user)

    val list = sqlClient.createQuery(Student::class) {
        select(table)
    }.execute()

    list.forEach { println(it) }
}