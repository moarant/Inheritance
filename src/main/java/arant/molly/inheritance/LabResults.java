package arant.molly.inheritance;

import arant.molly.inheritance.bankAccountManager.BusinessAccount;
import arant.molly.inheritance.bankAccountManager.CheckingAccount;
import arant.molly.inheritance.bankAccountManager.SavingsAccount;
import arant.molly.inheritance.classManager.InventoryManager;
import arant.molly.inheritance.classManager.Product;
import arant.molly.inheritance.humansAndSuperHumans.Human;
import arant.molly.inheritance.humansAndSuperHumans.SuperHuman;
import arant.molly.inheritance.rotateArray.Rotation;

/**
 * Created by mollyarant on 5/3/17.
 */
 class LabResults {

    static void printLabResults(){

        Rotation rotation = new Rotation();
        InventoryManager manager= new InventoryManager();



//        ArrayList<Integer> numbers = new ArrayList();

        for (int i = 0; i < 7; i++) {
            rotation.add(i);

        }

        System.out.println("Before rotate: " + rotation);


        rotation.rotate(rotation, 2);



        Human molly= new Human ("Molly", 25, true, "Student", "123 Sesame Street");
        System.out.println(molly);

        SuperHuman heroIdentity= new SuperHuman ("Molly", 25, true, "Student", "123 Sesame Street", true, "unknown", "telekenesis" );
        System.out.println(heroIdentity);

        Product basketball = new Product ("Basketball", 25.00, 15);
        System.out.println(basketball);
        manager.calculateValueOfProduct(basketball.getQuantity(), basketball.getPrice());


        Product lamp = new Product("Lamp", 32.50, 10);
        System.out.println(lamp);
        manager.calculateValueOfProduct(lamp.getQuantity(), lamp.getPrice());



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
