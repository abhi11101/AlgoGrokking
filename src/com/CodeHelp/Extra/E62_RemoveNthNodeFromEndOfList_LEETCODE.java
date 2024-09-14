package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class E62_RemoveNthNodeFromEndOfList_LEETCODE {

    public static void main(String[] args) {

        E62_ListNode head = new E62_ListNode(1);
        E62_ListNode second = new E62_ListNode(2);
        E62_ListNode third = new E62_ListNode(3);
        E62_ListNode fourth = new E62_ListNode(4);
        E62_ListNode fifth = new E62_ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(head);
        head = removeNthFromEnd(head, 5);
        printList(head);
    }

    public static E62_ListNode removeNthFromEnd(E62_ListNode head, int n) {

        E62_ListNode dummyHead = new E62_ListNode(-1);
        dummyHead.next = head;
        E62_ListNode prevToDelete = dummyHead;

        E62_ListNode pointer = head;

        for (int i = 0; i < n; i++) {
            pointer = pointer.next;
        }

        while (pointer != null) {
            prevToDelete = prevToDelete.next;
            pointer = pointer.next;
        }
        prevToDelete.next = prevToDelete.next.next;

        return dummyHead.next;
    }

    public static void printList(E62_ListNode head) {

        E62_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class E62_ListNode{
    int val;
    E62_ListNode next;
    E62_ListNode(int x){
        val = x;
    }
    E62_ListNode(int x,E62_ListNode next){
        val = x;
        this.next = next;
    }
}
