package com.spring.unfactory.client;

import com.spring.unfactory.service.AccountService;
import com.spring.unfactory.service.AccountServiceImpl;

public class UnFactoryTest {

    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();
        accountService.saveAccount();
    }
}
