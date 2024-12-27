package org.jimmer.controller

import org.jimmer.domain.Subject
import org.jimmer.service.SubjectService
import org.springframework.web.bind.annotation.*

/**
 * @author jhlz
 * @version x.x.x
 */
@RequestMapping("/subject")
@RestController
class SubjectController(
    val subjectService: SubjectService
) {

    /**
     * 树结构
     */
    @GetMapping("/tree")
    fun tree() = subjectService.listTree()

    /**
     * 分页获取
     */
    @GetMapping("/page")
    fun page() = subjectService.page()

    /**
     * 添加专业
     */
    @PostMapping("/add")
    fun save(@RequestBody category: Subject) = subjectService.add(category)

    /**
     * 删除专业
     */
    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id: Long) = subjectService.delete(id)
}