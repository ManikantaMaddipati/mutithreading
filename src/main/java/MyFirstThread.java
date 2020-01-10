public class MyFirstThread
{
    public static void main(String[] args) {
        int i =2;
        Thread t = new Mythread();
        t.start();
        for(int k = 1; k<=10;k++){
            System.out.println(k*i);
        }
    }
}

class Mythread extends Thread{
    public void run(){
        int i =3;
        for(int k = 1; k<=10;k++){
            System.out.println(k*i);
        }
    }
}

