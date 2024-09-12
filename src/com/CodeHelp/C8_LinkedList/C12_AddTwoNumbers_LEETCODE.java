package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/add-two-numbers/description/
 */
public class C12_AddTwoNumbers_LEETCODE {

    public static void main(String[] args) {

        C12_ListNode head1 = new C12_ListNode(2);
        C12_ListNode second1 = new C12_ListNode(4);
        C12_ListNode third1 = new C12_ListNode(3);
        head1.next = second1;
        second1.next = third1;

        C12_ListNode head2 = new C12_ListNode(5);
        C12_ListNode second2 = new C12_ListNode(6);
        C12_ListNode third2 = new C12_ListNode(4);
        head2.next = second2;
        second2.next = third2;

        printList(head1);
        printList(head2);

        C12_ListNode ans = addTwoNumbers(head1, head2);
        printList(ans);

    }

    public static C12_ListNode addTwoNumbers(C12_ListNode l1, C12_ListNode l2) {

        C12_ListNode ansHead = new C12_ListNode(0);
        C12_ListNode ansTail = ansHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry !=0) {

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            C12_ListNode newNode = new C12_ListNode(digit);
            ansTail.next = newNode;
            ansTail = newNode;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        ansHead = ansHead.next;
        return ansHead;

    }

    public static void printList(C12_ListNode head) {
        C12_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class C12_ListNode {
    int val;
    C12_ListNode next;
    C12_ListNode(){}
    C12_ListNode(int x){
        val = x;
    }
    C12_ListNode(int x, C12_ListNode next){
        val = x;
        this.next = next;
    }
}
