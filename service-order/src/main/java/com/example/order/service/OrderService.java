package com.example.order.service;

import com.example.order.entity.OrderEntity;

public interface OrderService {

    OrderEntity createOrder(Long productId, Long userId);
}
