package com.CodeHelp.C8_LinkedList.Assignment;

public class A7_DeleteN_NodesAfterM_Nodes {

    public static void main(String[] args) {

        A7_ListNode head = new A7_ListNode(1);
        A7_ListNode second = new A7_ListNode(2);
        A7_ListNode third = new A7_ListNode(3);
        A7_ListNode fourth = new A7_ListNode(4);
        A7_ListNode fifth = new A7_ListNode(5);
        A7_ListNode sixth = new A7_ListNode(6);
        A7_ListNode seventh = new A7_ListNode(7);
        A7_ListNode eighth = new A7_ListNode(8);
        A7_ListNode ninth = new A7_ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;

        printList(head);
        deleteNNodes(head,1,2);
        printList(head);

    }

    public static void deleteNNodes(A7_ListNode head, int m, int n) {
        if (head == null) {
            return ;
        }
        A7_ListNode temp = head;
        for (int i = 0; i < m-1; i++) {
            if (temp==null)return;
            temp=temp.next;
        }
        if (temp==null)return;

        A7_ListNode MthNode = temp;
        temp = temp.next;
        for (int i =0;i<n;i++){
            if (temp==null)break;
            temp=temp.next;
        }
        MthNode.next=temp;

        deleteNNodes(temp,m,n);
    }

    public static void printList(A7_ListNode head) {

        A7_ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class A7_ListNode{
    int val;
    A7_ListNode next;

    A7_ListNode(int x){
        val = x;
    }
    A7_ListNode(int x,A7_ListNode next){
        val = x;
        this.next = next;
    }
}
