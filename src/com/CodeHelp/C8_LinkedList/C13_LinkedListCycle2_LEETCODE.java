package com.CodeHelp.C8_LinkedList;

/*
https://leetcode.com/problems/linked-list-cycle-ii/description/
 */
public class C13_LinkedListCycle2_LEETCODE {

    public static void main(String[] args) {

        C13_ListNode head=new C13_ListNode(1);
        C13_ListNode node2=new C13_ListNode(2);
        C13_ListNode node3=new C13_ListNode(3);
        C13_ListNode node4=new C13_ListNode(4);
        C13_ListNode node5=new C13_ListNode(5);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next = node2;

        C13_ListNode ans = detectCycle(head);
        System.out.println(ans.val);

    }

    public static C13_ListNode detectCycle(C13_ListNode head) {
        if(head == null || head.next == null)return null;
        C13_ListNode slow = head;
        C13_ListNode fast = head;

        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
            if(fast==slow)break;
        }

        if(fast != slow) return null;

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}

class C13_ListNode{
    int val;
    C13_ListNode next;

    C13_ListNode(){}
    C13_ListNode(int x) { val = x; }
    C13_ListNode(int x,C13_ListNode next) { val = x; this.next = next; }
}
