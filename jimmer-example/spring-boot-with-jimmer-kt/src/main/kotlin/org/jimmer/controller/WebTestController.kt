package org.jimmer.controller

import org.babyfish.jimmer.sql.kt.KSqlClient
import org.jimmer.domain.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
@RequestMapping("/web")
class WebTestController(val sqlClient: KSqlClient) {

    @GetMapping("/hello")
    fun hello() = sqlClient.findById(Student::class, 1)
}