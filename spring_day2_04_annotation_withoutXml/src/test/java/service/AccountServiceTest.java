package service;

import com.account.config.SpringConfiguration;
import com.account.domain.Account;
import com.account.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAllAccount(){
        List<Account> allAccount = accountService.findAllAccount();
        System.out.println(allAccount);
    }
}
