package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/palindrome-linked-list/description/
 */
public class C8_PalindromeLinkedList_LEETCODE {

    public static void main(String[] args) {

        C8_ListNode head = new C8_ListNode(1);
        C8_ListNode node2 = new C8_ListNode(2);
        C8_ListNode node3 = new C8_ListNode(3);
        C8_ListNode node4 = new C8_ListNode(3);
        C8_ListNode node5 = new C8_ListNode(2);
        C8_ListNode node6 = new C8_ListNode(1);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println(isPalindrome(head));

    }

    public  static boolean isPalindrome(C8_ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        C8_ListNode mid  = findMiddle(head);

        C8_ListNode reversedHead = reverseList(mid);

        while (reversedHead != null) {
            if (head.val != reversedHead.val) {return false;}

            head = head.next;
            reversedHead = reversedHead.next;
        }

        return true;
    }

    public static C8_ListNode findMiddle(C8_ListNode head) {

        C8_ListNode slow = head;
        C8_ListNode fast = head;

        while (fast != null){
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public static C8_ListNode reverseList(C8_ListNode head) {

        if (head.next==null)return head;

        C8_ListNode prev = null;
        C8_ListNode curr = head;
        C8_ListNode forward;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}

class C8_ListNode {
    int val;
    C8_ListNode next;
    C8_ListNode() {}
    C8_ListNode(int val) { this.val = val; }
    C8_ListNode(int val, C8_ListNode next) { this.val = val; this.next = next; }
}