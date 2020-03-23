package com.github.owenjia.controller;

import com.github.owenjia.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Owen Jia
 * @time: 2020/3/23 16:09
 */
@RestController
public class UserController {

    @Autowired(required = false)
    TestService testService;

    @GetMapping("/user/users")
    public String getUsers(){
        return "users is success";
    }

    @HystrixCommand(fallbackMethod = "defaultFindUser")
    @GetMapping("/user/find")
    public String getFindUser(){
        return testService.sayHello("test");
    }

    public String defaultFindUser(){
        return "hystrix default data";
    }
}
