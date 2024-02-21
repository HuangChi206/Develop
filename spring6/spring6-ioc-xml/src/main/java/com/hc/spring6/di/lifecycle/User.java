package com.hc.spring6.di.lifecycle;

import lombok.ToString;

/**
 * @author HuangChi
 * @since 2024/2/19
 */

@ToString
public class User {
    private Integer id;
    private String name;

    public User() {
        System.out.println("1、无参构造执行！");
    }

    public void setId(Integer id) {
        System.out.println("2、setId()方法执行");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("2、setName()方法执行");
        this.name = name;
    }

    public void init() {
        System.out.println("4、初始化方法！");
    }

    public void destroy() {
        System.out.println("7、销毁方法！");
    }
}
