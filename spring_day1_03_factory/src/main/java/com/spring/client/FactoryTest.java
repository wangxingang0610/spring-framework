package com.spring.client;

import com.spring.factory.BeanFactory;
import com.spring.service.AccountService;

public class FactoryTest {

    public static void main(String[] args) throws Exception{
        AccountService accountService = (AccountService) BeanFactory.getBean("accountService");
        accountService.saveAccount();

        AccountService accountService2 = (AccountService) BeanFactory.getBean("accountService");
        accountService2.saveAccount();
        System.out.println("是否单例(同一个对象):" + (accountService == accountService2));
    }
}
