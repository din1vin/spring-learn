package com.dinl.spring.demo;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Client {
    public static void main(String[] args) throws Throwable {
        HouseKeeper houseKeeper = new HouseKeeper();

        ProxyInvocationHandle proxyInvocationHandle = new ProxyInvocationHandle();
        proxyInvocationHandle.setObj(houseKeeper);
        Rent proxy =(Rent) proxyInvocationHandle.getProxy();
        proxy.rent();
    }
}
