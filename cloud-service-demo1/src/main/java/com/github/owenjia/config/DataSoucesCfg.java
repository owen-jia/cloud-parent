package com.github.owenjia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Owen Jia
 * @time: 2020/1/17 14:34
 */
@Configuration
public class DataSoucesCfg {
    @Value("${mysql_address}")
    String driver;
    @Value("${jdbc.url}")
    String url;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "DataSoucesCfg{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
