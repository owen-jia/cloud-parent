package com.ts.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author: Owen Jia
 * @time: 2018/7/23 13:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ConfigServerAppTest {


    @Test
    public void configurationAvailable() {
//        ResponseEntity<Map> entity = new TestRestTemplate().getForEntity(
//                "http://localhost:" + port + "/app/cloud", Map.class);
//        assertEquals(HttpStatus.OK, entity.getStatusCode());
    }
}
