package javabootcampweek3.SurvivalStore;

/**
 * Created by Abram on 7/3/2015.
 */
public class Wallet {

    private double balance = 1000;

    public Wallet () {

    }

    public double spendMoney(double cost) {
        return balance - cost;
    }

    public double addMoney(double cost) {
        return balance + cost;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void viewWallet() {
        System.out.println(balance);
    }

}
