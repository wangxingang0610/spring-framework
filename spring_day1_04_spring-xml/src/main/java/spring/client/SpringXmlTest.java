package spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import spring.service.AccountService;

public class SpringXmlTest {

    public static void main(String[] args) throws Exception{
        //
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.saveAccount();

        AccountService accountService2= (AccountService) applicationContext.getBean("accountService");
        System.out.println(accountService == accountService2);


        //
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml")) ;
        AccountService accountService3 = (AccountService) beanFactory.getBean("accountService");
        AccountService accountService4 = (AccountService) beanFactory.getBean("accountService");

        System.out.println(accountService3 == accountService4);

    }
}
