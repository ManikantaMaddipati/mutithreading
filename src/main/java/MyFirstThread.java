public class MyFirstThread
{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        Thread t1 = new MythreadMoney1(bankAccount);
        Thread t2 = new MythreadMoney2(bankAccount);
        t1.start();
        t2.start();
    }
}

class MythreadMoney1 extends Thread{
    BankAccount bankAccount;
    MythreadMoney1(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void run(){
        bankAccount.deposit(100);
    }
}

class MythreadMoney2 extends Thread{
    BankAccount bankAccount;
    MythreadMoney2(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }
    public void run(){
        bankAccount.withdrawal(100);
    }
}


