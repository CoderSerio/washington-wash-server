package com.washingapp.washingtonwashorder.controller;

import com.alibaba.fastjson2.JSONObject;
import com.washingapp.washingtonwashorder.pojo.Order;
import com.washingapp.washingtonwashorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/test")
    public String test() {
        System.out.println("请求！");
        return "test ok";
    }

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Map<String, Object> params) {
        String orderInfo = (String) params.get("orderInfo");
        Integer userId = (Integer) params.get("userId");

        int res = orderService.createOrder(orderInfo, userId);

        JSONObject json = new JSONObject();
        json.put("data", res);
        return json.toString();
    }

    @RequestMapping("/getOrder")
    public String getOrder(@RequestBody Map<String, Object> params) {
        List<Order> res = orderService.getOrder(params);

        JSONObject json = new JSONObject();
        json.put("data", res);
        return json.toString();
    }

    @PostMapping("/setOrderInfo")
    public String setOrderInfo(@RequestBody Map<String, Object> params) {
        String orderInfo = (String) params.get("orderInfo");
        Integer userId = (Integer) params.get("userId");
        Integer businessId = (Integer) params.get("businessId");
        Integer orderId = (Integer) params.get("orderId");

        int res = orderService.setOrderInfo(orderInfo, userId, businessId, orderId);

        JSONObject json = new JSONObject();
        json.put("data", res);
        return json.toString();
    }

}
