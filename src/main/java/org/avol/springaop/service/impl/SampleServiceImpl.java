package org.avol.springaop.service.impl;

import org.avol.springaop.service.SampleService;
import org.springframework.stereotype.Service;

/**
 * Created by Durga on 8/3/2016.
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public void sayHello() {
        System.out.println("SampleServiceImpl.sayHello");
    }

    @Override
    public String getMsg() {
        return "Return msg from Service.";
    }
}
