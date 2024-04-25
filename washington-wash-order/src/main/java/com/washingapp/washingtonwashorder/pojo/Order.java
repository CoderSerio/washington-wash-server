package com.washingapp.washingtonwashorder.pojo;

import java.util.Map;

public class Order {

  private long orderId;         // bigint, NO
  private long userId;         // bigint, NO
  private long businessId;     // bigint, NO
  private String orderInfo;  // json, YES

  // Getters and Setters

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(long businessId) {
    this.businessId = businessId;
  }

  public String getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(String orderInfo) {
    this.orderInfo = orderInfo;
  }
}