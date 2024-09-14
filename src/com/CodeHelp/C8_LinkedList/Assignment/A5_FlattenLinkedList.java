package com.CodeHelp.C8_LinkedList.Assignment;

public class A5_FlattenLinkedList {

    public static void main(String[] args) {

        A5_ListNode head = new A5_ListNode(5);
        A5_ListNode second = new A5_ListNode(10);
        A5_ListNode third = new A5_ListNode(19);
        A5_ListNode fourth = new A5_ListNode(28);

        head.next = second;
        second.next = third;
        third.next = fourth;

        A5_ListNode oneB1 = new A5_ListNode(7);
        A5_ListNode oneB2 = new A5_ListNode(8);
        A5_ListNode oneB3 = new A5_ListNode(30);

        head.bottom = oneB1;
        oneB1.bottom = oneB2;
        oneB2.bottom = oneB3;

        A5_ListNode twoB1 = new A5_ListNode(20);
        second.bottom = twoB1;

        A5_ListNode threeB1 = new A5_ListNode(22);
        A5_ListNode threeB2 = new A5_ListNode(50);
        third.bottom = threeB1;
        threeB1.bottom = threeB2;

        A5_ListNode fourB1 = new A5_ListNode(35);
        A5_ListNode fourB2 = new A5_ListNode(40);
        A5_ListNode fourB3 = new A5_ListNode(45);
        fourth.bottom = fourB1;
        fourB1.bottom = fourB2;
        fourB2.bottom = fourB3;

        A5_ListNode ans = flatten(head);
        printList(ans);
    }

    public static A5_ListNode flatten(A5_ListNode head) {

        if (head == null) {return null;}

        A5_ListNode mergedNode = merge(head, flatten(head.next));

        return mergedNode;
    }

    public static A5_ListNode merge(A5_ListNode headA, A5_ListNode headB) {

        if (headA == null) {return headB;}
        if (headB == null) {return headA;}

        A5_ListNode ans = null;
        if (headA.val < headB.val){
            ans = headA;
            ans.bottom = merge(headA.bottom, headB);
        }else{
            ans = headB;
            ans.bottom = merge(headA, headB.bottom);
        }
        return ans;

    }
    private static void printList(A5_ListNode head) {

        A5_ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.bottom;
        }
        System.out.println();

    }

}

class A5_ListNode{
    int val;
    A5_ListNode next;
    A5_ListNode bottom;

    A5_ListNode(){}
    A5_ListNode(int val){
        this.val = val;
    }
    A5_ListNode(int val, A5_ListNode next){
        this.val = val;
        this.next = next;
    }
}