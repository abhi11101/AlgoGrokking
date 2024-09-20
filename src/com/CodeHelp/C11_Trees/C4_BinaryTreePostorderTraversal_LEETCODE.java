package com.CodeHelp.C11_Trees;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class C4_BinaryTreePostorderTraversal_LEETCODE {

    public static void main(String[] args) {

        C4_TreeNode root = new C4_TreeNode(10);
        C4_TreeNode second1 = new C4_TreeNode(60);
        C4_TreeNode second2 = new C4_TreeNode(30);

        root.left = second1;
        root.right = second2;

        C4_TreeNode third1 = new C4_TreeNode(80);
        C4_TreeNode third2 = new C4_TreeNode(20);
        C4_TreeNode third3 = new C4_TreeNode(50);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;

        C4_TreeNode fourth1 = new C4_TreeNode(70);
        C4_TreeNode fourth2 = new C4_TreeNode(40);

        third2.left = fourth1;
        third2.right = fourth2;

        List<Integer> ans = postorderTraversal(root);
        System.out.println(ans);

    }

    public static List<Integer> postorderTraversal(C4_TreeNode root) {

        List<Integer> result = new ArrayList<>();

        helper(root,result);

        return result;

    }


    public static void helper(C4_TreeNode root, List<Integer> result) {

        if (root==null)return;

        helper(root.left,result);
        helper(root.right,result);
        result.add(root.val);

    }
}

class C4_TreeNode {
    int val;
    C4_TreeNode left;
    C4_TreeNode right;
    C4_TreeNode() {}
    C4_TreeNode(int val) { this.val = val; }
    C4_TreeNode(int val, C4_TreeNode left, C4_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
