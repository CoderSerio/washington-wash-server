package com.washingapp.washingtonwashuser.service.impl;

import com.washingapp.washingtonwashuser.mapper.UserMapper;
import com.washingapp.washingtonwashuser.pojo.User;
import com.washingapp.washingtonwashuser.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
  @Resource
  public UserMapper userMapper;

  public int createUser(String wxInfo, String washInfo, Integer type) {
    System.out.println("----------2");
    System.out.println(wxInfo);
    System.out.println("----------2");
    return userMapper.createUser(wxInfo, washInfo, type);
  }

  public List<User> getUser(){
    return userMapper.getUser();
  }

  public int setUserInfo(String wxInfo, String washInfo, Integer type, Integer userId){
    return userMapper.setUserInfo(wxInfo, washInfo, type, userId);
  }
}

