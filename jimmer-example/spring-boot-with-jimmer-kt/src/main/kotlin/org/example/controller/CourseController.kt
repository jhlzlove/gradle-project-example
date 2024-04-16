package org.example.org.example.controller

import org.example.org.example.domain.Course
import org.example.org.example.service.CourseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @author jhlz
 * @since 2024/4/16 10:02
 * @version x.x.x
 */
@RestController
@RequestMapping("/course")
class CourseController @Autowired constructor(val courseService: CourseService) {

    @GetMapping("/{id}")
    fun getCourseById(@PathVariable("id") courseId: Long): Course? = courseService.getCourseById(courseId)

    @PostMapping("/add")
    fun addCourse(@RequestBody course: Course) = courseService.addOrUpdateCourse(course)

    @PutMapping("/update")
    fun updateCourseById(@RequestBody course: Course) = courseService.addOrUpdateCourse(course)

    @DeleteMapping("/{id}")
    fun deleteCourse(@PathVariable id: Long) : Int = courseService.deleteCourse(id)
}