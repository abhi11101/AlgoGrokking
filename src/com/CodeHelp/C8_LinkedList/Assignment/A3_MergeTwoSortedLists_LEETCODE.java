package com.CodeHelp.C8_LinkedList.Assignment;

/*
https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class A3_MergeTwoSortedLists_LEETCODE {

    public static void main(String[] args) {

        A3_ListNode headA = new A3_ListNode(1);
        A3_ListNode aSecond = new A3_ListNode(2);
        A3_ListNode aThird = new A3_ListNode(4);

        headA.next = aSecond;
        aSecond.next = aThird;

        A3_ListNode headB  = new A3_ListNode(1);
        A3_ListNode bSecond = new A3_ListNode(3);
        A3_ListNode bThird = new A3_ListNode(4);

        headB.next = bSecond;
        bSecond.next = bThird;

        printList(headA);
        printList(headB);

        A3_ListNode ans = mergeTwoLists(headA, headB);
        printList(ans);

    }

    public static A3_ListNode mergeTwoLists(A3_ListNode list1, A3_ListNode list2) {

        if (list1 == null && list2 == null) {return null;}
        else if (list1 == null) {return list2;}
        else if (list2 == null) {return list1;}


        A3_ListNode aNode = list1;
        A3_ListNode bNode = list2;

        A3_ListNode ansHead = new A3_ListNode(-1);
        A3_ListNode ansTail = ansHead;
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

        if (aNode != null) {
            ansTail.next = aNode;
        }
        if (bNode != null) {
            ansTail.next = bNode;
        }
        ansHead = ansHead.next;

        return ansHead;
    }

    public static void printList(A3_ListNode head) {
        A3_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class A3_ListNode{
    int val;
    A3_ListNode next;

    A3_ListNode(){}
    A3_ListNode(int val){
        this.val = val;
    }
    A3_ListNode(int val, A3_ListNode next){
        this.val = val;
        this.next = next;
    }
}
