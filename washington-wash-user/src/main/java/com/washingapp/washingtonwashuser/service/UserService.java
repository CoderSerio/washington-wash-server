package com.washingapp.washingtonwashuser.service;

import com.washingapp.washingtonwashuser.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

  int createUser (String wxInfo, String washInfo, Integer type);

  List<User> getUser();

  int setUserInfo(String wxInfo, String washInfo, Integer type, Integer userId);
}
