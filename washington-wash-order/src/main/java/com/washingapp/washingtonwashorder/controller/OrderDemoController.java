package com.washingapp.washingtonwashorder.controller;

import com.alibaba.fastjson2.JSONObject;
import com.washingapp.washingtonwashorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderDemoController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/getOne")
    public String getOne() {
        return "hello";
    }

    @RequestMapping("/getNum")
    public String getNum() {
        JSONObject json = new JSONObject();
        json.put("num", orderService.getOrderCount());
        return json.toString();
    }
}
