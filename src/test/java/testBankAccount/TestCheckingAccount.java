package testBankAccount;

import arant.molly.inheritance.bankAccountManager.CheckingAccount;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mollyarant on 5/3/17.
 */
public class TestCheckingAccount {

    @Test
    public void testDepositToCheckingAccountBalance(){
        //:given
        CheckingAccount accountBalance = new CheckingAccount("Name", 4);
        double expectedResult=22;

        //: When
        double actualResult= accountBalance.depositToAccountBalance(18);

        //: Then

        Assert.assertEquals("should add value to account balance", expectedResult, actualResult, 0);


    }

    @Test
    public void testWithdrawalFromCheckingAccountBalance(){

        //:given
        CheckingAccount accountBalance =new CheckingAccount("Name", 10);
        double expectedResult=5;

        //: when
        double actualResult = accountBalance.withdrawalFromAccountBalance(5);

        //: then

        Assert.assertEquals("Should reduce the account balance", expectedResult,actualResult,0);

    }

    @Test
    public void testWithdrawalFromCheckingAccountIfGreaterThanBalance(){
        //given
        CheckingAccount accountBalance = new CheckingAccount("Name", 10);
        double expectedResult = -5;

        //when
        double actualResult = accountBalance.withdrawalFromAccountBalance(15);

        //then
        Assert.assertEquals("Should return a warning if there is less money in the account than is being withdrawn", expectedResult, actualResult,0);
    }
}
