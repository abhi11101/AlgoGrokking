package com.CodeHelp.C11_Trees;

/*
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 */
public class C12_LowestCommonAncestorOfBinaryTree_LEETCODE {

    public static void main(String[] args) {

        C12_TreeNode root = new C12_TreeNode(3);
        C12_TreeNode five = new C12_TreeNode(5);
        C12_TreeNode one = new C12_TreeNode(1);
        C12_TreeNode six = new C12_TreeNode(6);
        C12_TreeNode two = new C12_TreeNode(2);
        C12_TreeNode zero = new C12_TreeNode(0);
        C12_TreeNode eight = new C12_TreeNode(8);
        C12_TreeNode seven = new C12_TreeNode(7);
        C12_TreeNode four  = new C12_TreeNode(4);

        root.left = five;
        root.right = one;

        five.left = six;
        five.right = two;

        one.left = zero;
        one.right = eight;

        two.left = seven;
        two.right = four;

        C12_TreeNode ans = lowestCommonAncestor(root,five,four);

        System.out.println(ans.val);


    }

    public static C12_TreeNode lowestCommonAncestor(C12_TreeNode root, C12_TreeNode p, C12_TreeNode q) {

         if (root == null || root == p || root == q) return root;

         C12_TreeNode left = lowestCommonAncestor(root.left, p, q);
         C12_TreeNode right = lowestCommonAncestor(root.right, p, q);

         if (left==null && right==null) return null;
         else if (left==null && right!=null) return right;
         else if (left!=null && right==null) return left;
         else return root;

    }

}

class C12_TreeNode {
    int val;
    C12_TreeNode left;
    C12_TreeNode right;
    C12_TreeNode() {}
    C12_TreeNode(int val) { this.val = val; }
    C12_TreeNode(int val, C12_TreeNode left, C12_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
