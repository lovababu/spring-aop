package org.avol.springaop.service;

import org.avol.springaop.config.AopConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Durga on 8/3/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class SampleServiceTest {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testSampleService() {
        assertNotNull(sampleService);
    }

    @Test
    public void testSayHello() {
        sampleService.sayHello();
    }

    @Test
    public void testGetMsg() {
        sampleService.getMsg();
    }
}
