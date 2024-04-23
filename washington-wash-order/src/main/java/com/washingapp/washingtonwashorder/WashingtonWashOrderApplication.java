package com.washingapp.washingtonwashorder;

import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class WashingtonWashOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WashingtonWashOrderApplication.class, args);
    }

}
