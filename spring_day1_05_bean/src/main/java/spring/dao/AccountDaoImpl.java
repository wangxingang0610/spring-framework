package spring.dao;

public class AccountDaoImpl implements AccountDao {

    public AccountDaoImpl() {
        System.out.println("AccountDaoImpl对象创建了");
    }

    @Override
    public int save() {
        System.out.println("保存了账号信息");
        return 1;
    }
}
