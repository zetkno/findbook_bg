package com.zetkno.findbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:kaptcha.xml"})
public class FindbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(FindbookApplication.class, args);
    }
}
