package com.dinl.spring.demo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class ProxyInvocationHandle implements InvocationHandler {
    private Object  obj; //代理的对象

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj,args);
    }
}
