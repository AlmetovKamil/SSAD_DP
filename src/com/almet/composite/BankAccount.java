package com.almet.composite;

public class BankAccount implements BankAccountComposite {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
