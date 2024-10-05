package com.CodeHelp.C13_Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class C13_MergeKSortedLists_LEETCODE {

    public static void main(String[] args) {

        C13_HeapListNode head1 = new C13_HeapListNode(1);
        C13_HeapListNode second1 = new C13_HeapListNode(4);
        C13_HeapListNode third1 = new C13_HeapListNode(5);
        head1.next = second1;
        second1.next = third1;

        C13_HeapListNode head2 = new C13_HeapListNode(1);
        C13_HeapListNode second2 = new C13_HeapListNode(3);
        C13_HeapListNode third2 = new C13_HeapListNode(4);
        head2.next = second2;
        second2.next = third2;

        C13_HeapListNode head3 = new C13_HeapListNode(2);
        C13_HeapListNode second3 = new C13_HeapListNode(6);
        head3.next = second3;

        C13_HeapListNode head4 = new C13_HeapListNode(5);
        C13_HeapListNode second4 = new C13_HeapListNode(8);
        C13_HeapListNode third4 = new C13_HeapListNode(9);
        head4.next = second4;
        second4.next = third4;

        C13_HeapListNode head5 = new C13_HeapListNode(6);
        C13_HeapListNode second5 = new C13_HeapListNode(8);
        C13_HeapListNode third5 = new C13_HeapListNode(10);
        C13_HeapListNode fourth5 = new C13_HeapListNode(11);
        head5.next = second5;
        second5.next = third5;
        third5.next = fourth5;

        C13_HeapListNode[] listNodes = {head1,head2,head3,head4,head5};

        C13_HeapListNode ans = mergeKLists(listNodes);
        printList(ans);
    }

    public static C13_HeapListNode mergeKLists(C13_HeapListNode[] lists) {

        PriorityQueue<C13_HeapListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a->a.val));
        
        for (int i = 0;i<lists.length;i++){
            
            if (lists[i]!=null){
                minHeap.add(lists[i]);
            }
        }
        
        C13_HeapListNode head = new C13_HeapListNode(-1);
        C13_HeapListNode tail = head;
        while (!minHeap.isEmpty()){
            
            C13_HeapListNode node = minHeap.poll();
            
            tail.next = node;
            tail = node;
            
            if (node.next!=null){
                minHeap.add(node.next);
            }
        }
        
        return head.next;
    }

    public static void printList(C13_HeapListNode head) {

        C13_HeapListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}

class  C13_HeapListNode{
      int val;
      C13_HeapListNode next;
      C13_HeapListNode() {}
      C13_HeapListNode(int val) { this.val = val; }
      C13_HeapListNode(int val, C13_HeapListNode next) { this.val = val; this.next = next; }
 }