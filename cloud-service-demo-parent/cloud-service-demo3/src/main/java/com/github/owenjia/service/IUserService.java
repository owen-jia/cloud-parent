package com.github.owenjia.service;

import com.github.owenjia.service.impl.UserServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Owen Jia
 * @time: 2020/3/24 14:26
 */
@FeignClient(value = "service-demo2",fallback = UserServiceFallbackImpl.class)
public interface IUserService {

    @RequestMapping(value="/user/{mobile}", method= RequestMethod.GET)
    @ResponseBody
    Long getUserId(@PathVariable(name = "mobile") String mobile);
}
