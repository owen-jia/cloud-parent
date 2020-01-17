package com.github.owenjia.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置服务启动器
 * @author: Owen Jia
 * @time: 2018/7/23 11:27
 */
@SpringBootApplication(scanBasePackages = "com.ts.config")
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
