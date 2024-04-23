package com.washingapp.washingtonwash.pojo;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Order {
    private Integer orderId;
    private Integer userId;
    private Integer businessId;
    private JSONObject orderInfo;
    private String comment;
}
