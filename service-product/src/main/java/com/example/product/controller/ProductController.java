package com.example.product.controller;

import com.example.product.entity.ProductEntity;
import com.example.product.service.ProductService;
import jakarta.annotation.Resource;
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
    public ProductEntity getProductById(@PathVariable("id") Long id) {
        ProductEntity product = productService.getProductById(id);

        return product;
    }
}
