package com.CodeHelp.C12_BinarySearchTree;

/*
https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
 */
public class C8_KthSmallestElementInBST_LEETCODE {

    public static void main(String[] args) {


    }

    public static int kthSmallest(C8_BstNode root, int k) {

        if (root == null)return -1;

        int left = kthSmallest(root.left, k);

        if (left != -1)return left;

        k--;
        if (k == 0)return root.val;

        int right = kthSmallest(root.right, k);

        return right;
    }

}

class C8_BstNode {
    int val;
    C8_BstNode left;
    C8_BstNode right;
    C8_BstNode() {}
    C8_BstNode(int val) { this.val = val; }
    C8_BstNode(int val, C8_BstNode left, C8_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}