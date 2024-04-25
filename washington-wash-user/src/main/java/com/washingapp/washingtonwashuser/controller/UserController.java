package com.washingapp.washingtonwashuser.controller;

import com.alibaba.fastjson2.JSONObject;
import com.washingapp.washingtonwashuser.pojo.User;
import com.washingapp.washingtonwashuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test() {
        return "你在说什么";
    }
    @PostMapping("/createUser")
    public String createUser (@RequestBody Map<String, Object> params) {
        String wxInfo = (String) params.get("wxInfo");
        String washInfo = (String) params.get("washInfo");
        Integer type = (Integer) params.get("type");

        int res = userService.createUser(wxInfo, washInfo, type);

        JSONObject json = new JSONObject();
        json.put("data", res);
        return json.toString();
    }
    @RequestMapping("/getUser")
    public String getUser () {
        List<User> res = userService.getUser();
        JSONObject json = new JSONObject();
        json.put("data", res);

        return json.toString();
    }
    @PostMapping("/setUserInfo")
    public String setUserInfo (@RequestBody Map<String, Object> params) {
        System.out.println("params");
        System.out.println(params);

        String wxInfo = (String) params.get("wxInfo");
        String washInfo = (String) params.get("washInfo");
        Integer type = (Integer) params.get("type");
        Integer userId = (Integer) params.get("userId");

        int res = userService.setUserInfo(wxInfo, washInfo, type, userId);
        JSONObject json = new JSONObject();
        json.put("data", res);
        return json.toString();
    }
}
