package com.github.owenjia.service.impl;

import com.github.owenjia.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * hystrix fallback defaultClass
 * @author: Owen Jia
 * @time: 2020/3/24 14:28
 */
@Service
public class UserServiceFallbackImpl implements IUserService {
    @Override
    public Long getUserId(String mobile) {
        System.out.println(mobile);
        return 0L;
    }
}
