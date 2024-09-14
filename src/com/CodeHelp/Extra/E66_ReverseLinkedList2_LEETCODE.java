package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/reverse-linked-list-ii/description/
 */
public class E66_ReverseLinkedList2_LEETCODE {

    public static void main(String[] args) {

        E66_ListNode head = new E66_ListNode(1);
        E66_ListNode second = new E66_ListNode(2);
        E66_ListNode third = new E66_ListNode(3);
        E66_ListNode fourth = new E66_ListNode(4);
        E66_ListNode fifth = new E66_ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(head);

        head = reverseBetween(head, 2, 4);
        printList(head);

    }

    public static E66_ListNode reverseBetween(E66_ListNode head, int left, int right) {

        if (left==right)return head;

        E66_ListNode dummy = new E66_ListNode(-1);
        dummy.next = head;
        E66_ListNode prev = dummy;

        E66_ListNode temp = head;
        E66_ListNode start = null;
        int index =1;
        while (index!=right) {
            if (index<left){
                prev.next = temp;
                prev = temp;
            }
            else if (index==left){
                start = temp;
            }
            index++;
            temp = temp.next;
        }
        E66_ListNode forward = temp.next;
        temp.next = null;
        prev.next = reverse(start,right,forward);

        return dummy.next;
    }

    public static E66_ListNode reverse(E66_ListNode head, int end, E66_ListNode forward) {

        E66_ListNode prev = null;
        E66_ListNode current = head;
        E66_ListNode next ;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = forward;
        return prev;
    }

    public static void printList(E66_ListNode head){

        E66_ListNode current = head;
        while (current!=null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class E66_ListNode{
    int val;
    E66_ListNode next;
    public E66_ListNode(int x){
        val = x;
    }
    E66_ListNode(int x,E66_ListNode next){
        val = x;
        this.next = next;
    }
}
