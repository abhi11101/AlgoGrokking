package com.CodeHelp.C8_LinkedList;

public class C9_Sort012 {

    public static void main(String[] args) {

        C9_ListNode head = new C9_ListNode(1);
        C9_ListNode second = new C9_ListNode(2);
        C9_ListNode third = new C9_ListNode(0);
        C9_ListNode fourth = new C9_ListNode(2);
        C9_ListNode fifth = new C9_ListNode(0);
        C9_ListNode sixth = new C9_ListNode(2);
        C9_ListNode seventh = new C9_ListNode(1);

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

    public static void sortUsingCount(C9_ListNode head) {

        int zero =0;
        int one = 0;
        int two = 0;

        C9_ListNode temp = head;

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

    public static C9_ListNode withoutChangingData(C9_ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        C9_ListNode zeroHead = new C9_ListNode(-1);
        C9_ListNode zeroTail = zeroHead;
        C9_ListNode oneHead = new C9_ListNode(-1);
        C9_ListNode oneTail = oneHead;
        C9_ListNode twoHead = new C9_ListNode(-1);
        C9_ListNode twoTail = twoHead;


        C9_ListNode temp = head;
        C9_ListNode forward;

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

    public static void printList(C9_ListNode head) {
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        C9_ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class C9_ListNode{
    int val;
    C9_ListNode next;
    C9_ListNode(){}
    C9_ListNode(int x){
        val = x;
    }
    C9_ListNode(int x,C9_ListNode next){
        val = x;
        this.next = next;
    }
}