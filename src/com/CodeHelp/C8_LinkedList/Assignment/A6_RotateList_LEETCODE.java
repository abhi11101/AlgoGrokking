package com.CodeHelp.C8_LinkedList.Assignment;

/*

 */
public class A6_RotateList_LEETCODE {

    public static void main(String[] args) {

        A6_ListNode head = new A6_ListNode(1);
        A6_ListNode node2 = new A6_ListNode(2);
        A6_ListNode node3 = new A6_ListNode(3);
        A6_ListNode node4 = new A6_ListNode(4);
        A6_ListNode node5 = new A6_ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(head);

        head = rotateRight(head, 1);
        printList(head);

    }

    public static A6_ListNode rotateRight(A6_ListNode head, int k) {
        if (head == null || head.next == null)return head;

        int length = getLength(head);
        k = k % length;
        if (k == 0)return head;

        int lastNodePos = length - k - 1;
        A6_ListNode newTail = head;

        while (lastNodePos > 0) {
            newTail = newTail.next;
            lastNodePos--;
        }
        System.out.println("newTail = " + newTail.val);
        A6_ListNode newHead = newTail.next;
        newTail.next = null;

        A6_ListNode temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        return newHead;
    }

    public static int getLength(A6_ListNode head) {

        A6_ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }

    public static void printList(A6_ListNode head) {

        A6_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class A6_ListNode{
    int val;
    A6_ListNode next;
    A6_ListNode(int x){
        val = x;
    }
    A6_ListNode(int x,A6_ListNode next){
        val = x;
        this.next = next;
    }
}