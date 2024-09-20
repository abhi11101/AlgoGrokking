package com.CodeHelp.C11_Trees;

import java.util.List;

/*
https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class C5_MaximumDepthOfBinaryTree_LEETCODE {

    public static void main(String[] args) {

        C5_TreeNode root = new C5_TreeNode(10);
        C5_TreeNode second1 = new C5_TreeNode(60);
        C5_TreeNode second2 = new C5_TreeNode(30);

        root.left = second1;
        root.right = second2;

        C5_TreeNode third1 = new C5_TreeNode(80);
        C5_TreeNode third2 = new C5_TreeNode(20);
        C5_TreeNode third3 = new C5_TreeNode(50);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;

        C5_TreeNode fourth1 = new C5_TreeNode(70);
        C5_TreeNode fourth2 = new C5_TreeNode(40);

        third2.left = fourth1;
        third2.right = fourth2;

        int ans = maxDepth(root);
        System.out.println(ans);

    }

    public static int maxDepth(C5_TreeNode root) {

        if (root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }

}


class C5_TreeNode {
    int val;
    C5_TreeNode left;
    C5_TreeNode right;
    C5_TreeNode() {}
    C5_TreeNode(int val) { this.val = val; }
    C5_TreeNode(int val, C5_TreeNode left, C5_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}