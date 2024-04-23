package com.washingapp.washingtonwashorder.service.impl;

import com.washingapp.washingtonwashorder.mapper.OrderMapper;
import com.washingapp.washingtonwashorder.service.OrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@DubboService
public class OrderServiceImpl implements OrderService {

    @Resource
    public OrderMapper orderMapper;

    @Override
    public int getOrderCount() {
        // return orderMapper.getOrderNum();
        return 1;
    }
}
