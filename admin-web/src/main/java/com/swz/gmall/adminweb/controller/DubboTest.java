package com.swz.gmall.adminweb.controller;

import com.swz.gmall.pms.entity.Product;
import com.swz.gmall.pms.service.ProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboTest {

    @Reference
    ProductService productService;
    @ResponseBody
    @RequestMapping("/dtest")
    public String test() {
        Product product = productService.getById(1);
        System.out.println(product);
        return "success";
    }
}
