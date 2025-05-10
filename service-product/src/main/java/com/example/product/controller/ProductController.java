package com.example.product.controller;

import com.example.product.entity.ProductEntity;
import com.example.product.service.ProductService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 商品测试
 * @author: huy
 * @date: 2025/5/3 15:48
 * @version: 1.0
 */
@RestController
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping("/getProductById/{id}")
    public ProductEntity getProductById(@PathVariable("id") Long id,
        HttpServletRequest request) {

        String header = request.getHeader("XToken");
        System.out.println("自定义请求头为：" + header);

        ProductEntity product = productService.getProductById(id);

        return product;
    }
}
