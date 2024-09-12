package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/linked-list-cycle/description/
 */
public class C6_LinkedListCycle_LEETCODE {

    public static void main(String[] args) {

        C6_ListNode head = new C6_ListNode(3);
        C6_ListNode node1 = new C6_ListNode(2);
        C6_ListNode node2 = new C6_ListNode(0);
        C6_ListNode node3 = new C6_ListNode(4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(C6_ListNode head) {

        C6_ListNode slow = head;
        C6_ListNode fast = head;

        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast=fast.next;
                slow = slow.next;
            }
            if(slow==fast)return true;
        }
        return false;
    }
}

class C6_ListNode {
    int val;
    C6_ListNode next;
    C6_ListNode() {}
    C6_ListNode(int val) { this.val = val; }
    C6_ListNode(int val, C6_ListNode next) { this.val = val; this.next = next; }
}