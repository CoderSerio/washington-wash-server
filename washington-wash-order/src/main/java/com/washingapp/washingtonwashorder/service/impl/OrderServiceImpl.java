package com.washingapp.washingtonwashorder.service.impl;

import com.washingapp.washingtonwashorder.mapper.OrderMapper;
import com.washingapp.washingtonwashorder.pojo.Order;
import com.washingapp.washingtonwashorder.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@DubboService
public class OrderServiceImpl implements OrderService {
    @Resource
    public OrderMapper orderMapper;

    @Override
    public List<Order> getOrder(Map<String, Object> params) {
        List<Order> queryRes = orderMapper.getOrder();
        return queryRes;
    }

    @Override
    public int createOrder(String orderInfo, long userId) {
        return orderMapper.createOrder(orderInfo, userId);
    }

    @Override
    public int setOrderInfo(String orderInfo, long userId, long businessId, long orderId) {
        return orderMapper.setOrderInfo(orderInfo, userId, businessId, orderId);
    }
}
