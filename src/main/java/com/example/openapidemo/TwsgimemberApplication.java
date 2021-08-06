package com.example.openapidemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@MapperScan(basePackages= {"com.example.openapidemo.dao"})
public class TwsgimemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwsgimemberApplication.class, args);
    }

}
