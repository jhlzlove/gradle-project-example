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

    final JSqlClient sq1;
    final JSqlClient sq2;

    public WebController(JSqlClient sq1, JSqlClient sq2) {
        this.sq1 = sq1;
        this.sq2 = sq2;
    }

    @Transactional("tm1")
    @GetMapping("/list")
    public List<Student> getStudent() {
        StudentTable table = StudentTable.$;
        return sq1.createQuery(table)
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
        List<Author> list = sq2.createQuery(table)
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
