package com.spring.service;

import com.spring.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("accountService")
//@Scope("prototype")//不加注解，默认单例
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount() {
        accountDao.save();
    }
}
