package com.github.owenjia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Owen Jia
 * @time: 2020/1/17 10:59
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}
