package com.spring.unfactory.service;

import com.spring.unfactory.dao.AccountDao;
import com.spring.unfactory.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao = new AccountDaoImpl();

    @Override
    public int saveAccount() {
        return accountDao.save();
    }
}
