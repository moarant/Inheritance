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
        if (depositAmount>=100) {
            double updatedAccountBalance = accountBalance += depositAmount;
            return updatedAccountBalance;
        }
        else{
            System.out.print("Business accounts require a minimum deposit of $100");
            return accountBalance;



        }
    }


    public double withdrawalFromAccountBalance(double withdrawalAmount){
        if(withdrawalAmount>accountBalance){
            System.out.println("Warning: you have overdrawn your account");
        }
        double updatedAccountBalance = accountBalance -= withdrawalAmount;
        return updatedAccountBalance;
    }

}
