package org.jimmer.controller

import org.jimmer.domain.dto.TeacherInput
import org.jimmer.service.TeacherService
import org.springframework.web.bind.annotation.*

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
@RequestMapping("/teacher")
class TeacherController(val teacherService: TeacherService) {

    @GetMapping("/page")
    fun page() = teacherService.page()

    /**
     * 由于教师编码使用了 @Key，倘若 编码 不变，修改了其它数据，那么保存会自动成为更新
     *
     * 更新时要注意 courses，如果 courses 也有变化，这个时候可能会出现 脱钩 操作，需要自己根据业务选择
     * 默认关联对象的插入策略是 REPLACE 模式，即替换
     * https://babyfish-ct.github.io/jimmer-doc/zh/docs/mutation/save-command/associated-save-mode
     */
    @PostMapping("/add")
    fun add(@RequestBody teacher: TeacherInput) = teacherService.add(teacher)
}