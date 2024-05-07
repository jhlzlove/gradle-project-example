package org.jimmer.jimmerdatasouce.controller;

import org.babyfish.jimmer.sql.JSqlClient;
import org.jimmer.jimmerdatasouce.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
public class WebController {
    @Autowired
    @Qualifier("sq1")
    JSqlClient sqlClient;

    @Autowired
    JSqlClient sq2;

    @GetMapping("/student")
    // @Transactional(value = "tm1")
    public void getStudent() {
        StudentTable table = StudentTable.$;
        List<Student> list = sqlClient.createQuery(table)
                .select(table.fetch(
                        StudentFetcher.$
                                .allScalarFields()
                                .fullName()
                                .courses()
                ))
                .execute();
        list.forEach(System.out::println);
    }


    @GetMapping("/dept")
    public void getDept() {
        DeptTable table = DeptTable.$;
        List<Dept> list = sq2.createQuery(table)
                .select(table.fetch(
                        DeptFetcher.$
                                .allScalarFields()
                ))
                .execute();
        list.forEach(System.out::println);
    }
}
