package com.almet.composite;

public class MainComposite {
    public static void main(String[] args) {
        BankAccountComposite mainAccount = new ConsolidatedStatement();
        BankAccountComposite account = new BankAccount(10);
        BankAccountComposite account2 = new BankAccount(20);
        BankAccountComposite account3 = new BankAccount(30);

        mainAccount.displayBalance();

    }
}
