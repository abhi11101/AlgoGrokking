package com.CodeHelp.C8_LinkedList;

public class C1_LinkedListScratch {

    public static void main(String[] args) {

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(first);

        Node head = new Node(10);
        Node tail = head;
        head = insertHead(head,20);
        head = insertHead(head,30);
        head = insertHead(head,40);
        head = insertHead(head,50);


        printList(head);

        // Insert at tail directly using tail reference
        tail = insertTail(tail, 60);
        tail = insertTail(tail, 70);
        tail = insertTail(tail, 80);

        printList(head);

        head = insertPosition(85,head,4);
        printList(head);

        System.out.println(findLength(head));

        head = deleteByPosition(head,9);
        printList(head);

    }

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertHead(Node head, int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

        return head;
    }

    public static Node insertTail(Node tail, int data) {

        Node newNode = new Node(data);
        tail.next = newNode;  // Point the current tail to the new node
        return newNode;  // Return the new node as the new tail

    }

    public static Node insertPosition(int value, Node head, int position) {

        if (position==0){
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        int currentPosition = 0;
        while (temp != null && currentPosition < position -1) {
            temp = temp.next;
            currentPosition++;
        }

        if (temp==null){
            System.out.println("Invalid position");
            return head;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node deleteByPosition(Node head, int position) {

        if (position==0){
            return head.next;
        }
        int currentPosition = 0;
        Node temp = head;

        while(temp!=null && currentPosition < position-1){
            temp = temp.next;
            currentPosition++;

        }
        if(temp==null || temp.next==null){
            System.out.println("Invalid position");
            return head;
        }
        temp.next = temp.next.next;

        return head;
    }

    public static int findLength(Node head){

        Node temp = head;
        int length = 0;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}


class Node{

    int data;
    Node next;

    public Node(){
        this.data = 0;
        this.next = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
