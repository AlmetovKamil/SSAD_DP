package com.almet.composite;

import java.util.ArrayList;
import java.util.List;

public class ConsolidatedStatement implements BankAccountComposite {
    List<BankAccount> bankAccounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    @Override
    public void displayBalance() {
        double totalBalance = bankAccounts.stream().mapToDouble(BankAccount::getBalance).sum();
        System.out.println("Total balance: " + totalBalance);
    }
}
