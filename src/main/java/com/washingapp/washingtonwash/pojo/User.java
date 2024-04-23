package com.washingapp.washingtonwash.pojo;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private Integer userId;
    private Integer type; // 1 用户 2 商家
    private JSONObject userInfo;

    private JSONObject washInfo;
}
