package se.ceutbildning.hala;

import java.util.Arrays;

public class BankAccountStorage {
    private BankAccount[] bankAccounts;

    public BankAccountStorage() {
        bankAccounts =  new BankAccount[0];
    }

    public void addBankAccount(BankAccount bankAccount){
        int offset = bankAccounts.length;
        bankAccounts = Arrays.copyOf(bankAccounts,bankAccounts.length+1);
        bankAccounts[offset]= bankAccount;
    }

    public BankAccount findById(String id){
        for (BankAccount account: bankAccounts){
            if(id.equals(account.getId())){
                return account;
            }
        }
        return null;
    }

    public int findIndex(String id){
        int index = -1;
        for (int i=0; i<bankAccounts.length; i++){
            if(id.equals(bankAccounts[i].getId())){
               index= i;
               break;
            }
        }
        return index;
    }

}
