package com.smile.springmybatiscrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.smile.springmybatiscrud.mapper")
@SpringBootApplication
public class SpringmybatiscrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatiscrudApplication.class, args);
    }

}
