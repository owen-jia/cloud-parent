package com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jiawenjun on 2017/10/10
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverApp {

    public static void main(String[] args){
        SpringApplication.run(DiscoverApp.class, args);
    }
}
