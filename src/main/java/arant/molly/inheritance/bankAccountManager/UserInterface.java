package arant.molly.inheritance.bankAccountManager;

import arant.molly.inheritance.ATM;

import java.util.Scanner;

/**
 * Created by mollyarant on 5/3/17.
 */
public class UserInterface {

    Scanner scanner;

    public UserInterface(){

        this.scanner = new Scanner(System.in);

    }

        public String promptUserForAccountType(){

        String accountType;

            System.out.println("Please select an account");
            accountType =  scanner.nextLine();
            System.out.println("You selected" + accountType);

            return accountType;
        }

        public String promptForFunctionType(){

            String functionType;
            System.out.println("What would you like to do with your account? \n" +
                    "Submit Deposit if you would like to add money to your account \n" +
                    "Submit Withdrawal if you would like to withdrawal money from your account");
            functionType = scanner.nextLine();
            System.out.println("You selected " + functionType);

            return functionType;

        }

        public double promptForMonetaryAmount(){
            Double monetaryAmount;
            System.out.println("Please input a dollar amount to be used with this function");
            monetaryAmount = scanner.nextDouble();
            System.out.print("You inputted" + monetaryAmount +" dollars");
            return monetaryAmount;
        }





}
