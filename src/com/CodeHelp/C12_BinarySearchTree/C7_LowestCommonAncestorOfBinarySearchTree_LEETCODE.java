package com.CodeHelp.C12_BinarySearchTree;

/*
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 */
public class C7_LowestCommonAncestorOfBinarySearchTree_LEETCODE {

    public static void main(String[] args) {

        C7_BstNode root = new C7_BstNode(6);
        C7_BstNode zero = new C7_BstNode(0);
        C7_BstNode two = new C7_BstNode(2);
        C7_BstNode three = new C7_BstNode(3);
        C7_BstNode four = new C7_BstNode(4);
        C7_BstNode five = new C7_BstNode(5);
        C7_BstNode seven = new C7_BstNode(7);
        C7_BstNode eight = new C7_BstNode(8);
        C7_BstNode nine = new C7_BstNode(9);

        root.left = two;
        root.right = eight;
        two.left = zero;
        two.right = four;
        four.left= three;
        four.right = five;
        eight.left = seven;
        eight.right = nine;

        C7_BstNode ans = lowestCommonAncestor(root,seven,nine);
        System.out.println(ans.val);

    }

    public static C7_BstNode lowestCommonAncestor(C7_BstNode root, C7_BstNode p, C7_BstNode q) {

        if (root ==null || root == p || root ==q)return root;

        if (p.val<root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else if (p.val>root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }

}

class C7_BstNode {
    int val;
    C7_BstNode left;
    C7_BstNode right;
    C7_BstNode() {}
    C7_BstNode(int val) { this.val = val; }
    C7_BstNode(int val, C7_BstNode left, C7_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}