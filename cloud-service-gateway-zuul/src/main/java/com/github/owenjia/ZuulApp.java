package com.github.owenjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关中心
 * @author Owen Jia at 2020-03-19
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApp {
    public static void main( String[] args ) {
        SpringApplication.run(ZuulApp.class, args);
    }
}
