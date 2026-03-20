package com.github.owenjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Demo3
 * @author Owen Jia on 2020-03-23
 */
@SpringBootApplication
@EnableFeignClients
public class Demo3App {
    public static void main( String[] args ) {
        SpringApplication.run(Demo3App.class,args);
    }
}
