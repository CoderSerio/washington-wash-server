package com.washingapp.washingtonwashorder.service;
import com.washingapp.washingtonwashorder.pojo.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    int createOrder(String orderInfo, long userId);

    List<Order> getOrder(Map<String, Object> params);

    int setOrderInfo(String orderInfo, long userId, long businessId, long orderId);
}
