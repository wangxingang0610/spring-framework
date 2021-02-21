package spring.service;


import spring.dao.AccountDao;

public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao ;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl对象创建了");
    }

    @Override
    public int saveAccount() {
        return accountDao.save();
    }
}
