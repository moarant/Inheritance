package arant.molly.inheritance.bankAccountManager;

/**
 * Created by mollyarant on 5/3/17.
 */
public class CheckingAccount extends Account{

    public CheckingAccount(String accountName, double accountBalance){

        this.accountName = accountName;
        this.accountBalance= accountBalance;

    }


    public void createAccount(String accountType){
        
    }


    public double depositToAccountBalance(double depositAmount){
        double updatedAccountBalance = accountBalance +depositAmount;
        return updatedAccountBalance;
    }

    public double withdrawalFromAccountBalance(double withdrawalAmount){
        if(withdrawalAmount>accountBalance){
            System.out.println("Warning: you have overdrawn your account");
        }
        double updatedAccountBalance = accountBalance -withdrawalAmount;
        return updatedAccountBalance;
    }







}
