package org.avol.springaop.config;

import org.avol.springaop.aspects.LoggingAspect;
import org.avol.springaop.service.SampleService;
import org.avol.springaop.service.impl.SampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Durga on 8/3/2016.
 */
@Configuration
@EnableAspectJAutoProxy
//@ComponentScan(basePackages = {"org.avol.springaop"})
public class AopConfig {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public SampleService sampleService() {
        return new SampleServiceImpl();
    }
}
