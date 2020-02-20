package com.manikanta;

import java.util.Timer;
import java.util.TimerTask;

public class MyFirstThread {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();

        Thread t1 = new MythreadMoney1(linkList);
        Thread t2 = new MythreadMoney2(linkList);
        t1.start();
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                t2.start();
            }
        };
        timer.schedule(task, 0, 1000);


    }
}


class MythreadMoney1 extends Thread {
    LinkList linkList1;

    MythreadMoney1(LinkList linkList1) {
        this.linkList1 = linkList1;
    }

    public void run() {
        for (int i = 1; i < 500; i++) {
            linkList1.append(i);
        }

    }
}


class MythreadMoney2 extends Thread {
    LinkList linkList2;

    MythreadMoney2(LinkList linkList2) {
        this.linkList2 = linkList2;
    }

    public void run() {
        linkList2.printList();
    }
}


