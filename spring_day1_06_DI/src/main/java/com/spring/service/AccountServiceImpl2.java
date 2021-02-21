package com.spring.service;

import java.util.Date;

public class AccountServiceImpl2 implements AccountService{

    private String name;
    private Integer age;
    private Date birthday;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void saveAccount() {
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("birthday=" + birthday);
    }
}
