package com.CodeHelp.C8_LinkedList;

public class C10_Sort012 {

    public static void main(String[] args) {

        C10_ListNode head = new C10_ListNode(1);
        C10_ListNode second = new C10_ListNode(2);
        C10_ListNode third = new C10_ListNode(0);
        C10_ListNode fourth = new C10_ListNode(2);
        C10_ListNode fifth = new C10_ListNode(0);
        C10_ListNode sixth = new C10_ListNode(2);
        C10_ListNode seventh = new C10_ListNode(1);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        printList(head);
        //sortUsingCount(head);
        head = withoutChangingData(head);
        printList(head);



    }

    public static void sortUsingCount(C10_ListNode head) {

        int zero =0;
        int one = 0;
        int two = 0;

        C10_ListNode temp = head;

        while (temp != null) {
            if (temp.val == 0) {
                zero++;
            }else if (temp.val == 1) {
                one++;
            }else{
                two++;
            }
            temp = temp.next;
        }

        temp =head;
        while (zero>0){
            temp.val = 0;
            temp = temp.next;
            zero--;
        }
        while (one>0){
            temp.val = 1;
            temp = temp.next;
            one--;
        }
        while (two>0){
            temp.val = 2;
            temp = temp.next;
            two--;
        }

    }

    public static C10_ListNode withoutChangingData(C10_ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        C10_ListNode zeroHead = new C10_ListNode(-1);
        C10_ListNode zeroTail = zeroHead;
        C10_ListNode oneHead = new C10_ListNode(-1);
        C10_ListNode oneTail = oneHead;
        C10_ListNode twoHead = new C10_ListNode(-1);
        C10_ListNode twoTail = twoHead;


        C10_ListNode temp = head;
        C10_ListNode forward;

        while (temp != null) {

            forward = temp.next;
            temp.next = null;

            if (temp.val == 0) {
                zeroTail.next = temp;
                zeroTail = temp;
            }
            else if (temp.val == 1) {
                oneTail.next = temp;
                oneTail = temp;
            }
            else if (temp.val == 2) {
                twoTail.next = temp;
                twoTail = temp;
            }
            temp = forward;
        }

        zeroHead = zeroHead.next;
        oneHead = oneHead.next;
        twoHead = twoHead.next;

        if (oneHead!=null){
            zeroTail.next = oneHead;
            if (twoHead!=null){
                oneTail.next = twoHead;
            }
        }else {
            if (twoHead!=null){
                zeroTail.next = twoHead;
            }
        }

        return zeroHead != null ? zeroHead :
                oneHead != null ? oneHead :
                        twoHead;

    }

    public static void printList(C10_ListNode head) {
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        C10_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class C10_ListNode {
    int val;
    C10_ListNode next;
    C10_ListNode(){}
    C10_ListNode(int x){
        val = x;
    }
    C10_ListNode(int x, C10_ListNode next){
        val = x;
        this.next = next;
    }
}