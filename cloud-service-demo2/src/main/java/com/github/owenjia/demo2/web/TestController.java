package com.github.owenjia.demo2.web;

import com.github.owenjia.demo2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiawenjun on 2017/10/12
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping(value = "say/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable(value = "name") String name){
        return testService.sayHello(name);
    }

    @RequestMapping(value = "say2",method = RequestMethod.POST)
    @ResponseBody
    public String sayHello2(@RequestParam("name") String name){
        return "hello "+name+", this is sayHello2 method";
    }

    @Value("${demo2.name}")
    String name;
    @Value("${demo2.age}")
    Integer age;

    @GetMapping("config")
    @ResponseBody
    public String testConfig(){
        return "He name is " +name + ",Age is " + age;
    }
}
