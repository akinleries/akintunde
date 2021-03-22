package chapterFive;

import javax.swing.*;

public class Account {

    private int balance;
    private int pin;

    public Account(int balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public void depositMoney(int amount, int pin) {

        if (this.pin == pin)
            balance += amount;
        if (this.pin != pin)
            System.out.println("your pin is incorrect");


    }

    public int getBalance() {
        return balance;
    }

    public void withdrawMoney(int amount) {

        if (amount > balance) {
            System.out.println("sorry you dont have up to the stated amount");
        } else {
            balance = balance - amount;
        }
    }

    public void customerPin(int pin) {

        if (this.pin == pin)
            this.pin = pin;
        else if (this.pin != pin)
            System.out.println("your pin is incorrect");


    }

}
 
