package com.example.order.controller;

import com.example.order.entity.OrderEntity;
import com.example.order.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 订单测试
 * @author: huy
 * @date: 2025/5/3 16:46
 * @version: 1.0
 */
@EnableFeignClients // 开启feign远程调用功能
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Value("${order.timeout}")
    private String orderTimeout;
    @Value("${order.auto-confirm}")
    private String orderAutoConfirm;

    /**
     * 获取配置中心测试类
     * @return
     */
    @GetMapping("/getConfigTest")
    public String getConfigTest() {
        return "order.timeout: " + orderTimeout + ";    order.auto-confirm" + orderAutoConfirm;
    }

    /**
     * 创建订单
     * @param userId
     * @param productId
     * @return
     */
    @GetMapping("/createOrder")
    public OrderEntity createOrder(@RequestParam("userId") Long userId, @RequestParam("productId") Long productId) {

        OrderEntity orderEntity = orderService.createOrder(productId, userId);

        return orderEntity;
    }
}
