package com.CodeHelp.C8_LinkedList.Assignment;

/*
https://leetcode.com/problems/sort-list/description/
 */
public class A4_SortList_LEETCODE {

    public static void main(String[] args) {

        A4_ListNode head = new A4_ListNode(4);
        A4_ListNode second = new A4_ListNode(3);
        A4_ListNode third = new A4_ListNode(2);
        A4_ListNode fourth = new A4_ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;

        printList(head);

        A4_ListNode result = sortList(head);
        printList(result);
    }

    public static A4_ListNode sortList(A4_ListNode head) {
        if (head == null || head.next == null) {return head;}

        A4_ListNode mid = findMid(head);
        A4_ListNode left = head;
        A4_ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        A4_ListNode ansNode = merge(left,right);

        return ansNode;
    }

    public static A4_ListNode findMid(A4_ListNode head) {

        A4_ListNode slow = head;
        A4_ListNode fast = head.next;

        while (fast!=null){
            fast = fast.next;
            if (fast!=null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }

    public static A4_ListNode merge(A4_ListNode list1, A4_ListNode list2) {

        if (list1 == null && list2 == null) {return null;}
        else if (list1 == null) {return list2;}
        else if (list2 == null) {return list1;}


        A4_ListNode aNode = list1;
        A4_ListNode bNode = list2;

        A4_ListNode ansHead = new A4_ListNode(-1);
        A4_ListNode ansTail = ansHead;
        while (aNode != null && bNode != null) {

            int val1 = aNode.val;
            int val2 = bNode.val;

            if (val1<=val2){
                ansTail.next = aNode;
                ansTail = aNode;
                aNode = aNode.next;
            }else {
                ansTail.next = bNode;
                ansTail = bNode;
                bNode = bNode.next;
            }
        }

        while (aNode != null) {
            ansTail.next = aNode;
            ansTail = aNode;
            aNode = aNode.next;
        }
        while (bNode != null) {
            ansTail.next = bNode;
            ansTail = bNode;
            bNode = bNode.next;
        }
        ansHead = ansHead.next;

        return ansHead;


    }
    public static void printList(A4_ListNode head) {
        A4_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class A4_ListNode{
    int val;
    A4_ListNode next;
    A4_ListNode(){}
    A4_ListNode(int x){
        val = x;
    }
    A4_ListNode(int x,A4_ListNode next){
        val = x;
        this.next = next;
    }
}
