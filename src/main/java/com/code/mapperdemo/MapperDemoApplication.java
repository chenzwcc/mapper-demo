package com.code.mapperdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.code.mapperdemo.mapper")
public class MapperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperDemoApplication.class, args);
    }

}
