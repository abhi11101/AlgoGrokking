package com.CodeHelp.C11_Trees;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */
public class C2_BinaryTreeInorderTraversal_LEETCODE {

    public static void main(String[] args) {

        C2_TreeNode root = new C2_TreeNode(10);
        C2_TreeNode second1 = new C2_TreeNode(60);
        C2_TreeNode second2 = new C2_TreeNode(30);

        root.left = second1;
        root.right = second2;

        C2_TreeNode third1 = new C2_TreeNode(80);
        C2_TreeNode third2 = new C2_TreeNode(20);
        C2_TreeNode third3 = new C2_TreeNode(50);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;

        C2_TreeNode fourth1 = new C2_TreeNode(70);
        C2_TreeNode fourth2 = new C2_TreeNode(40);

        third2.left = fourth1;
        third2.right = fourth2;

        List<Integer> ans = inorderTraversal(root);
        System.out.println(ans);

    }

    public static List<Integer> inorderTraversal(C2_TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        helper(root,ans);

        return ans;

    }

    public static void helper(C2_TreeNode root, List<Integer> ans) {

        if (root == null) {
            return;
        }

        helper(root.left, ans);
        ans.add(root.val);
        helper(root.right, ans);

    }

}

class C2_TreeNode {
      int val;
    C2_TreeNode left;
    C2_TreeNode right;
    C2_TreeNode() {}
    C2_TreeNode(int val) { this.val = val; }
    C2_TreeNode(int val, C2_TreeNode left, C2_TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}