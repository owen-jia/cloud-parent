package com.github.owenjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * service demo1
 */
@SpringBootApplication
@EnableEurekaClient
public class Demo1App {

    public static void main(String[] args) {
        SpringApplication.run(Demo1App.class, args);
    }
}
