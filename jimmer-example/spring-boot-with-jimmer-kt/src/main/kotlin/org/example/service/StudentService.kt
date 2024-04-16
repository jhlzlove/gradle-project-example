package org.example.org.example.service

import org.babyfish.jimmer.Page
import org.babyfish.jimmer.client.FetchBy
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.fetcher.newFetcher
import org.example.org.example.domain.Student
import org.example.org.example.domain.by
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 学生服务类
 * @author jhlz
 * @since 2024/4/15 18:53
 * @version x.x.x
 */
@Service
class StudentService @Autowired constructor(val sqlClient: KSqlClient) {

    /**
     * 选课
     * 注意：这里没有中间表的实体，直接保存关联关系。只有在最简单的增量操作时使用
     */
    fun takeCourse(studentId: Long, courseId: Long) {
        sqlClient.getAssociations(Student::courseIds).save(studentId, courseId)
    }

    /**
     * 添加学生
     */
    fun addStudent(student: Student): Student {
        return sqlClient.save(student).originalEntity
    }

    /**
     * 分页查询
     */
    fun getAllStudent(pageIndex: Int, pageSize: Int): Page<Student> {
        return sqlClient.createQuery(Student::class) {
            select(
                // 下面几行行可以转为这一行
                table.fetch(STUDENT_FETCH)
                // table.fetchBy {
                //     fullName()
                //     gender()
                //     courseIds {
                //          courseName()
                //      }
                // }
            )
        }.fetchPage(pageIndex, pageSize)
    }

    /**
     * 更新
     */
    fun updateStudent(student: Student): Student {
        return sqlClient.save(student).modifiedEntity
    }

    /**
     * 删除
     */
    fun deleteStudent(ids: List<Long>) : Int{
        return sqlClient.deleteByIds(Student::class, ids).totalAffectedRowCount
    }

    fun getAllStudentFetchBy(pageIndex: Int, pageSize: Int): Page<@FetchBy(
        value = "STUDENT_FETCH"
    ) Student> {
        return sqlClient.createQuery(Student::class) {
            select(table.fetch(STUDENT_FETCH))
        }.fetchPage(pageIndex, pageSize)
    }

    /**
     * 定义自己需要的一个查询形状
     */
    companion object {
        private val STUDENT_FETCH = newFetcher(Student::class).by {
            fullName()
            gender()
            // 思考：这里为什么是 courseIds 呢？
            // 废话，因为实体就是这样命名的，你问我为什么如此命名？？？
            // 这就是测试的艺术了
            courseIds {
                courseName()
            }
        }
    }
}