package com.CodeHelp.C12_BinarySearchTree.Assignment;

/*
https://leetcode.com/problems/range-sum-of-bst/
 */
public class A2_RangeSumOfBST_LEETCODE {

    public static void main(String[] args) {

        A2_BstNode root = new A2_BstNode(10);
        A2_BstNode five = new A2_BstNode(5);
        A2_BstNode fifteen  = new A2_BstNode(15);
        A2_BstNode three  = new A2_BstNode(3);
        A2_BstNode seven = new A2_BstNode(7);
        A2_BstNode eighteen  = new A2_BstNode(18);

        root.left = five;
        root.right = fifteen;
        five.left = three;
        five.right = seven;
        fifteen.right = eighteen;

        System.out.println(rangeSumBST(root,7,15));

    }

    public static int rangeSumBST(A2_BstNode root, int low, int high) {
        if(root==null)return 0;

        int[] sum = {0};

        helper(root, low, high, sum);
        return sum[0];
    }

    public static void helper(A2_BstNode root, int low, int high, int[] sum) {

        if (root==null)return;


        if (root.val>=low && root.val<=high) {
            sum[0]+=root.val;
        }

        if (root.val==low)
        helper(root.right,low,high,sum);
        else if (root.val==high)helper(root.left,low,high,sum);
        else{
            helper(root.left,low,high,sum);
            helper(root.right,low,high,sum);
        }
    }

}

class A2_BstNode {
    int val;
    A2_BstNode left;
    A2_BstNode right;
    A2_BstNode() {}
    A2_BstNode(int val) { this.val = val; }
    A2_BstNode(int val, A2_BstNode left, A2_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}