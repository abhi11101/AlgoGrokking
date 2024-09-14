package com.CodeHelp.C8_LinkedList.Assignment;

import java.util.logging.Logger;

/*
https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 */
public class A2_IntersectionOfTwoLinkedLists_LEETCODE {

    public static Logger log = Logger.getLogger(A2_IntersectionOfTwoLinkedLists_LEETCODE.class.getName());

    public static void main(String[] args) {

        A2_ListNode headA1 = new A2_ListNode("a1");
        A2_ListNode secondA2 = new A2_ListNode("a2");

        A2_ListNode headB1   = new A2_ListNode("b1");
        A2_ListNode secondB2 = new A2_ListNode("b2");
        A2_ListNode thirdB3 = new A2_ListNode("b3");

        A2_ListNode headC1 = new A2_ListNode("c1");
        A2_ListNode secondC2 = new A2_ListNode("c2");
        A2_ListNode thirdC3 = new A2_ListNode("c3");

        headA1.next = secondA2;

        headB1.next = secondB2;
        secondB2.next = thirdB3;

        headC1.next = secondC2;
        secondC2.next = thirdC3;

        secondA2.next = headC1;
        thirdB3.next = headC1;

        System.out.print("List A : ");
        printList(headA1);
        System.out.print("List B : ");
        printList(headB1);

        System.out.println( "Intersecting Node: " + getIntersectionNode(headA1, headB1).val);

    }

    public static A2_ListNode getIntersectionNode(A2_ListNode headA, A2_ListNode headB) {

        A2_ListNode aNode = headA;
        A2_ListNode bNode = headB;

        while (aNode != null && bNode != null) {
            if (aNode==bNode)return aNode;
//            System.out.println("a node val = "+aNode.val);
//            System.out.println("b node val = "+bNode.val);
            aNode = aNode.next;
            bNode = bNode.next;
        }

        if (aNode == null){
//            log.info("Inside if");
            int lenB = 0;
            while (bNode != null){
                bNode = bNode.next;
                lenB++;
            }
//            log.info("Length of B: " + lenB);
            while (lenB>0){
                headB = headB.next;
                lenB--;
            }

        }else {
//            log.info("Inside else");
            int lenA = 0;
            while (aNode != null){
                aNode = aNode.next;
                lenA++;
            }
            while (lenA>0){
                headA = headA.next;
                lenA--;
            }
        }
//        log.info("First while ended");
        while (headA!=headB){
//            System.out.println("a head val = "+headA.val);
//            System.out.println("b head val = "+headB.val);
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

    }

    public static void printList(A2_ListNode head){
        A2_ListNode curr = head;
        while (curr!=null){
            System.out.print(curr.val +" ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class A2_ListNode{

    String val;
    A2_ListNode next;

    public A2_ListNode(){}
    public A2_ListNode(String val){
        this.val = val;
    }
    public A2_ListNode(String val, A2_ListNode next){
        this.val = val;
        this.next = next;
    }
}
