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
        CheckingAccount accountBalance = new CheckingAccount();
        double expectedResult=20;

        //: When
        double actualResult= accountBalance.depositToCheckingAccountBalance(2, 18);

        //: Then

        Assert.assertEquals("should add value to account balance", expectedResult, actualResult, 0);


    }

    @Test
    public void testWithdrawalFromCheckingAccountBalance(){

        //:given
        CheckingAccount accountBalance =new CheckingAccount();
        double expectedResult=5;

        //: when
        double actualResult = accountBalance.withdrawalFromCheckingAccountBalance(10, 5);

        //: then

        Assert.assertEquals("Should reduce the account balance", expectedResult,actualResult,0);

    }
}
