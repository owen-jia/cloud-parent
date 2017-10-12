package com.ts.demo2.web;

import com.ts.demo2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
