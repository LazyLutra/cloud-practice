package com.example.order.service.impl;

import com.example.order.entity.OrderEntity;
import com.example.order.feign.ProductFeignClient;
import com.example.order.service.OrderService;
import com.example.product.entity.ProductEntity;
import jakarta.annotation.Resource;
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

    @Resource
    private ProductFeignClient productFeignClient;

    @Override
    public OrderEntity createOrder(Long productId, Long userId) {

        // 商品服务，使用 feign 获取商品信息
        ProductEntity productEntity = productFeignClient.getProductById(productId);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(1L);
        orderEntity.setTotalAmount(productEntity.getPrice().multiply(new BigDecimal(productEntity.getNum())));
        orderEntity.setUserId(userId);
        orderEntity.setNickName("zhangsan");
        orderEntity.setAddress("派送地址");
        orderEntity.setProductList(Arrays.asList(productEntity));

        return orderEntity;
    }

}
