package com.CodeHelp.C8_LinkedList.Assignment;

/*
https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
 */
public class A9_MergeNodesInBetweenZeros_LEETCODE {

    public static void main(String[] args) {

        A9_ListNode head = new A9_ListNode(0);
        A9_ListNode second = new A9_ListNode(3);
        A9_ListNode third = new A9_ListNode(1);
        A9_ListNode fourth = new A9_ListNode(0);
        A9_ListNode fifth = new A9_ListNode(4);
        A9_ListNode sixth = new A9_ListNode(5);
        A9_ListNode seventh = new A9_ListNode(2);
        A9_ListNode eighth = new A9_ListNode(0);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        printList(head);
        head = mergeNodes(head);
        printList(head);

    }

    public static A9_ListNode mergeNodes(A9_ListNode head) {

        int sum = 0;
        A9_ListNode newHead = new A9_ListNode(-1);
        A9_ListNode lastNode = newHead;
        A9_ListNode curr = head.next;

        while (curr!=null){

            if (curr.val==0){
                A9_ListNode newNode = new A9_ListNode(sum);
                lastNode.next = newNode;
                lastNode = newNode;
                sum=0;
            }else{
                sum += curr.val;
            }
            curr = curr.next;
        }
        return newHead.next;
    }

    public static void printList(A9_ListNode head) {

        A9_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class A9_ListNode{
    int val;
    A9_ListNode next;
    A9_ListNode(int x){
        val = x;
    }
    A9_ListNode(int x,A9_ListNode next){
        val = x;
        this.next = next;
    }
}
