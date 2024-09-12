package com.CodeHelp.C8_LinkedList;

public class C10_AddTwoNumbersGivenListUnreversed {

    public static void main(String[] args) {

        C10_ListNode head1 = new C10_ListNode(2);
        C10_ListNode second1 = new C10_ListNode(4);
        C10_ListNode third1 = new C10_ListNode(3);
        head1.next = second1;
        second1.next = third1;

        C10_ListNode head2 = new C10_ListNode(9);
        C10_ListNode second2 = new C10_ListNode(6);
        C10_ListNode third2 = new C10_ListNode(4);
        head2.next = second2;
        second2.next = third2;

        printList(head1);
        printList(head2);

        C10_ListNode ans = addTwoNumbersWithoutReversedGivenList(head1, head2);

        printList(ans);
    }


    public static C10_ListNode addTwoNumbersWithoutReversedGivenList(C10_ListNode l1, C10_ListNode l2) {

        l1 = reverseList(l1);
        l2 = reverseList(l2);

        C10_ListNode ansHead = null;
        C10_ListNode ansTail = null;
        int carry = 0;

        while (l1 != null && l2 != null) {

            int sum = carry + l1.val + l2.val;
            int digit = sum % 10;
            carry = sum / 10;

            C10_ListNode node = new C10_ListNode(digit);
            if (ansHead == null) {
                ansHead = node;
                ansTail = node;
            }else {
                ansTail.next = node;
                ansTail = node;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = carry + l1.val;
            int digit = sum % 10;
            carry = sum / 10;
            C10_ListNode node = new C10_ListNode(digit);
            ansTail.next = node;
            ansTail = node;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = carry + l2.val;
            int digit = sum % 10;
            carry = sum / 10;
            C10_ListNode node = new C10_ListNode(digit);
            ansTail.next = node;
            ansTail = node;
            l2 = l2.next;
        }

        if (carry !=0){
            int digit = carry % 10;
            C10_ListNode node = new C10_ListNode(digit);
            ansTail.next = node;
            ansTail = node;
        }

        ansHead = reverseList(ansHead);

        return ansHead;
    }

    public static C10_ListNode reverseList(C10_ListNode head) {

        C10_ListNode prev = null;
        C10_ListNode curr = head;
        C10_ListNode forward;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public static void printList(C10_ListNode head) {
        C10_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}

class C10_ListNode{
    int val;
    C10_ListNode next;
    C10_ListNode(){}
    C10_ListNode(int x){
        val = x;
    }
    C10_ListNode(int x,C10_ListNode next){
        val = x;
        this.next = next;
    }
}