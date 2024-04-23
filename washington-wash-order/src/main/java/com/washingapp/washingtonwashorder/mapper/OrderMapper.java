package com.washingapp.washingtonwashorder.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper {

    @Select("select COUNT(*) from order")
    int getOrderNum();
}
