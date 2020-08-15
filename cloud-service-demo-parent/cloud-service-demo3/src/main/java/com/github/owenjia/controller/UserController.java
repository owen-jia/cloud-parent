package com.github.owenjia.controller;

import com.github.owenjia.service.ITestService;
import com.github.owenjia.service.IUserService;
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
    ITestService iTestService;
    @Autowired(required = false)
    IUserService iUserService;

    @GetMapping("/user/users")
    public String getUsers(){
        return "users is success" + iUserService.getUserId("13567890123");
    }

    @HystrixCommand(fallbackMethod = "defaultFindUser")
    @GetMapping("/user/find")
    public String getFindUser(){
        return iTestService.sayHello("test");
    }

    public String defaultFindUser(){
        return "hystrix default data";
    }
}
