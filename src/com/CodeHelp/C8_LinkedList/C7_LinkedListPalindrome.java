package com.CodeHelp.C8_LinkedList;

public class C7_LinkedListPalindrome {

    public static void main(String[] args) {

        C7_ListNode head = new C7_ListNode(1);
        C7_ListNode node2 = new C7_ListNode(2);
        C7_ListNode node3 = new C7_ListNode(3);
        C7_ListNode node4 = new C7_ListNode(3);
        C7_ListNode node5 = new C7_ListNode(2);
        C7_ListNode node6 = new C7_ListNode(1);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.println(isPalindrome(head));

    }

    public  static boolean isPalindrome(C7_ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        C7_ListNode mid  = findMiddle(head);

        C7_ListNode reversedHead = reverseList(mid);

        while (reversedHead != null) {
            if (head.val != reversedHead.val) {return false;}

            head = head.next;
            reversedHead = reversedHead.next;
        }

        return true;
    }

    public static  C7_ListNode findMiddle(C7_ListNode head) {

        C7_ListNode slow = head;
        C7_ListNode fast = head;

        while (fast != null){
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public static C7_ListNode reverseList(C7_ListNode head) {

        if (head.next==null)return head;

        C7_ListNode prev = null;
        C7_ListNode curr = head;
        C7_ListNode forward;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}

class C7_ListNode {
    int val;
    C7_ListNode next;
    C7_ListNode() {}
    C7_ListNode(int val) { this.val = val; }
    C7_ListNode(int val, C7_ListNode next) { this.val = val; this.next = next; }
}