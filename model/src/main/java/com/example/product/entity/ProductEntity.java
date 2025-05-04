package com.example.product.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @description: 公用 商品实体类
 * @author: huy
 * @date: 2025/5/3 15:46
 * @version: 1.0
 */
@Data
public class ProductEntity {

    private Long id;
    private BigDecimal price;
    private String name;
    private int num;
}
