package com.github.owenjia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Owen Jia
 * @time: 2020/1/17 9:58
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model){
        model.addAttribute("key","hello world");
        return "index";
    }
}
