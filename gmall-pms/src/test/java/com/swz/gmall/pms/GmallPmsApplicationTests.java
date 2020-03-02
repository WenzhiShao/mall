package com.swz.gmall.pms;

import com.swz.gmall.pms.entity.Product;
import com.swz.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Test
    void contextLoads() {
        Product id = productService.getById(1);
        System.out.println(id);
    }

}
