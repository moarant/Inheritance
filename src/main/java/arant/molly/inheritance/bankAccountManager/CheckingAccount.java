package arant.molly.inheritance.bankAccountManager;

/**
 * Created by mollyarant on 5/3/17.
 */
public class CheckingAccount extends Account{

    public CheckingAccount(String accountName, double accountBalance){

        this.accountName = accountName;
        this.accountBalance= accountBalance;

    }

    public CheckingAccount() {

    }


    public double depositToCheckingAccountBalance(double accountBalance, double x){
        double newAccountBalance = accountBalance +x;
        return newAccountBalance;
    };

    public double withdrawalFromCheckingAccountBalance(){
        ;
    }
}
