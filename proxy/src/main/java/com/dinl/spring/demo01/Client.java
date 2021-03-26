package com.dinl.spring.demo01;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Client {
    public static void main(String[] args) {

        //直接找房东租房
        HouseKeeper host = new HouseKeeper();
        host.rent();

        //中介租房
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
