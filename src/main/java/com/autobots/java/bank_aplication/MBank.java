package com.autobots.java.bank_aplication;

public class MBank extends  BankBase{


    private double balance  = 200;

    public MBank(long accountNumber, long rodingNumber) throws Exception {
        super(accountNumber, rodingNumber);
       addToAllBankRecords(this);
    }
    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
   if (amount < 0 && amount >= 200000) {
       throw new IllegalArgumentException("Invilade amount can not be deposit");
   }
   balance += amount;
    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount >= 150000){
            throw new IllegalArgumentException("Inviled amound can not be with drow");
        } else {
            if (amount > balance){
                throw new IllegalArgumentException("Insuffuction funds");
            } else {
                balance -= amount;
            }
        }

    }
}
