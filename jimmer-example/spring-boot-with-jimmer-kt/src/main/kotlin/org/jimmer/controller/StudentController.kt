package org.jimmer.controller

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.client.FetchBy
import org.babyfish.jimmer.client.meta.DefaultFetcherOwner
import org.jimmer.Fetchers
import org.jimmer.domain.Student
import org.jimmer.service.StudentService
import org.springframework.web.bind.annotation.*

/**
 * @author jhlz
 * @since 2024/4/16 10:02
 * @version x.x.x
 */
@RestController
@RequestMapping("/student")
@DefaultFetcherOwner(Fetchers::class)
class StudentController(val studentService: StudentService) {

    /**
     * 选课
     */
    @PostMapping("/takeCourse/{studentId}/{courseId}")
    fun takeCourse(
        @PathVariable("studentId") studentId: Long,
        @PathVariable("courseId") courseId: Long
    ) = studentService.takeCourse(studentId, courseId)

    /**
     * 分页获取，使用另一种写法
     * 不同之处在于，这种写法将会生成对应的客户端代码，结构和后端定义代码一致供前端小伙伴使用
     */
    @GetMapping("/page")
    fun page(
        @RequestParam pageIndex: Int,
        @RequestParam pageSize: Int
    ): Page<@FetchBy("STUDENT_FETCHER") Student> {
        return studentService.page(pageIndex, pageSize)
    }
}