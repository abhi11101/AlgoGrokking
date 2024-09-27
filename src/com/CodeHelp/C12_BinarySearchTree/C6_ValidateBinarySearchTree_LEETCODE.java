package com.CodeHelp.C12_BinarySearchTree;

/*
https://leetcode.com/problems/validate-binary-search-tree/
 */
public class C6_ValidateBinarySearchTree_LEETCODE {

    public static void main(String[] args) {

        C6_BstNode root = new C6_BstNode(100);
        C6_BstNode fifty = new C6_BstNode(50);
        C6_BstNode oneFifty = new C6_BstNode(150);
        C6_BstNode twentyFive = new C6_BstNode(25);
        C6_BstNode seventyFive = new C6_BstNode(75);
        C6_BstNode oneTwentyFive = new C6_BstNode(125);
        C6_BstNode twoHundred = new C6_BstNode(200);

        root.left = fifty;
        root.right = oneFifty;
        fifty.left = twentyFive;
        fifty.right = seventyFive;
        oneFifty.left = oneTwentyFive;
        oneFifty.right = twoHundred;

        System.out.println(isValidBST(root));

    }

    public static boolean isValidBST(C6_BstNode root) {
        if (!(root.val>=Long.MIN_VALUE && root.val<=Long.MAX_VALUE)) return false;
        boolean left =  helper(root. left,Long.MIN_VALUE, root.val);
        boolean right = helper(root.right, root.val, Long.MAX_VALUE);

        return left && right;
    }

    public static boolean helper(C6_BstNode root, long lowerBound, long upperBound) {

        if (root == null) {
            return true;
        }

        if (!(root.val>lowerBound && root.val<upperBound)) return false;


        boolean left = helper(root.left , lowerBound, root.val);
        boolean right = helper(root.right, root.val, upperBound);

        return left && right;
    }

}

class C6_BstNode {
    int val;
    C6_BstNode left;
    C6_BstNode right;
    C6_BstNode() {}
    C6_BstNode(int val) { this.val = val; }
    C6_BstNode(int val, C6_BstNode left, C6_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}