package spring.factory;

import spring.dao.AccountDao;
import spring.dao.AccountDaoImpl;
import spring.service.AccountService;
import spring.service.AccountServiceImpl;

public class InstanceFactory {

    public AccountService getAccountService(){
        return  new AccountServiceImpl();
    }

    public AccountDao getAccountDao(){
        return  new AccountDaoImpl();
    }
}
