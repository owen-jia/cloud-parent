package com.ts.demo2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiawenjun on 2017/10/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Demo2App.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void sayHello(){
        System.out.println("hello world");
    }

    @Test
    public void get() throws Exception {
        String tmp = testRestTemplate.getForObject("say/212",String.class);
        Assert.assertNotNull(tmp);
    }

    @Test
    public void post() {
        MultiValueMap multiValueMap = new LinkedMultiValueMap();
        multiValueMap.add("name","Owen Jia");
        String tmp = testRestTemplate.postForObject("say2",multiValueMap,String.class);
        Assert.assertNotNull(tmp);
    }
}
