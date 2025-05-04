package com.example.order.entity;

import com.example.product.entity.ProductEntity;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

/**
 * @description: 公用 订单实体类
 * @author: huy
 * @date: 2025/5/3 16:46
 * @version: 1.0
 */
@Data
public class OrderEntity {

    private Long id;
    private BigDecimal totalAmount;
    private Long userId;
    private String nickName;
    private String address;
    private List<ProductEntity> productList;
}
