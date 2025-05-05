package com.example.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 订单服务启动类
 * @author: huy
 * @date: 2025/5/2 16:42
 * @version: 1.0
 */
@EnableFeignClients(basePackages = "com.example.order.feign")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}