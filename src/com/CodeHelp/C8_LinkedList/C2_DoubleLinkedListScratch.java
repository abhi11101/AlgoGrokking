package com.CodeHelp.C8_LinkedList;

public class C2_DoubleLinkedListScratch {

    public static DoubleNode head = new DoubleNode(1);
    public static DoubleNode tail = head;

    public static void main(String[] args) {


        insertHead(head,2);
        insertHead(head,3);
        insertHead(head,4);
        insertHead(head,5);
        printList(head);

        insertHead(head,10);
        printList(head);

        insertTail(tail,20);
        printList(head);

        insertAtPosition(head,1,34);
        printList(head);

        insertAtPosition(head,6,98);
        printList(head);

        insertAtPosition(head,10,44);
        printList(head);

        System.out.println(findLength(head));

        deleteAtPosition(head,2);
        printList(head);
    }

    public static void insertHead(DoubleNode head, int data) {

        DoubleNode newNode = new DoubleNode(data);
        newNode.next = head;
        head.prev = newNode;
        C2_DoubleLinkedListScratch.head = newNode;

    }

    public static void insertTail(DoubleNode tail, int data) {
        DoubleNode newNode = new DoubleNode(data);
        tail.next = newNode;
        newNode.prev = tail;

        C2_DoubleLinkedListScratch.tail = newNode;


    }

    public static void insertAtPosition(DoubleNode head, int position, int data){

        if (position == 1){
            insertHead(head,data);
            return;
        }
        DoubleNode newNode = new DoubleNode(data);
        DoubleNode temp = head;
        int currentPosition = 1;

        while (temp!=null && currentPosition < position-1){

            temp = temp.next;
            currentPosition++;

        }

        if (temp==null || position<1){
            System.out.println("Invalid Position");
        }
        else if (temp.next==null){
            insertTail(tail,data);
        }
        else {
            temp.next.prev = newNode;
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
        }

    }

    public static void deleteAtPosition(DoubleNode head, int position){

        if (position == 1){
            C2_DoubleLinkedListScratch.head = head.next;
            C2_DoubleLinkedListScratch.head.prev = null;
            return;
        }
        int currentPosition = 1;

        DoubleNode temp = head;
        while (temp!=null && currentPosition < position-1){
            temp = temp.next;
            currentPosition++;
        }
        if (temp==null || position<1){
            System.out.println("Invalid Position");
        } else if (temp.next.next==null) {
            C2_DoubleLinkedListScratch.tail = temp;
            C2_DoubleLinkedListScratch.tail.next = null;
        }else {
            DoubleNode curr = temp.next;
            DoubleNode next = curr.next;
            temp.next = next;
            next.prev = temp;

        }

    }

    public static void printList(DoubleNode head){

        DoubleNode temp = head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static int findLength(DoubleNode head){
        int length = 0;
        DoubleNode temp = head;
        while (temp!=null){
            temp = temp.next;
            length++;
        }
        return length;
    }


}


class DoubleNode{

    int data;
    DoubleNode next;
    DoubleNode prev;

    DoubleNode(){
        this.data =0;
        this.next = null;
        this.prev = null;
    }

    DoubleNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
