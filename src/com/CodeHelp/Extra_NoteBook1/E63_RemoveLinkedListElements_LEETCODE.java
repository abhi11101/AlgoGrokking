package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class E63_RemoveLinkedListElements_LEETCODE {

    public static void main(String[] args) {

        E63_ListNode head = new E63_ListNode(1);
        E63_ListNode node2 = new E63_ListNode(2);
        E63_ListNode node3 = new E63_ListNode(6);
        E63_ListNode node4 = new E63_ListNode(3);
        E63_ListNode node5 = new E63_ListNode(4);
        E63_ListNode node6 = new E63_ListNode(5);
        E63_ListNode node7 = new E63_ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        printList(head);

        head = removeElements(head, 6);
        printList(head);
    }

    public static E63_ListNode removeElements(E63_ListNode head, int val) {

        E63_ListNode dummyHead = new E63_ListNode(-1);
        E63_ListNode prevToDelete = dummyHead;

        E63_ListNode curr = head;
        while (curr != null) {

            if (curr.val != val) {
                prevToDelete.next = curr;
                prevToDelete = curr;
            }else{
                prevToDelete.next = null;
            }
            curr = curr.next;

        }
        return dummyHead.next;
    }

    public static void printList(E63_ListNode head) {

        E63_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
class E63_ListNode{

    int val;
    E63_ListNode next;
    E63_ListNode(int x){
        val = x;
    }
    E63_ListNode(int x,E63_ListNode next){
        val = x;
        this.next = next;
    }
}
