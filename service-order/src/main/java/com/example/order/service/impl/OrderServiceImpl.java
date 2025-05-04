package com.example.order.service.impl;

import com.example.order.entity.OrderEntity;
import com.example.order.service.OrderService;
import com.example.product.entity.ProductEntity;
import java.math.BigDecimal;
import java.util.Arrays;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: huy
 * @date: 2025/5/3 16:48
 * @version: 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderEntity createOrder(Long productId, Long userId) {

        ProductEntity productEntity = getProductById(productId);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(1L);
        orderEntity.setTotalAmount(productEntity.getPrice().multiply(new BigDecimal(productEntity.getNum())));
        orderEntity.setUserId(userId);
        orderEntity.setNickName("zhangsan");
        orderEntity.setAddress("派送地址");
        orderEntity.setProductList(Arrays.asList(productEntity));

        return orderEntity;
    }

    /**
     * TODO 待完善 获取商品信息
     * @param productId
     * @return
     */
    private ProductEntity getProductById(Long productId) {
        ProductEntity productEntity = new ProductEntity();
        return productEntity;
    }

}
