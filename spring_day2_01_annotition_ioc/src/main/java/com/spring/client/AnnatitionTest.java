package com.spring.client;

import com.spring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnatitionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.saveAccount();

        AccountService accountService2 = (AccountService) applicationContext.getBean("accountService");
        System.out.println(accountService == accountService2);
    }
}
