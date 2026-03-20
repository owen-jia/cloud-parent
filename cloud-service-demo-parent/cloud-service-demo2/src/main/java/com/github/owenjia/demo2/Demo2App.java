package com.github.owenjia.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Demo2
 */
@SpringBootApplication
@EnableFeignClients
public class Demo2App {
    public static void main( String[] args ) {
        SpringApplication.run(Demo2App.class, args);
    }
}
