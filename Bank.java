package BankProject;


import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts= new ArrayList<>();

    public void createAccount(String firstName, String lastName) {
        Account account = new Account();
        account.createAccountNumber();
        accounts.add(account);


    }


    public int getTotalNumberOfAccounts() {
        return accounts.size();
    }
}
