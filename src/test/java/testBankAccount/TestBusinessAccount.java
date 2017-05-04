package testBankAccount;

import arant.molly.inheritance.bankAccountManager.BusinessAccount;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 5/3/17.
 */
public class TestBusinessAccount {

    @Test

    public void testDepositToBusinessAccountBalance() {


        //:given
            BusinessAccount businessAccount = new BusinessAccount("Account", 2);
            double expectedResult= 12;


        //:when
        businessAccount.depositToAccountBalance(10);
        double actualResult= businessAccount.getAccountBalance();

        //:then
        Assert.assertEquals("This method should add to the balance of the business account", expectedResult, actualResult, 0);
    }

    @Test
    public void testWithdrawalFromBusinessAccountBalance(){


        //given
        BusinessAccount businessAccount= new BusinessAccount("Account", 10);
        double expectedResult=1;

        //:when
        businessAccount.withdrawalFromAccountBalance(9);
        double actualResult = businessAccount.getAccountBalance();

        //:then
        Assert.assertEquals("This method should lower the account balance by the withdrawal amount", expectedResult, actualResult, 0);
    }

    @Test
    public void testWithdrawalFromBusinessAccountBalanceIfLargerThanBalance(){

        //given
        BusinessAccount businessAccount = new BusinessAccount("Account", 8);
        double expectedResult = -1;

        //:when
        businessAccount.withdrawalFromAccountBalance(9);
        double actualResult= businessAccount.getAccountBalance();

        //:then
        Assert.assertEquals("Should return a negative balance and  warning of overdraft to user", expectedResult, actualResult, 0);
    }






}
