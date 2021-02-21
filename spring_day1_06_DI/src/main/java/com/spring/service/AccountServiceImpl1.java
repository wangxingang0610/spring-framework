package com.spring.service;

import java.util.Date;

public class AccountServiceImpl1 implements AccountService{

    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl1(String name, Integer age, Date birthday){
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("birthday=" + birthday);
    }
}
