package arant.molly.inheritance.bankAccountManager;

/**
 * Created by mollyarant on 5/3/17.
 */
public class BusinessAccount extends Account {

    public BusinessAccount(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;

    }


    public double depositToAccountBalance (double depositAmount){
        double updatedAccountBalance = accountBalance + depositAmount;
        return updatedAccountBalance;
    }


    public double withdrawalFromAccountBalance(double withdrawalAmount){
        if (accountBalance< withdrawalAmount){

        }
        double updatedAccountBalance = accountBalance -withdrawalAmount;
        return updatedAccountBalance;
    }

}
