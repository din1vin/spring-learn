package com.dinl.spring.log;

import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Log implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {

    }
}
