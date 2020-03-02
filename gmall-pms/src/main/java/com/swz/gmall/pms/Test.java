package com.swz.gmall.pms;

import com.swz.gmall.pms.entity.Product;
import com.swz.gmall.pms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    @Autowired
    ProductService productService;
    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        Product product = productService.getById(1);
        System.out.println(product);
        return "success";
    }
}
