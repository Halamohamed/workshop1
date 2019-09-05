package se.ceutbildning.hala;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountStorageTest {

    private static String id;
     private static BankAccount bankAccount;
    private static BankAccountStorage bankAccountStorage ;

    static {
        try {
            bankAccountStorage = new BankAccountStorage();

            bankAccount = new BankAccount(3000, new Customer("test1","testson1","test1@ec.com"));
            bankAccountStorage.addBankAccount(bankAccount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public BankAccount[] data() throws Exception {

        BankAccount[] bankAccount ={ new BankAccount(5000, new Customer("test","testson","test@ec.com")),
                new BankAccount(3000, new Customer("test2","testson2","test2@ec.com"))};
        return bankAccount;

    }
    @Before
    public void init() throws Exception {

        for (BankAccount account : data()){
            bankAccountStorage.addBankAccount(account);
        }

         id = bankAccount.getId();

    }


    @Test
    public void test_findById(){

        Assert.assertEquals(id,bankAccountStorage.findById(id).getId() );

    }
}
