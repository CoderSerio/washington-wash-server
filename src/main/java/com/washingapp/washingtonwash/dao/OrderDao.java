package com.washingapp.washingtonwash.dao;


import com.alibaba.fastjson.JSONObject;
import com.washingapp.washingtonwash.pojo.Order;

import java.util.Collection;
import java.util.Map;



public class OrderDao {
  private static Map<Integer, Order> orders = null;
  static {
    orders.put(
        1,
        new Order(
            1,
            1000001,
            2000001,
            JSONObject.parseObject("{\"status\": 10}"),
            ""
        )
    );
    orders.put(
        2,
        new Order(
            2,
            1000001,
            2000001,
            JSONObject.parseObject("{\"status\": 20}"),
            ""
        )
    );
    orders.put(
        3,
        new Order(
            3,
            1000001,
            2000001,
            JSONObject.parseObject("{\"status\": 30}"),
            ""
        )
    );
    orders.put(
        4,
        new Order(
            4,
            1000001,
            2000001,
            JSONObject.parseObject("{\"status\": 40}"),
            ""
        )
    );
    orders.put(
        5,
        new Order(
            5,
            1000001,
            2000001,
            JSONObject.parseObject("{\"status\": 50}"),
            "哈哈哈哈"
        )
    );
  }

  public Collection<Order> getOrders () {
    return orders.values();
  }

  public Order getOrderById (Integer orderId) {
    return orders.get(orderId);
  }

  // 先随便乱写的
  public void createOrder (Integer orderId) {
    orders.put(
        5,
        new Order(
            orderId,
            1000001,
            2000001,
            JSONObject.parseObject("{\"status\": 10}"),
            "创建的"
        )
    );
  }
}
