package org.jimmer.controller

import org.jimmer.domain.Course
import org.jimmer.service.CourseService
import org.springframework.web.bind.annotation.*

/**
 * @author jhlz
 * @since 2024/4/16 10:02
 * @version x.x.x
 */
@RestController
@RequestMapping("/course")
class CourseController(val courseService: CourseService) {

    @GetMapping("/{id}")
    fun info(@PathVariable("id") courseId: Long): Course? = courseService.getInfo(courseId)

    @PostMapping("/add")
    fun addCourse(@RequestBody course: Course) = courseService.addOrUpdateCourse(course)

    @PutMapping("/update")
    fun updateCourseById(@RequestBody course: Course) = courseService.addOrUpdateCourse(course)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): Int = courseService.delete(id)
}