package arant.molly.inheritance;


import arant.molly.inheritance.bankAccountManager.*;
import arant.molly.inheritance.classManager.InventoryManager;
import arant.molly.inheritance.classManager.Product;
import arant.molly.inheritance.humansAndSuperHumans.Human;
import arant.molly.inheritance.humansAndSuperHumans.SuperHuman;
import arant.molly.inheritance.rotateArray.Rotation;

public class Main
{
    public static void main( String[] args ) {
        LabResults.printLabResults();


        CheckingAccount myCheckingAccount = new CheckingAccount("genericName", 0.00);
        myCheckingAccount.setAccountBalance(10);
        System.out.println("New Checking Account Balance: $"+ myCheckingAccount.depositToAccountBalance(150));
        System.out.println("Checking Account Balance after Withdrawal:  $" + myCheckingAccount.withdrawalFromAccountBalance(100));


        BusinessAccount bossBusinessAccount = new BusinessAccount("Boss Business", 5000);
        System.out.println("Boss Business currently has $" +bossBusinessAccount.getAccountBalance() + " in the account");
        System.out.println("Boss Business balance after new Account Deposit $" + bossBusinessAccount.depositToAccountBalance(10000));
        System.out.println("Result after new withdrawal $" + bossBusinessAccount.withdrawalFromAccountBalance(2000));

        SavingsAccount personalSavingsAccount = new SavingsAccount("Personal Savings", 0.0);
        personalSavingsAccount.setAccountBalance(200);
        System.out.println("Current Balance of savings account: " +personalSavingsAccount.getAccountBalance());
        System.out.println("New Savings Account Balance: $" +personalSavingsAccount.depositToAccountBalance(3000));
        System.out.println("Savings Account Balance after new withdrawal: $" + personalSavingsAccount.withdrawalFromAccountBalance(450));

    }

}
