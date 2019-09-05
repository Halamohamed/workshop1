package se.ceutbildning.hala;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
    private static BankAccount bankAccount;

    static {
        try {
            bankAccount = new BankAccount(3000.0, new Customer("test","testson","test@ec.com"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_object() throws Exception {

         String accNo = bankAccount.getId();

        Assert.assertNotNull(accNo);
        Assert.assertEquals(5000, bankAccount.getSaldo(),0);
    }
    @Test
    public void test_deposit(){
        Assert.assertEquals(4000,bankAccount.deposit(1000),0);

    }

    @Test
    public void test_withdraw(){
        Assert.assertEquals(-1,bankAccount.withdraw(3500),0);
    }
}
