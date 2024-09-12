package com.CodeHelp.C8_LinkedList;

public class C11_AddTwoNumbersGivenListUnreversed {

    public static void main(String[] args) {

        C11_ListNode head1 = new C11_ListNode(2);
        C11_ListNode second1 = new C11_ListNode(4);
        C11_ListNode third1 = new C11_ListNode(3);
        head1.next = second1;
        second1.next = third1;

        C11_ListNode head2 = new C11_ListNode(9);
        C11_ListNode second2 = new C11_ListNode(6);
        C11_ListNode third2 = new C11_ListNode(4);
        head2.next = second2;
        second2.next = third2;

        printList(head1);
        printList(head2);

        C11_ListNode ans = addTwoNumbersWithoutReversedGivenList(head1, head2);

        printList(ans);
    }


    public static C11_ListNode addTwoNumbersWithoutReversedGivenList(C11_ListNode l1, C11_ListNode l2) {

        l1 = reverseList(l1);
        l2 = reverseList(l2);

        C11_ListNode ansHead = null;
        C11_ListNode ansTail = null;
        int carry = 0;

        while (l1 != null && l2 != null) {

            int sum = carry + l1.val + l2.val;
            int digit = sum % 10;
            carry = sum / 10;

            C11_ListNode node = new C11_ListNode(digit);
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
            C11_ListNode node = new C11_ListNode(digit);
            ansTail.next = node;
            ansTail = node;
            l1 = l1.next;
        }

        while (l2 != null) {
            int sum = carry + l2.val;
            int digit = sum % 10;
            carry = sum / 10;
            C11_ListNode node = new C11_ListNode(digit);
            ansTail.next = node;
            ansTail = node;
            l2 = l2.next;
        }

        if (carry !=0){
            int digit = carry % 10;
            C11_ListNode node = new C11_ListNode(digit);
            ansTail.next = node;
            ansTail = node;
        }

        ansHead = reverseList(ansHead);

        return ansHead;
    }

    public static C11_ListNode reverseList(C11_ListNode head) {

        C11_ListNode prev = null;
        C11_ListNode curr = head;
        C11_ListNode forward;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
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

class C11_ListNode {
    int val;
    C11_ListNode next;
    C11_ListNode(){}
    C11_ListNode(int x){
        val = x;
    }
    C11_ListNode(int x, C11_ListNode next){
        val = x;
        this.next = next;
    }
}