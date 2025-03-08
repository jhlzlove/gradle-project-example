package org.jimmer.jimmerdatasouce.controller;

import org.babyfish.jimmer.sql.JSqlClient;
import org.jimmer.jimmerdatasouce.domain.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 多数据源测试
 *
 * @author jhlz
 * @version x.x.x
 */
@RestController
public class WebController {

    final JSqlClient sqlClient;

    public WebController(JSqlClient sqlClient) {
        this.sqlClient = sqlClient;
    }

    @Transactional("tm1")
    @GetMapping("/list")
    public List<Student> getStudent() {
        StudentTable table = StudentTable.$;

        Student student = sqlClient.findById(Student.class, 5);
        System.out.println(student);

        return sqlClient.createQuery(table)
                .select(table.fetch(
                        StudentFetcher.$
                                .allScalarFields()
                                .fullName()
                                .courses(
                                        CourseFetcher.$
                                                .courseName()
                                )
                                .college(
                                        CollegeFetcher.$
                                                .collegeName()
                                )
                ))
                .execute();
    }

    @GetMapping("/author")
    @Transactional("tm2")
    public void getDept() {
        AuthorTable table = AuthorTable.$;
        List<Author> list = sqlClient.createQuery(table)
                .select(
                        table.fetch(
                                AuthorFetcher.$
                                        .allScalarFields()
                        )
                )
                .execute();
        list.forEach(System.out::println);
    }
}
