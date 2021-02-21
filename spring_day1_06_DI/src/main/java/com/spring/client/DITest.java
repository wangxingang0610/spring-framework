package com.spring.client;

import com.spring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("--------注入方式1： 构造方法-----");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService1");
        accountService.saveAccount();

        System.out.println("------注入方式2： set方法(基本类型、String类型)--------");
        AccountService accountService2 = (AccountService) applicationContext.getBean("accountService2");
        accountService2.saveAccount();


        System.out.println("------注入方式2： set方法(复杂、集合类型)--------");
        AccountService accountService3 = (AccountService) applicationContext.getBean("accountService3");
        accountService3.saveAccount();
    }
}
