package com.example.controller

import com.example.domain.Student
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.serde.annotation.Serdeable
import org.babyfish.jimmer.sql.kt.KSqlClient

/**
 * @author jhlz
 * @version x.x.x
 */
@Controller("/test")
class WebController(val sqlClient: KSqlClient) {


    @Get("/jimmer")
    fun getSqlClient() {
        val list = sqlClient.createQuery(Student::class) {
            select(table)
        }.execute()
        println(list)
    }

    @Get("/user")
    @Produces(MediaType.APPLICATION_JSON)
    fun getUser() = User("admin", "123");


    @Serdeable
    data class User(val username: String, val password: String)

}