package com.CodeHelp.C11_Trees;

/*
https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class C6_DiameterOfBinaryTree_LEETCODE {

    public static void main(String[] args) {

        C6_TreeNode root = new C6_TreeNode(10);
        C6_TreeNode second1 = new C6_TreeNode(60);
        C6_TreeNode second2 = new C6_TreeNode(30);

        root.left = second1;
        root.right = second2;

        C6_TreeNode third1 = new C6_TreeNode(80);
        C6_TreeNode third2 = new C6_TreeNode(20);
        C6_TreeNode third3 = new C6_TreeNode(50);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;

        C6_TreeNode fourth1 = new C6_TreeNode(70);
        C6_TreeNode fourth2 = new C6_TreeNode(40);

        third2.left = fourth1;
        third2.right = fourth2;

        int ans = diameterOfBinaryTree(root);
        System.out.println(ans);
    }

    public static int diameterOfBinaryTree(C6_TreeNode root) {

        int ans = helper(root);

        return ans-1;

    }

    public static int helper(C6_TreeNode root) {

        if (root==null){
            return 0;
        }

        int leftDiameter = helper(root.left);
        int rightDiameter = helper(root.right);
        int withRootDiameter = maxDepth(root.left) + maxDepth(root.right) + 1;


        return Math.max(leftDiameter, Math.max(rightDiameter, withRootDiameter));


    }
    public static int maxDepth(C6_TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }

}

class C6_TreeNode {
    int val;
    C6_TreeNode left;
    C6_TreeNode right;
    C6_TreeNode() {}
    C6_TreeNode(int val) { this.val = val; }
    C6_TreeNode(int val, C6_TreeNode left, C6_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}