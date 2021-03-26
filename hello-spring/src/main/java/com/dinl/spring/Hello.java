package com.dinl.spring;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Hello {
    private String str;

    public Hello() {
        System.out.println("调用了无参构造器");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        System.out.println("使用了set方法");
        this.str = str;
    }
}
