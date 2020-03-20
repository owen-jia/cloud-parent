package com.github.owenjia.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Demo2
 */
@SpringBootApplication
@EnableEurekaClient
public class Demo2App {
    public static void main( String[] args ) {
        SpringApplication.run(Demo2App.class, args);
    }
}
