package testBankAccount;

import arant.molly.inheritance.bankAccountManager.BusinessAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mollyarant on 5/3/17.
 */
public class TestBusinessAccount {
    BusinessAccount accountBalance;

    @Before
    public void setUp(){
        accountBalance= new BusinessAccount("Name", 10);
    }


    @Test

    public void testDepositToBusinessAccountBalanceAboveMinimum() {


        //:given

            double expectedResult= 120;


        //:when
        double actualResult = accountBalance.depositToAccountBalance(110);


        //:then
        Assert.assertEquals("This method should add to the balance of the business account", expectedResult,actualResult,0);
    }

    @Test

    public void testDepositToBusinessAccountBalanceBelowMinimum() {


        //:given

        double expectedResult= 10;


        //:when
        double actualResult = accountBalance.depositToAccountBalance(30);

        //:then
        Assert.assertEquals("This method should reject add to the balance of the business account", expectedResult, actualResult, 0);
    }

    @Test
    public void testWithdrawalFromBusinessAccountBalance(){


        //given
        double expectedResult=1;

        //:when
        double actualResult = accountBalance.withdrawalFromAccountBalance(9);

        //:then
        Assert.assertEquals("This method should lower the account balance by the withdrawal amount", expectedResult, actualResult, 0);
    }

    @Test
    public void testWithdrawalFromBusinessAccountBalanceIfLargerThanBalance(){

        //given

        double expectedResult = -1;

        //:when
        double actualResult = accountBalance.withdrawalFromAccountBalance(11);

        //:then
        Assert.assertEquals("Should return a negative balance and  warning of overdraft to user", expectedResult, actualResult, 0);
    }






}
