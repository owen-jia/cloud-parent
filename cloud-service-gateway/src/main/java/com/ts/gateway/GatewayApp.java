package com.ts.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jiawenjun on 2017/10/12
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApp {
    public static void main( String[] args )
    {
        SpringApplication.run(GatewayApp.class, args);
    }
}
