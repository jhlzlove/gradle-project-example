package org.jimmer.controller;

import lombok.RequiredArgsConstructor;
import org.babyfish.jimmer.Page;
import org.babyfish.jimmer.sql.JSqlClient;
import org.jimmer.domain.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final JSqlClient sqlClient;
    private final ProductTable table = ProductTable.$;

    /**
     * 添加商品
     * 快速演示简单写
     */
    @PostMapping("/add")
    @Transactional(rollbackFor = Exception.class)
    public void add(@RequestBody List<Category> categoryList) {
        sqlClient.saveEntitiesCommand(categoryList).execute();
    }

    /**
     * 分页查询
     * @param page  起始下标/索引在程序猿眼中 0 开始是常识
     * @param size  每页显示数量
     * @return  分页结果
     */
    @GetMapping("/page")
    public Page<Product> pageProduct(int page, int size) {
        return sqlClient.createQuery(table)
                .select(table.fetch(
                        ProductFetcher.$
                                .allScalarFields()
                                .category(
                                        CategoryFetcher.$.name()
                                )
                ))
                .fetchPage(page - 1, size);
    }

}
