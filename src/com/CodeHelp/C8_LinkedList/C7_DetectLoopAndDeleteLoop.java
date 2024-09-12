package com.CodeHelp.C8_LinkedList;

public class C7_DetectLoopAndDeleteLoop {

    public static void main(String[] args) {

        C8_ListNode head = new C8_ListNode(1);
        C8_ListNode second = new C8_ListNode(2);
        C8_ListNode third = new C8_ListNode(3);
        C8_ListNode fourth = new C8_ListNode(4);
        C8_ListNode fifth = new C8_ListNode(5);
        C8_ListNode sixth = new C8_ListNode(6);

        head.next = second;
        second.next = fourth;
        fourth.next = third;
        third.next = fifth;
        fifth.next = fourth;

        System.out.println(detectLoop(head));
        System.out.println(startingPointLoop(head));
        deleteLoop(head);
        System.out.println(detectLoop(head));

    }

    public static  boolean detectLoop(C8_ListNode head) {

        C8_ListNode slow = head;
        C8_ListNode fast = head;

        while (fast!=null){
            fast = fast.next;
            if (fast!=null){
                fast = fast.next;
                slow =slow.next;
            }
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static int startingPointLoop(C8_ListNode head) {

        C8_ListNode slow = head;
        C8_ListNode fast = head;

        while (fast!=null){
            fast = fast.next;
            if (fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
            if (slow == fast){
                break;
            }
        }
        slow = head;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }

    public static void deleteLoop(C8_ListNode head) {

        C8_ListNode slow = head;
        C8_ListNode fast = head;

        while (fast!=slow){
            fast = fast.next;
            if (fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
            if (slow == fast){
                break;
            }
        }

        slow = head;
        C8_ListNode prev = fast;
        while (slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

}

class C7_ListNode {
    int val;
    C8_ListNode next;
    C7_ListNode() {}
    C7_ListNode(int val) { this.val = val; }
    C7_ListNode(int val, C8_ListNode next) { this.val = val; this.next = next; }
}