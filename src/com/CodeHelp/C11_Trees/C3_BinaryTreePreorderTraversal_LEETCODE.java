package com.CodeHelp.C11_Trees;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class C3_BinaryTreePreorderTraversal_LEETCODE {

    public static void main(String[] args) {

        C3_TreeNode root = new C3_TreeNode(10);
        C3_TreeNode second1 = new C3_TreeNode(60);
        C3_TreeNode second2 = new C3_TreeNode(30);

        root.left = second1;
        root.right = second2;

        C3_TreeNode third1 = new C3_TreeNode(80);
        C3_TreeNode third2 = new C3_TreeNode(20);
        C3_TreeNode third3 = new C3_TreeNode(50);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;

        C3_TreeNode fourth1 = new C3_TreeNode(70);
        C3_TreeNode fourth2 = new C3_TreeNode(40);

        third2.left = fourth1;
        third2.right = fourth2;

        List<Integer> ans = preorderTraversal(root);
        System.out.println(ans);


    }

    public static List<Integer> preorderTraversal(C3_TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        helper(root,ans);

        return ans;

    }

    public static void helper(C3_TreeNode root, List<Integer> ans) {

        if (root == null) {
            return;
        }

        ans.add(root.val);
        helper(root.left, ans);
        helper(root.right, ans);
    }

}

class C3_TreeNode {
    int val;
    C3_TreeNode left;
    C3_TreeNode right;
    C3_TreeNode() {}
    C3_TreeNode(int val) { this.val = val; }
    C3_TreeNode(int val, C3_TreeNode left, C3_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
