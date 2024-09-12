package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/add-two-numbers/description/
 */
public class C11_AddTwoNumbers_LEETCODE {

    public static void main(String[] args) {

        C11_ListNode head1 = new C11_ListNode(2);
        C11_ListNode second1 = new C11_ListNode(4);
        C11_ListNode third1 = new C11_ListNode(3);
        head1.next = second1;
        second1.next = third1;

        C11_ListNode head2 = new C11_ListNode(5);
        C11_ListNode second2 = new C11_ListNode(6);
        C11_ListNode third2 = new C11_ListNode(4);
        head2.next = second2;
        second2.next = third2;

        printList(head1);
        printList(head2);

        C11_ListNode ans = addTwoNumbers(head1, head2);
        printList(ans);

    }

    public static C11_ListNode addTwoNumbers(C11_ListNode l1, C11_ListNode l2) {

        C11_ListNode ansHead = new C11_ListNode(0);
        C11_ListNode ansTail = ansHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry !=0) {

            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            C11_ListNode newNode = new C11_ListNode(digit);
            ansTail.next = newNode;
            ansTail = newNode;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        ansHead = ansHead.next;
        return ansHead;

    }

    public static void printList(C11_ListNode head) {
        C11_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class C11_ListNode{
    int val;
    C11_ListNode next;
    C11_ListNode(){}
    C11_ListNode(int x){
        val = x;
    }
    C11_ListNode(int x,C11_ListNode next){
        val = x;
        this.next = next;
    }
}
