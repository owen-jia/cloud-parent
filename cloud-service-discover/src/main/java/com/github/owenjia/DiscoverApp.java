package com.github.owenjia;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册与发现服务
 * @author Owen Jia
 * @since 2017/10/10
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverApp {

    public static void main(String[] args){
        new SpringApplicationBuilder(DiscoverApp.class).web(WebApplicationType.SERVLET).run(args);
    }
}
