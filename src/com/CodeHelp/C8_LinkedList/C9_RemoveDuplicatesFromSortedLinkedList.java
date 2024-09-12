package com.CodeHelp.C8_LinkedList;

public class C9_RemoveDuplicatesFromSortedLinkedList {

    public static void main(String[] args) {

        C9_ListNode head = new C9_ListNode(1);
        C9_ListNode node2 = new C9_ListNode(2);
        C9_ListNode node3 = new C9_ListNode(3);
        C9_ListNode node4 = new C9_ListNode(4);
        C9_ListNode node5 = new C9_ListNode(4);
        C9_ListNode node6 = new C9_ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        printList(head);
        removeDuplicates(head);
        printList(head);
    }

    public static void removeDuplicates(C9_ListNode head) {

        C9_ListNode curr = head;
        C9_ListNode forward = curr.next;

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

    public static void printList(C9_ListNode head) {
        C9_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class C9_ListNode {
    int val;
    C9_ListNode next;
    C9_ListNode() {}
    C9_ListNode(int val) { this.val = val; }
    C9_ListNode(int val, C9_ListNode next) { this.val = val; this.next = next; }
}
