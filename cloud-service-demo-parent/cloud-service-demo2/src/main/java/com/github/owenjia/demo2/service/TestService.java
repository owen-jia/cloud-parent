package com.github.owenjia.demo2.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiawenjun on 2017/10/12
 */
public interface TestService {

    @RequestMapping(value="/say/{name}", method= RequestMethod.GET)
    @ResponseBody
    String sayHello(@PathVariable(name = "name") String name);
}
