package chapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;
    @BeforeEach
    void startAllTestWith(){
        account = new Account(00, 1111);
    }

//    @Test
//    void canChangeAccountBalance(){
//    account.setBalance(1.00);
//    assertEquals(1.00, account.getBalance());
//    }
//
//    @Test
//    void canGetAccountBalance(){
//        account.setBalance(6.00);
//        assertEquals(6.00, account.getBalance());
//    }

//    @Test
//    void constructorCanInstantiateObject(){
//      Account  account = new Account(200.00);
//        assertEquals(200.00, account.getBalance());
//    }
    @Test
    void customerCanDepositMoneyTest(){

        account.depositMoney(2500, 1111);
        assertEquals(2500, account.getBalance());
    }
    @Test
    void customerCanDepositMoneyTwiceTest(){

        account.depositMoney(2500, 1111);
        account.depositMoney(2500,1111);
        account.depositMoney(2500,1111);
        assertEquals(7500, account.getBalance());
        System.out.println("transaction successful"+ " " + account.getBalance());
    }

    @Test

    void customerCanWithdrawCashTest(){
        account.depositMoney(2500, 1111);
        account.withdrawMoney(1000);
        assertEquals(1500, account.getBalance());
    }
    @Test
    void customerWillHaveToWithdrawWithPin(){
        account.depositMoney(2500, 1111);
        account.withdrawMoney(1500);
        account.customerPin(2358);
       assertEquals(1000, account.getBalance());
    }
    @Test
    void customerCannotWithdrawMoreThanItsBalanceTest(){
        account.depositMoney(2500, 1111);
        account.withdrawMoney(3000);
       // account.cannotTakeOverdraft();
        assertEquals(2500, account.getBalance());
        System.out.println(account.getBalance());
    }
//    @Test
//    void customerCannotDepositWithoutPInTest(){
//        account.depositMoney(2500);
//        account.insertPin();
//
    //}
}
