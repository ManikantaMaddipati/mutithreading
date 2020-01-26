package com.manikanta;

public class MyFirstThread {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        Thread t1 = new MythreadMoney1(linkList);
//        Thread t2 = new MythreadMoney2(linkList);
        t1.start();
  //      t2.start();
    }
//        LinkList linkList = new LinkList();
//        for (int i =0 ; i<100; i++) {
//            linkList.append(i);
//        }
//        linkList.printList();
//
}

class MythreadMoney1 extends Thread{
    LinkList linkList1;
    MythreadMoney1(LinkList linkList1){
        this.linkList1=linkList1;
    }
    public void run(){
        for (int i =1; i<500; i++) {
            linkList1.append(i);
        }

        linkList1.printList();

    }
}


//class MythreadMoney2 extends Thread{
//    LinkList linkList2;
//    MythreadMoney2(LinkList linkList2){
//        this.linkList2=linkList2;
//    }
//    public void run(){
//        linkList2.printList();
//    }


