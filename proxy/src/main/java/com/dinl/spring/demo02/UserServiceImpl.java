package com.dinl.spring.demo02;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加一个功能");
    }

    @Override
    public void delete() {
        System.out.println("删除一个功能");
    }

    @Override
    public void update() {
        System.out.println("更新一次功能");
    }

    @Override
    public void query() {
        System.out.println("查询一次");
    }
}
