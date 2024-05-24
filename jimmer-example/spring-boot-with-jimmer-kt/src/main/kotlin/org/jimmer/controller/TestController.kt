package org.example.org.jimmer.controller

import org.jimmer.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
@RequestMapping("/test")
class WebController @Autowired constructor(val studentService: StudentService) {

    @GetMapping("hello")
    fun hello() = "Hello World"
}