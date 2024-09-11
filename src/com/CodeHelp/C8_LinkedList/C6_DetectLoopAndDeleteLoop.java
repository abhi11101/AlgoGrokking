package com.CodeHelp.C8_LinkedList;

public class C6_DetectLoopAndDeleteLoop {

    public static void main(String[] args) {

        C6_ListNode head = new C6_ListNode(1);
        C6_ListNode second = new C6_ListNode(2);
        C6_ListNode third = new C6_ListNode(3);
        C6_ListNode fourth = new C6_ListNode(4);
        C6_ListNode fifth = new C6_ListNode(5);
        C6_ListNode sixth = new C6_ListNode(6);

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

    public static  boolean detectLoop(C6_ListNode head) {

        C6_ListNode slow = head;
        C6_ListNode fast = head;

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

    public static int startingPointLoop(C6_ListNode head) {

        C6_ListNode slow = head;
        C6_ListNode fast = head;

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

    public static void deleteLoop(C6_ListNode head) {

        C6_ListNode slow = head;
        C6_ListNode fast = head;

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
        C6_ListNode prev = fast;
        while (slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

}

class C6_ListNode {
    int val;
    C6_ListNode next;
    C6_ListNode() {}
    C6_ListNode(int val) { this.val = val; }
    C6_ListNode(int val, C6_ListNode next) { this.val = val; this.next = next; }
}