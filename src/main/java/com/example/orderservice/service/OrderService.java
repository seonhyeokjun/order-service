package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
    OrderDto getOrderByOrderId(String orderId);
//    Iterable<OrderDto> getAllOrders();
//    void deleteByOrderId(String orderId);
}
