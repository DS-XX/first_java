package com.dingding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dingding.mapper")
public class mysqlTest {

    public static void main(String[] args) {
        SpringApplication.run(mysqlTest.class, args);
    }

}
