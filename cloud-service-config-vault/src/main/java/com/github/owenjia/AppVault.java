package com.github.owenjia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config Server Of Vault
 * @author Owen Jia
 * @since 2020-01-16 19:00
 */
@SpringBootApplication
@EnableConfigServer
public class AppVault {
    public static void main( String[] args ) {
        SpringApplication.run(AppVault.class,args);
    }
}
