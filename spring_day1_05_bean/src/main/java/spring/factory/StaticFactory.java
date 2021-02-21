package spring.factory;

import spring.service.AccountService;
import spring.service.AccountServiceImpl;

public class StaticFactory {
    public  static AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
