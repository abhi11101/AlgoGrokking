package com.CodeHelp.C11_Trees;

/*
https://leetcode.com/problems/balanced-binary-tree/
 */
public class C9_BalancedBinaryTree_LEETCODE {

    public static void main(String[] args) {

        C9_TreeNode root = new C9_TreeNode(3);
        root.left = new C9_TreeNode(9);
        root.right = new C9_TreeNode(20);
        root.right.left = new C9_TreeNode(15);
        root.right.right = new C9_TreeNode(7);

        System.out.println(isBalanced(root));
    }


    public static boolean isBalanced(C9_TreeNode root) {

        if (root == null) return true;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        int diff = Math.abs(leftHeight - rightHeight);
        boolean diffBalanced = diff<=1;


        return diffBalanced && isBalanced(root.left) && isBalanced(root.right);

    }


    public static int findHeight(C9_TreeNode root) {

        if (root == null)return 0;

        int left = findHeight(root.left);
        int right = findHeight(root.right);

        return Math.max(left, right) + 1;

    }

}

class C9_TreeNode {
    int val;
    C9_TreeNode left;
    C9_TreeNode right;
    C9_TreeNode() {}
    C9_TreeNode(int val) { this.val = val; }
    C9_TreeNode(int val, C9_TreeNode left, C9_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


