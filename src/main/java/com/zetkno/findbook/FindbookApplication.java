package com.zetkno.findbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindbookApplication.class, args);
    }
}
