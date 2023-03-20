package com.DSA.LinkedList;

public class LinkedListArray {
     class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNodeAtHead(int data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public  void addNodeAtTail(int data){
        Node newNode = new Node(data);

        if (head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void addAtPosition(int data, int position){
        if (position<1 || position>size()+1){
            System.out.println("Invalid position");
        }
        else if (position==1){
            addNodeAtHead(data);
        }
        else if (position==size()+1){
            addNodeAtTail(data);
        }
        else{
        Node newNode = new Node(data);
        Node current = head;
        while (position>2){
            current= current.next;
            position--;
        }
        newNode.next=current.next;
        current.next=newNode;
        }
    }

    public void deleteAtHead(){
        if (head!=null){
            head=head.next;
        }
        else{
            System.out.println("Empty List");
        }
    }

    public void deleteAtTail(){
        if (size()!=0){
            int count = size();
            Node current = head;
            while (count>2){
                current=current.next;
                count--;
            }
            tail=current;
            current.next=null;
        }
    }

    public void deleteAtPosition(int position){
        if (position>size() || position<1){
            System.out.println("Invalid position");
        }
        else if(position==1){
            deleteAtHead();
        }
        else if (position==size()){
            deleteAtTail();
        }
        else {
            Node current = head;
            while (position>2){
                current=current.next;
                position--;
            }
            current.next=current.next.next;
        }

    }

    public void deleteByValue(int value){
        if (head==null){
            System.out.println("List Empty");
        }
        else {
            Node current = head;
            int count =0;
            while (current.next!=null){
                count++;
                if (current.next.data==value){
                    break;
                }
                current=current.next;
            }
            if (count==1)deleteAtHead();
            else if (count==size())deleteAtTail();
            else
            current.next=current.next.next;
        }
    }
    public void traverse(){
        Node current = head;
        if (current==null){
            System.out.println("List is Empty");
            return;
        }
        while (current!=null){
            System.out.print(current.data +" ");
            current=current.next;
        }
        System.out.println();
    }

    public int size(){
        if (head==null)return 0;
        int count =0;
        Node current = head;
        while (current.next!=null){
            count++;
            current=current.next;
        }
        return count+1;
    }
    public static void main(String[] args) {
        LinkedListArray list = new LinkedListArray();
        list.addNodeAtTail(1);
        list.addNodeAtTail(2);
        list.traverse();
        list.addNodeAtHead(5);
        list.addNodeAtHead(7);
        list.traverse();
        list.addAtPosition(9,5);
        list.traverse();
//        list.deleteAtTail();
//        list.traverse();
//        list.deleteAtHead();
//        list.traverse();
        list.deleteAtPosition(4);
        list.traverse();
        list.deleteAtTail();
        list.traverse();
        list.deleteByValue(7);
        list.traverse();
        System.out.println("Head "+ list.head.data + " " +"Tail "+ list.tail.data);
    }
}
