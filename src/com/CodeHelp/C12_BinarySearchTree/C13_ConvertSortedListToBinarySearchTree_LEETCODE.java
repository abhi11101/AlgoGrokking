package com.CodeHelp.C12_BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 */
public class C13_ConvertSortedListToBinarySearchTree_LEETCODE {

    public static void main(String[] args) {

        C13_ListNode head = new C13_ListNode(-10);
        head.next = new C13_ListNode(-3);
        head.next.next = new C13_ListNode(0);
        head.next.next.next = new C13_ListNode(5);
        head.next.next.next.next = new C13_ListNode(9);

        C13_BstNode ans = sortedListToBSTFaster(head);
        levelOrder(ans);


    }

    public static C13_BstNode sortedListToBSTFaster(C13_ListNode head) {

        if (head == null) {return null;}

        return helperFaster(head,null);

    }

    public static C13_BstNode helperFaster(C13_ListNode start, C13_ListNode end) {
        if (start==end)return null;

        C13_ListNode slow = start;
        C13_ListNode fast = start;

        while (fast!=end && fast.next!=end) {
            slow = slow.next;
            fast = fast.next.next;
        }

        C13_BstNode root = new C13_BstNode(slow.val);
        root.left = helperFaster(start,slow);
        root.right = helperFaster(slow.next,end);

        return root;
    }



    public static C13_BstNode sortedListToBST(C13_ListNode head) {
        List<Integer> nodes = new ArrayList<>();
        createArray(head,nodes);

        return helper(nodes,0,nodes.size()-1);
    }

    public static void createArray(C13_ListNode head, List<Integer> nodes){

        C13_ListNode temp = head;

        while(temp!=null){
            nodes.add(temp.val);
            temp = temp.next;
        }
    }

    public static C13_BstNode helper(List<Integer> nodes, int start, int end){

        if(start>end)return null;

        int mid = (start+end)/2;
        int element = nodes.get(mid);
        C13_BstNode root = new C13_BstNode(element);

        root.left = helper(nodes,start, mid-1);
        root.right = helper(nodes,mid+1,end);

        return root;
    }

    public static void levelOrder(C13_BstNode root){

        List<List<Integer>> ans= new ArrayList<>();
        Queue<C13_BstNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                C13_BstNode cur = q.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            ans.add(list);
        }

        System.out.println(ans);
    }
}

class C13_BstNode {
    int val;
    C13_BstNode left;
    C13_BstNode right;
    C13_BstNode() {}
    C13_BstNode(int val) { this.val = val; }
    C13_BstNode(int val, C13_BstNode left, C13_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class C13_ListNode {
      int val;
    C13_ListNode next;
    C13_ListNode() {}
    C13_ListNode(int val) { this.val = val; }
    C13_ListNode(int val, C13_ListNode next) { this.val = val; this.next = next; }
 }