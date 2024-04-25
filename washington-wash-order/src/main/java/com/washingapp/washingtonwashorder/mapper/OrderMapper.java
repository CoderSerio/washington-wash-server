
package com.washingapp.washingtonwashorder.mapper;

import com.washingapp.washingtonwashorder.pojo.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM orders")
    List<Order> getOrder();

    @Insert("INSERT INTO orders (userId, orderInfo, businessId) VALUES(#{userId}, #{orderInfo}, -1)")
    int createOrder(
        @Param("orderInfo") String orderInfo,
        @Param("userId") long userId
    );

    @Update("UPDATE orders SET orderInfo = #{orderInfo}, userId = #{userId}, businessId = #{businessId} WHERE orderId = #{orderId}")
    int setOrderInfo(
        @Param("orderInfo") String orderInfo,
        @Param("userId") long userId,
        @Param("businessId") long businessId,
        @Param("orderId") long orderId
    );
}
