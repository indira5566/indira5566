package com.autobots.java.mobile_bank;

import java.util.List;
import java.util.UUID;

public abstract class BankAccount {

    private UUID accountNumber;
    private double balance;
    Currency currency;
    Client client;
    List<Transaction>;

    abstract void deposit(double amount);
    abstract boolean withdraw(double amount);
    void addTransaction(String type, double amount){

    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Client getClient() {
        return client;
    }
}
