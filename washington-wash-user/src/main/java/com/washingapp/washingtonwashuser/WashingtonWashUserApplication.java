package com.washingapp.washingtonwashuser;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class WashingtonWashUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(WashingtonWashUserApplication.class, args);
    }

}
