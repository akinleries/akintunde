package BankProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank1;
    Account account;
    @BeforeEach
    void setUp() {
        bank1 = new Bank();
        account = new Account();
    }

    //    @AfterEach
//    void tearDown() {
//    }
//
    @Test
    void bankIsCreatedTest() {
        assertNotNull(bank1);

    }

    @Test
    void bankAccountCanBeCreated() {
        bank1.createAccount("salisu", "adams");
        assertEquals(1, bank1.getTotalNumberOfAccounts());

    }

    @Test
    void bankCanCreateMultipleAccount() {

        bank1.createAccount("salisu", "adams");
        bank1.createAccount("lassis", "elenu");
        assertEquals(2, bank1.getTotalNumberOfAccounts());

    }
    @Test
    void bankAccountHasAccountNumber(){

        int userAccountNumber = account.accountNumber;
        assertNotNull(userAccountNumber);
    }
    @Test
    void accountHaveAccountNumber(){

        account.createAccountNumber();
        assertEquals(1, account.getAccountNumber());
    }
    @Test
    void  accountUserCanDepositMoney(){
        account.depositMoney(3000.00);
        assertEquals(3000, account.getAccountBalance());

    }
    @Test
    void accountUserCanDepositTwice(){
        account.depositMoney(3000.00);
        account.depositMoney(2000.00);
        assertEquals(5000, account.getAccountBalance());

    }
    @Test
    void accountUserCantDepositZeroAmount(){
        account.depositMoney(-10.00);
        assertEquals(0, account.getAccountBalance());

    }
    @Test
    void userMustHaveAnAccountToDepositMoney(){
        assertNotNull(account);
        account.depositMoney(3000.00);
        assertEquals(3000, account.getAccountBalance());
    }

    @Test
    void userCanWithdrawMoney(){
        account.depositMoney(3000.00);
        assertEquals(3000.00, account.getAccountBalance());
        account.withdrawMoney(2000.00);
        assertEquals(1000.00, account.getAccountBalance());
    }
    @Test
    void userCantWithDrawAmountMoreThanItsBalance(){
        account.depositMoney(3000.00);
        assertEquals(3000.00, account.getAccountBalance());
        account.withdrawMoney(200000.00);
        assertEquals(3000.00, account.getAccountBalance());
    }
    @Test
    void userCantWithdrawZeroAmount(){
        account.depositMoney(3000.00);
        assertEquals(3000.00, account.getAccountBalance());
        account.withdrawMoney(-10.00);
        assertEquals(3000.00, account.getAccountBalance());
    }
    @Test
    void userCanCreatePin(){
        account.createPin(1234);
        assertEquals(1234, account.getPin());
    }


}