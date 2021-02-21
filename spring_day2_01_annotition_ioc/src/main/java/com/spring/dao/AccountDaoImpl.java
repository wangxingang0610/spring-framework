package com.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao{

    @Override
    public void save() {
        System.out.println("保存了数据");
    }
}
