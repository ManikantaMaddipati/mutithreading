package com.manikanta;

public class BankAccount
{
    private double balance;
    public BankAccount(double initial){
        balance=initial;
    }

    public void deposit(double amount){
        balance = balance+amount;
    }

    public void withdrawal(double amount){
        deposit(-amount);
    }
}
