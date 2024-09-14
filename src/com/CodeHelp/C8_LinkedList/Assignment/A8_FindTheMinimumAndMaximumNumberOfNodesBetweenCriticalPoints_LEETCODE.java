package com.CodeHelp.C8_LinkedList.Assignment;

/*
https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/description/
 */
public class A8_FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints_LEETCODE {

    public static void main(String[] args) {

        A8_ListNode head = new A8_ListNode(5);
        A8_ListNode second = new A8_ListNode(3);
        A8_ListNode third = new A8_ListNode(1);
        A8_ListNode fourth = new A8_ListNode(2);
        A8_ListNode fifth = new A8_ListNode(5);
        A8_ListNode sixth = new A8_ListNode(1);
        A8_ListNode seventh = new A8_ListNode(2);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        int[] ans = nodesBetweenCriticalPoints(head);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

    }

    public static int[] nodesBetweenCriticalPoints(A8_ListNode head) {

        int[] ans = {-1,-1};

        A8_ListNode prev = head;
        if (prev==null)return ans;
        A8_ListNode curr = head.next;
        if (curr==null)return ans;
        A8_ListNode next = curr.next;
        if (next==null)return ans;

        int firstCP = -1;
        int lastCP = -1;
        int index =1;
        int min = Integer.MAX_VALUE;
        while (next!=null){

            int currVal = curr.val;
            int prevVal = prev.val;
            int nextVal = next.val;

            boolean isCP = ((currVal< prevVal && currVal < nextVal) || (currVal>prevVal && currVal > nextVal));

            if (isCP && firstCP==-1){
                firstCP = index;
                lastCP = index;
            }else if (isCP){
                min = Math.min(min, index-lastCP);
                lastCP = index;
            }

            index++;
            prev = prev.next;
            curr = curr.next;
            next = next.next;
        }
        if (firstCP==lastCP)return ans;

        ans[0]=min;
        ans[1]=lastCP-firstCP;
        return ans;
    }
}

class A8_ListNode{
    int val;
    A8_ListNode next;
    A8_ListNode(int x){
        val = x;
    }
    A8_ListNode(int val, A8_ListNode next){
        this.val = val;
        this.next = next;
    }
}
