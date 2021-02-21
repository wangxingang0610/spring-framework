package com.spring.service;

import com.spring.dao.AccountDao;
import com.spring.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

//    private int num = 1;

    @Override
    public int saveAccount() {
//        System.out.println("num=" + num);
//        num ++;
        return accountDao.save();
    }
}
