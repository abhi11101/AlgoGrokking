package com.CodeHelp.Extra;


/*
https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
 */
public class E60_DeleteMiddleNodeOfLinkedList_LEETCODE {

    public static void main(String[] args) {

        E60_ListNode head = new E60_ListNode(1);
        E60_ListNode second = new E60_ListNode(2);
        E60_ListNode third = new E60_ListNode(3);
        E60_ListNode fourth = new E60_ListNode(4);
        E60_ListNode fifth = new E60_ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
//        fourth.next = fifth;

        printList(head);
//        head = deleteMiddle(head);
//        printList(head);

        head = faster(head);
        printList(head);

    }

    public static E60_ListNode faster(E60_ListNode head) {
        if(head.next==null)return null;
        E60_ListNode slow = head;
        E60_ListNode fast = head;
        E60_ListNode prev = head;
        while(slow!=null && fast!=null){

            fast = fast.next;
            if (fast!=null){
                fast = fast.next;
                prev = slow;
                slow = slow.next;

            }
        }

        prev.next = slow.next;
        return head;
    }


    public static E60_ListNode deleteMiddle(E60_ListNode head) {
        if(head.next==null)return null;
        int currentPosition = 0;

        E60_ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            currentPosition++;
        }

        int mid = currentPosition/2;
        temp = head;
        int count = 0;
        while(count!=mid-1){
            temp = temp.next;
            count++;
        }
//        System.out.println(temp.val);
        E60_ListNode deleteNode = temp.next;
        temp.next = deleteNode.next;
        return head;
    }
    public static void printList(E60_ListNode head) {

        E60_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();

    }

}

class E60_ListNode {
    int val;
    E60_ListNode next;
    E60_ListNode() {}
    E60_ListNode(int val) {
        this.val = val;
    }
    E60_ListNode(int val, E60_ListNode next) {
        this.val = val;
        this.next = next;
    }
}
