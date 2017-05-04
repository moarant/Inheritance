package arant.molly.inheritance.bankAccountManager;

/**
 * Created by mollyarant on 5/3/17.
 */
public abstract class Account {
    String accountName;
    double accountBalance;


    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public abstract double depositToAccountBalance(double depositAmount);

    public abstract double withdrawalFromAccountBalance(double withdrawalAmount);


//    public abstract void createAccount(String accountType);
//
//    public abstract boolean closeAccount(String accountType);


//    public double depositToAccountBalance(double accountBalance, double x){
//        double newAccountBalance = accountBalance +x;
//        return newAccountBalance;
//    };

    //public abstract double withdrawalFromAccountBalance();





}
