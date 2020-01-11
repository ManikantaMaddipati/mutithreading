public class MyFirstThread
{
    public static void main(String[] args) {
        int i =2;
        Thread t = new Mythread();
        //thread group: an interrupt , all the thread of that group are stopped.
//              thread group gets callback saying that one of the thread died due to exception.
//By Default current thread group becomes the thread.
//To create thread group :
        ThreadGroup group = new ThreadGroup("mygroup") ;
//To assign thread to that a group
        Thread xyz = new Thread(group,t);
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

