package com.spring.dao;

public class AccountDaoImpl implements AccountDao {

    @Override
    public int save() {
        System.out.println("保存了账号信息");
        return 1;
    }
}
