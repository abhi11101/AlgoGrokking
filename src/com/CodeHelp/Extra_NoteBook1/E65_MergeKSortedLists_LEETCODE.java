package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class E65_MergeKSortedLists_LEETCODE {

    public static void main(String[] args) {

        E65_ListNode head1 = new E65_ListNode(1);
        E65_ListNode second1 = new E65_ListNode(4);
        E65_ListNode third1 = new E65_ListNode(5);
        head1.next = second1;
        second1.next = third1;

        E65_ListNode head2 = new E65_ListNode(1);
        E65_ListNode second2 = new E65_ListNode(3);
        E65_ListNode third2 = new E65_ListNode(4);
        head2.next = second2;
        second2.next = third2;

        E65_ListNode head3 = new E65_ListNode(2);
        E65_ListNode second3 = new E65_ListNode(6);
        head3.next = second3;

        E65_ListNode head4 = new E65_ListNode(5);
        E65_ListNode second4 = new E65_ListNode(8);
        E65_ListNode third4 = new E65_ListNode(9);
        head4.next = second4;
        second4.next = third4;

        E65_ListNode head5 = new E65_ListNode(6);
        E65_ListNode second5 = new E65_ListNode(8);
        E65_ListNode third5 = new E65_ListNode(10);
        E65_ListNode fourth5 = new E65_ListNode(11);
        head5.next = second5;
        second5.next = third5;
        third5.next = fourth5;

        E65_ListNode[] listNodes = {head1,head2,head3,head4,head5};

        E65_ListNode ans = mergeKLists(listNodes);
        printList(ans);
    }

    public static E65_ListNode mergeKLists(E65_ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return helper(lists, 0, lists.length - 1);
    }

    public static E65_ListNode helper(E65_ListNode[] lists, int start, int end) {

        if (start==end)return lists[start];

        int mid = start + (end - start)/2;

        E65_ListNode l1 = helper(lists, start, mid);
        E65_ListNode l2 = helper(lists, mid + 1, end);

        return merge(l1,l2);
    }

    public static E65_ListNode merge(E65_ListNode l1, E65_ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        E65_ListNode ans = new E65_ListNode(-1);
        E65_ListNode tail = ans;
        while (l1!=null && l2!=null) {

            if (l1.val < l2.val) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return ans.next;
    }

    public static void printList(E65_ListNode head) {

        E65_ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

class E65_ListNode{
    int val;
    E65_ListNode next;
    public E65_ListNode(int x) { val = x; }
    E65_ListNode(int x,E65_ListNode next) { val = x; this.next = next; }
}