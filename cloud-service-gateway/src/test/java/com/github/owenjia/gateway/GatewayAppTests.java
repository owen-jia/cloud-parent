package com.github.owenjia.gateway;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jiawenjun on 2017/10/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GatewayApp.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GatewayAppTests {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void get() throws Exception {
        String tmp = testRestTemplate.getForObject("/v2/say/212",String.class);
        Assert.assertNotNull(tmp);
    }
}
