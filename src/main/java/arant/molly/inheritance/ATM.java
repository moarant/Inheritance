package arant.molly.inheritance;

import arant.molly.inheritance.bankAccountManager.Account;
import arant.molly.inheritance.bankAccountManager.CheckingAccount;

/**
 * Created by mollyarant on 5/3/17.
 */
public class ATM {


    public Account createNewAccount(String accountType, double balance, String name){

        if(accountType.equalsIgnoreCase("checking")){
            return new CheckingAccount(name, balance);
        }

        return  null;
    }


}
