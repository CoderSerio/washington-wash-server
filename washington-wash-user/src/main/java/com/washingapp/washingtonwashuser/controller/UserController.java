package com.washingapp.washingtonwashuser.controller;

import com.alibaba.fastjson2.JSONObject;
import com.washingapp.washingtonwashorder.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    public OrderService orderService;

    @RequestMapping("/getNum")
    public String getNum() {
        JSONObject json = new JSONObject();
        json.put("num", orderService.getOrderCount());
        return json.toString();
    }
}
