package com.sonena;

public class SavingsAccount implements BankAccount {

    private long balance = 0L;

    public SavingsAccount(long balance) {
        this.balance = balance;
    }

    @Override
    public long depositAmount(long amount) {
        if (amount <= 0) {
            throw new RuntimeException("Invalid amount " + amount);
        }
        balance += amount;
        return balance;
    }


    @Override
    public long withdrawAmount(long wamount) {
        if (wamount <= 0) {
            throw new RuntimeException("Invalid amount " + wamount);
        }
        if (wamount <= balance) {
            balance -= wamount;
        } else {
            throw new RuntimeException("Insufficient funds to withdraw " + balance);
        }
        return balance;
    }
}
