package com.dinl.spring.demo;

/**
 * @author : dingliang
 * @since : 2021/3/25
 * 房东
 **/
public class HouseKeeper implements Rent {
    @Override
    public void rent() {
        System.out.println("出租房子");
    }
}
