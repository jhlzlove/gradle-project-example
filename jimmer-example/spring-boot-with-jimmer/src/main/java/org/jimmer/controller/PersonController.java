package org.jimmer.controller;

import lombok.RequiredArgsConstructor;
import org.babyfish.jimmer.Page;
import org.babyfish.jimmer.sql.JSqlClient;
import org.babyfish.jimmer.sql.ast.mutation.AssociatedSaveMode;
import org.babyfish.jimmer.sql.ast.mutation.SaveMode;
import org.jimmer.domain.*;
import org.jimmer.domain.dto.PersonInput;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final JSqlClient sqlClient;
    private final PersonTable table = PersonTable.$;


    @GetMapping("/page")
    public Page<Person> page(int page, int size) {
        return sqlClient.createQuery(table)
                .select(table)
                .fetchPage(page - 1, size);
    }


    /**
     * 业务简单，添加更新使用同一个接口
     *
     * @param person 用户信息
     * @return 结果
     */
    @PostMapping("/save")
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<String> save(@RequestBody Person person) {
        sqlClient.saveCommand(person).execute();
        return ResponseEntity.ok("添加用户成功！");
    }

    @PostMapping("/order")
    @Transactional(rollbackFor = Exception.class)
    public void order(@RequestBody PersonInput person) {
        List<OrderItem> itemList = person.getProducts()
                .stream()
                .map(it ->
                        new OrderItemDraft.Builder()
                                .productId(it.productId())
                                .productNum(it.num())
                                .build()
                ).toList();
        Order order = new OrderDraft.Builder()
                .personId(person.getId())
                .items(itemList)
                .build();
        sqlClient.saveCommand(order)
                .setMode(SaveMode.INSERT_ONLY)
                .setAssociatedMode(OrderProps.ITEMS, AssociatedSaveMode.APPEND)
                .execute();
    }

    /**
     * 查询用户订单
     *
     * @param id 用户 id
     * @return 记录
     */
    @GetMapping("/order/{id}")
    public Person personOrder(@PathVariable long id) {
        return sqlClient.createQuery(table)
                .where(table.id().eq(id))
                .select(table.fetch(
                        PersonFetcher.$
                                .username()
                                .orders(
                                        OrderFetcher.$
                                                .createTime()
                                                .items(
                                                        OrderItemFetcher.$
                                                                .productNum()
                                                                .product(
                                                                        ProductFetcher.$
                                                                                .proName()
                                                                )
                                                )
                                )
                ))
                .fetchOneOrNull();
    }
}
