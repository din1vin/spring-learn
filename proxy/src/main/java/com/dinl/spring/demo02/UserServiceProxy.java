package com.dinl.spring.demo02;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class UserServiceProxy implements UserService{
    private UserServiceImpl service;

    public void setService(UserServiceImpl service) {

        this.service = service;
    }

    @Override
    public void add() {
        log("add");
        service.add();
    }

    @Override
    public void delete() {
        log("delete");
        service.delete();
    }

    @Override
    public void update() {
        log("update");
        service.update();
    }

    @Override
    public void query() {
        log("query");
        service.query();
    }

    public void log(String message){
        System.out.println("[Debug]使用了 "+ message+"方法");
    }
}
