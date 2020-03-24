package com.github.owenjia.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Owen Jia on 2017/10/12
 */
@FeignClient("service-demo1")
public interface ITestService {

    @RequestMapping(value="/say/{name}", method= RequestMethod.GET)
    @ResponseBody
    String sayHello(@PathVariable(name = "name") String name);
}
