package com.manikanta;

public class MyFirstThread
{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        for (int i=0;i<10 ;i++) {
            Thread t1 = new MythreadMoney1(bankAccount);
            Thread t2 = new MythreadMoney2(bankAccount);
            t1.start();
            t2.start();
        }
    }
}

class MythreadMoney1 extends Thread{
    BankAccount bankAccount1;
    MythreadMoney1(BankAccount bankAccount){
        this.bankAccount1=bankAccount;
    }
    public void run(){
        bankAccount1.deposit(100);
    }
}

class MythreadMoney2 extends Thread{
    BankAccount bankAccount2;
    MythreadMoney2(BankAccount bankAccount){
        this.bankAccount2=bankAccount;
    }
    public void run(){
        bankAccount2.withdrawal(100);
    }
}


