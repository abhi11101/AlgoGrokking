package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 */
public class C5_ReverseNodesInkGroup_LEETCODE {

    public static void main(String[] args) {

        C5_ListNode head = new C5_ListNode(1);
        C5_ListNode second = new C5_ListNode(2);
        C5_ListNode third = new C5_ListNode(3);
        C5_ListNode fourth = new C5_ListNode(4);
        C5_ListNode fifth = new C5_ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(head);
        head = reverseKGroup(head, 3);
        printList(head);
    }

    public static C5_ListNode reverseKGroup(C5_ListNode head, int k) {

        if (head==null)return null;
        int len = getLen(head);
        if (k>len)return head;

        C5_ListNode prev = null;
        C5_ListNode curr = head;
        C5_ListNode forward = curr.next;

        int count =0;
        while (count<k){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
            count++;
        }
        if (forward!=null){
            head.next = reverseKGroup(forward,k); //Head becomes last node after reversal
        }

        return prev; // Previous becomes the head(first) node after reversal

    }

    public static int getLen(C5_ListNode head) {
        C5_ListNode cur = head;
        int count = 0;
        while (cur!=null){
            cur = cur.next;
            count++;
        }
        return count;
    }

    public static void printList(C5_ListNode head) {

        C5_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

    }
}

class C5_ListNode {
    int val;
    C5_ListNode next;
    C5_ListNode() {}
    C5_ListNode(int val) { this.val = val; }
    C5_ListNode(int val, C5_ListNode next) { this.val = val; this.next = next; }
}
