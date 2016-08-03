package org.avol.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Durga on 8/3/2016.
 */
@Aspect
//@Component
public class LoggingAspect {

    @Pointcut("execution(* org.avol.springaop.service.SampleService.*())")
    public void hijackMe(){}

    @Before(value = "hijackMe()")
    public void before(){
        System.out.println("LoggingAspect.logMessage");
    }

    @AfterReturning(pointcut = "hijackMe()", returning = "retVal")
    public void afterReturning(JoinPoint joinPoint, String retVal) {
        System.out.println("RetVal: " + retVal);
    }
}
