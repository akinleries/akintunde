package chapterFive;

public class AccountModifiedTest {

    public static void main(String[] args) {
        AccountModified accountModified1 = new AccountModified("Bessie jane", 20000.00);
        AccountModified accountModified2 = new AccountModified("Sultan douglas", 10000.00);
    displayAccount(accountModified1);
    displayAccount(accountModified2);
    }

    public static void displayAccount(AccountModified account){

        System.out.println(account.accountName());
        System.out.println(account.depositMoney());
    }

}
