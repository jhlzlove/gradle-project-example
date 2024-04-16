package org.example.org.example.controller

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.client.FetchBy
import org.babyfish.jimmer.sql.kt.fetcher.newFetcher
import org.example.org.example.domain.Student
import org.example.org.example.domain.by
import org.example.org.example.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @author jhlz
 * @since 2024/4/16 10:02
 * @version x.x.x
 */
@RestController
@RequestMapping("/student")
class StudentController @Autowired constructor(val studentService: StudentService) {

    /**
     * 选课
     */
    @PostMapping("/takeCourse/{studentId}/{courseId}")
    fun takeCourse(
        @PathVariable("studentId") studentId: Long,
        @PathVariable("courseId") courseId: Long
    ) =
        studentService.takeCourse(studentId, courseId)

    /**
     * 添加
     */
    @PostMapping("/add")
    fun addStudent(@RequestBody student: Student) {
        studentService.addStudent(student)
    }

    /**
     * 分页获取
     */
    @GetMapping("list")
    fun getAllStudent(@RequestParam pageIndex: Int, @RequestParam pageSize: Int): Page<Student> {
        return studentService.getAllStudent(pageIndex, pageSize)
    }

    /**
     * 分页获取，使用另一种写法，结果和上面一致
     * 不同之处在于，这种写法将会生成对应的客户端代码，结构和后端定义代码一致供前端小伙伴使用
     */
    @GetMapping("/fetchBy")
    fun getAllStudentFetchBy(
        @RequestParam pageIndex: Int,
        @RequestParam pageSize: Int
    ): Page<@FetchBy("STUDENT_FETCH") Student> {
        return studentService.getAllStudentFetchBy(pageIndex, pageSize)
    }

    companion object {
        private val STUDENT_FETCH = newFetcher(Student::class).by {
            fullName()
            gender()
            courseIds {
                courseName()
            }
        }
    }
}