package com.washingapp.washingtonwashuser.mapper;

import com.washingapp.washingtonwashuser.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
  @Select("SELECT * FROM users")
  List<User> getUser();

  @Insert("INSERT INTO users (wxInfo, washInfo, type) VALUES(#{wxInfo}, #{washInfo}, #{type})")
  int createUser(
      @Param("wxInfo") String wxInfo,
      @Param("washInfo") String washInfo,
      @Param("type") int type
  );

  @Update("UPDATE users SET wxInfo = #{wxInfo}, washInfo = #{washInfo}, type = #{type} WHERE userId = #{userId}")
  int setUserInfo(
      @Param("wxInfo") String wxInfo,
      @Param("washInfo") String washInfo,
      @Param("type") int type,
      @Param("userId") long userId
  );
}
