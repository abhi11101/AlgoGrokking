package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/middle-of-the-linked-list/description/
 */
public class C4_MiddleOfTheLinkedList_LEETCODE {

    public static void main(String[] args) {

        C4_ListNode head = new C4_ListNode(1);
        C4_ListNode second  = new C4_ListNode(2);
        C4_ListNode third  = new C4_ListNode(3);
        C4_ListNode fourth  = new C4_ListNode(4);
        C4_ListNode fifth  = new C4_ListNode(5);
        C4_ListNode sixth  = new C4_ListNode(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;



        printList(head);
        C4_ListNode ans  = middleNode(head);
        printList(ans);

        C4_ListNode res = faster(head);
        printList(res);
    }

    public static C4_ListNode faster(C4_ListNode head) {

        if (head.next == null) {
            return head;
        }

        C4_ListNode slow = head;
        C4_ListNode fast = head;

        while (slow!=null && fast!=null) {

            fast = fast.next;
            if (fast!=null) {

                fast = fast.next;
                slow = slow.next;
            }

        }

        return slow;
    }

    public static C4_ListNode middleNode(C4_ListNode head) {
        int currentPosition = 0;

        C4_ListNode temp = head;
        while(temp!=null){

            currentPosition++;
            temp = temp.next;

        }
        System.out.println("Current position is "+currentPosition);
         int mid = currentPosition/2;
        System.out.println("mid " + mid);
         currentPosition=0;
         temp=head;
         while(currentPosition!=mid){
             temp = temp.next;
             currentPosition++;
         }
        return temp;
    }

    public static void printList(C4_ListNode head) {

        C4_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

    }
}

class C4_ListNode {
    int val;
    C4_ListNode next;
    C4_ListNode() {}
    C4_ListNode(int val) {
        this.val = val;
    }
    C4_ListNode(int val, C4_ListNode next) {
        this.val = val;
        this.next = next;
    }
}
