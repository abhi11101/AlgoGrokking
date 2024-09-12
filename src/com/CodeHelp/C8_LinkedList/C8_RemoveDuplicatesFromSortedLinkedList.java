package com.CodeHelp.C8_LinkedList;

public class C8_RemoveDuplicatesFromSortedLinkedList {

    public static void main(String[] args) {

        C8_ListNode head = new C8_ListNode(1);
        C8_ListNode node2 = new C8_ListNode(2);
        C8_ListNode node3 = new C8_ListNode(3);
        C8_ListNode node4 = new C8_ListNode(4);
        C8_ListNode node5 = new C8_ListNode(4);
        C8_ListNode node6 = new C8_ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        printList(head);
        removeDuplicates(head);
        printList(head);
    }

    public static void removeDuplicates(C8_ListNode head) {

        C8_ListNode curr = head;
        C8_ListNode forward = curr.next;

        while (forward != null) {

            if (forward.val == curr.val) {
                curr.next =null;
                forward = forward.next;
            }else {
                curr.next = forward;
                curr = forward;
                forward = forward.next;
            }
        }
    }

    public static void printList(C8_ListNode head) {
        C8_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class C8_ListNode {
    int val;
    C8_ListNode next;
    C8_ListNode() {}
    C8_ListNode(int val) { this.val = val; }
    C8_ListNode(int val, C8_ListNode next) { this.val = val; this.next = next; }
}
