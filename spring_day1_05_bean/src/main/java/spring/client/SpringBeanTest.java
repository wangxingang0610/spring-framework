package spring.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.service.AccountService;

public class SpringBeanTest {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService as  = (AccountService)ac.getBean("accountService");
        as.saveAccount();
    }
}
