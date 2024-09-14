package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class E64_DeleteNodeInLinkedList_LEETCODE {

    public static void main(String[] args) {

        E64_ListNode head = new E64_ListNode(1);
        E64_ListNode second = new E64_ListNode(2);
        E64_ListNode third = new E64_ListNode(3);
        E64_ListNode fourth = new E64_ListNode(4);
        E64_ListNode fifth = new E64_ListNode(5);
        E64_ListNode sixth = new E64_ListNode(6);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        printList(head);
        deleteNode(fourth);
        printList(head);
    }

    public static void deleteNode(E64_ListNode node) {

        E64_ListNode temp = node;
        E64_ListNode prev = temp;
        while (temp.next!=null){
            prev = temp;
            temp.val = temp.next.val;
            temp = temp.next;
        }
        prev.next = null;
    }

    public static void printList(E64_ListNode head){

        E64_ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class E64_ListNode{
    int val;
    E64_ListNode next;
    public E64_ListNode(int x){
        val = x;
    }
    E64_ListNode(int x,E64_ListNode next){
        val = x;
        this.next = next;
    }
}
