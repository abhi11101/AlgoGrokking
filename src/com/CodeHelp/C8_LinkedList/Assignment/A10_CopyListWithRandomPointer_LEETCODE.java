package com.CodeHelp.C8_LinkedList.Assignment;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/copy-list-with-random-pointer/description/
 */
public class A10_CopyListWithRandomPointer_LEETCODE {

    public static void main(String[] args) {

        A10_ListNode head = new A10_ListNode(7);
        A10_ListNode second = new A10_ListNode(13);
        A10_ListNode third = new A10_ListNode(11);
        A10_ListNode fourth = new A10_ListNode(10);
        A10_ListNode fifth = new A10_ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        head.random = null;
        second.random = head;
        third.random = fifth;
        fourth.random = third;
        fifth.random = head;

        printList(head);

        A10_ListNode ans = copyRandomList(head);

        printList(ans);
    }

    public static A10_ListNode copyRandomList(A10_ListNode head) {

        Map<A10_ListNode,A10_ListNode> map = new HashMap<>();

        return  helper(map,head);
    }

    public static A10_ListNode helper(Map<A10_ListNode,A10_ListNode> map, A10_ListNode head) {
        if (head == null) {
            return null;
        }

        A10_ListNode newHead = new A10_ListNode(head.val);
        map.put(head, newHead);
        newHead.next = helper(map,head.next);
        if (head.random != null) {
            newHead.random = map.get(head.random);
        }
        return newHead;
    }

    public static void printList(A10_ListNode head) {

        A10_ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " " );
            temp = temp.next;
        }
        System.out.println();
    }
}

class A10_ListNode{
    int val;
    A10_ListNode next;
    A10_ListNode random;
    public A10_ListNode(int x){
        val = x;
        this.next = null;
        this.random = null;
    }
}
