package com.washingapp.washingtonwash.dao;

import java.util.Collection;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.washingapp.washingtonwash.pojo.Order;
import com.washingapp.washingtonwash.pojo.User;

public class UserDao {
    private static Map<Integer, User> users = null;
    static {
        users.put(
            1,
            new User(
                1,
                1,
                JSONObject.parseObject("{\"name\": \"哈哈\", password: \"哈哈11\"}"),
                JSONObject.parseObject("{\"name\": \"哈哈\", password: \"哈哈11\"}")
            )
        );
        users.put(
            1,
            new User(
                2,
                2,
                JSONObject.parseObject("{\"name\": \"哈哈\", password: \"哈哈11\"}"),
                JSONObject.parseObject("{\"name\": \"哈哈\", password: \"哈哈11\"}")
            )
        );
    }

    public Collection<User> getUsers () {
      return users.values();
    }

    public User getUserById (Integer userId) {
      return users.get(userId);
    }
}
