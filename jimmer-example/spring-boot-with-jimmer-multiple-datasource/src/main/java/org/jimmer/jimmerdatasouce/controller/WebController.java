package org.jimmer.jimmerdatasouce.controller;

import org.babyfish.jimmer.sql.JSqlClient;
import org.jimmer.jimmerdatasouce.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
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
    @GetMapping("/student")
    public void getStudent() {
        StudentTable table = StudentTable.$;
        List<Student> list = sq1.createQuery(table)
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
    @Transactional("tm2")
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
