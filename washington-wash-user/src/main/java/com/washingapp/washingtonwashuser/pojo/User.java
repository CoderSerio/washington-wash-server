package com.washingapp.washingtonwashuser.pojo;

public class User {

  private long userId;           // bigint, NO
  private String wxInfo;   // json, YES
  private String washInfo;  // json, YES
  private int type;              // int, YES

  // Getters and Setters

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getWxInfo() {
    return wxInfo;
  }

  public void setWxInfo(String wxInfo) {
    this.wxInfo = wxInfo;
  }

  public String getWashInfo() {
    return washInfo;
  }

  public void setWashInfo(String washInfo) {
    this.washInfo = washInfo;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }
}