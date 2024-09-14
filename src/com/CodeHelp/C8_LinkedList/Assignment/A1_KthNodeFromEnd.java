package com.CodeHelp.C8_LinkedList.Assignment;

public class A1_KthNodeFromEnd {

    public static void main(String[] args) {

        A1_ListNode head = new A1_ListNode(1);
        A1_ListNode second = new A1_ListNode(2);
        A1_ListNode third = new A1_ListNode(3);
        A1_ListNode fourth = new A1_ListNode(4);
        A1_ListNode fifth = new A1_ListNode(5);
        A1_ListNode sixth = new A1_ListNode(6);
        A1_ListNode seventh = new A1_ListNode(7);
        A1_ListNode eighth = new A1_ListNode(8);
        A1_ListNode ninth = new A1_ListNode(9);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;

        System.out.println(getKthFromLast(head, 9));
    }

    public static int getKthFromLast(A1_ListNode head, int k) {

        A1_ListNode slow = head;
        A1_ListNode fast = head;

        int count = k;

        while(fast !=null && count>0){
            fast = fast.next;
            count--;
        }
        if (count>0)return -1;

        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}

class A1_ListNode{

    int val;
    A1_ListNode next;

    public A1_ListNode(){}
    public A1_ListNode(int val){
        this.val = val;
    }
    public A1_ListNode(int val, A1_ListNode next){
        this.val = val;
        this.next = next;
    }
}
