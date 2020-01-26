package com.manikanta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkList {
    private static final Logger logger = LoggerFactory.getLogger(LinkList.class);
    LinkedListNode head;
    public void append(int data){
        if(head == null){
            head = new LinkedListNode(data);
            return;
        }
        else{
            LinkedListNode current = head;
            while(current.right != null ){
                current = current.right;
            }
            current.right = new LinkedListNode(data);
        }

    }

    public void prePend(int data){
        LinkedListNode  newNode = new LinkedListNode(data);
        newNode.right = head;
        head = newNode;
    }

    public void deletenode(int data){
        if (head == null){return;}
        LinkedListNode current = head;
        if(head.data ==  data){
            head = head.right;
        }
        while (current.right != null){
            if(current.right.data == data){
                current.right = current.right.right;
                return;
            }
        }

    }

    public void printList(){
        LinkedListNode  currnet = head;

        while (currnet.right!=null){
            logger.info("data is {}",currnet.data);
            currnet=currnet.right;
        }
        logger.info("data is {}",currnet.data);
    }


}
