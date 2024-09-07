package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/reverse-linked-list/description/
 */
public class C3_ReverseLinkedList_LEETCODE {

    public static void main(String[] args) {

        C3_ListNode head=new C3_ListNode(1);
        C3_ListNode second =new C3_ListNode(2);
        C3_ListNode third =new C3_ListNode(3);
        C3_ListNode fourth =new C3_ListNode(4);

        head.next=second;
        second.next=third;
        third.next=fourth;

        printList(head);

        head = reverseList(head);
        printList(head);

        head = reverseUsingLoop(head);
        printList(head);


    }

    public static C3_ListNode reverseUsingLoop(C3_ListNode head){

        C3_ListNode curr = head;
        C3_ListNode prev = null;
        while(curr != null){

            C3_ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev; //Previous is at last node which is now head node, and head node is now last node

    }

    public static C3_ListNode reverseList(C3_ListNode head) {


        C3_ListNode prev = null;
        C3_ListNode curr = head;

        return helper(prev,curr);
    }

    public static C3_ListNode helper(C3_ListNode prev, C3_ListNode curr) {

        if (curr == null) {
            return prev;
        }

        C3_ListNode forward = curr.next;
        curr.next = prev;

        return helper(curr,forward);

    }

    public static void printList(C3_ListNode head) {

        C3_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

    }

}

 class C3_ListNode {
    int val;
     C3_ListNode next;
    C3_ListNode() {}
    C3_ListNode(int val) {
      this.val = val;
    }
    C3_ListNode(int val, C3_ListNode next) {
      this.val = val;
      this.next = next;
    }
}
