package com.dinl.spring.demo01;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Proxy implements Rent{
    private HouseKeeper houseKeeper;

    public Proxy() {
    }

    public Proxy(HouseKeeper houseKeeper) {
        this.houseKeeper = houseKeeper;
    }


    @Override
    public void rent() {
        houseKeeper.rent();
    }
}
