package com.github.owenjia.controller;

import com.github.owenjia.config.DataSoucesCfg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiawenjun on 2017/10/11
 */
@Controller
public class TestController {

    @Autowired
    DataSoucesCfg dataSoucesCfg;

    @ResponseBody
    @RequestMapping(value = "say/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable(name = "name") String name) {
        return "hello "+name+", i am dem1.|" + dataSoucesCfg;
    }
}
