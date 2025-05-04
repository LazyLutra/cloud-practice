package com.example.product.service.impl;

import com.example.product.entity.ProductEntity;
import com.example.product.service.ProductService;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

/**
 * @description: 商品服务
 * @author: huy
 * @date: 2025/5/3 15:49
 * @version: 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public ProductEntity getProductById(Long productId) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(productId);
        productEntity.setPrice(new BigDecimal("99"));
        productEntity.setName("测试商品1，商品ID：" + productId);
        productEntity.setNum(2);
        return productEntity;
    }
}
