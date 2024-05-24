package org.jimmer

import org.jimmer.config.JimmerConfig
import org.jimmer.domain.User

/**
 * @author jhlz
 * @version x.x.x
 */
class MainKt

fun main() {
    val sqlClient = JimmerConfig.sqlClient()

    // val user = new(User::class).by {
    //     username = "江湖浪子"
    //     gender = "MALE"
    //     address = "地球"
    //     birthday = LocalDate.parse("2000-10-01")
    // }

    // sqlClient.save(user)

    val list = sqlClient.createQuery(User::class) {
        select(table)
    }.execute()
    println(list)
}