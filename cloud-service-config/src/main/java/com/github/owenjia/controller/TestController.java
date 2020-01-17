package com.github.owenjia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Owen Jia
 * @time: 2018/7/23 16:03
 */
@RestController("test")
public class TestController {

    @GetMapping("hello")
    public String sayHello(){
        return "Hello. I am Config Server.Now time is " + System.currentTimeMillis();
    }
}
