package chapterFive;

public class AccountModified {
    private String name;
    private double balance;

    public AccountModified(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void depositMoney(double deposit){
        if (deposit > 0){
            balance = balance + deposit;
        }

    }
    public double depositMoney(){
        return balance;
    }

    public void accountName(String name){
        this.name = name;
    }
    public String accountName(){
        return  name;
    }
}
