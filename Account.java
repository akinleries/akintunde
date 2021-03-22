package BankProject;


public class Account {
    public int accountNumber;
    private double balance;
    private int pin;

    public void createAccountNumber() {
        accountNumber++;
    }


    public int getAccountNumber() {
       return accountNumber;
    }

    public void depositMoney(double amount) {
        if (amount > 0)
        balance += amount;

    }

    public double getAccountBalance() {
        return balance;
    }

    public void withdrawMoney(double amount) {

        if (balance >= amount && amount > 0)

        balance -= amount;
    }

    public void createPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
}
