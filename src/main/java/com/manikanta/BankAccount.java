package com.manikanta;

public class BankAccount
{
    private double balance;
    private final Object monitor = new Object();
    public BankAccount(double initial){
        balance=initial;
    }

    public void deposit(double amount){
        System.out.println("Before deposit "+ balance);

        synchronized (monitor) {
            balance = balance + amount;
        }
        System.out.println("After deposit "+ balance);
    }

    public void withdrawal(double amount){
        System.out.println("Before withdrawal "+ balance);
        synchronized (monitor) {
            balance = balance - amount;
        }
        System.out.println("After withdrawal "+ balance);
        System.out.println("Hi");
    }



}

