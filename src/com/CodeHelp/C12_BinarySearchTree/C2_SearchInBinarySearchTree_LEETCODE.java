package com.CodeHelp.C12_BinarySearchTree;

/*
https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class C2_SearchInBinarySearchTree_LEETCODE {

    public static void main(String[] args) {

        C2_BstNode root = new C2_BstNode(4);
        root.left = new C2_BstNode(2);
        root.right = new C2_BstNode(7);
        root.left.left = new C2_BstNode(1);
        root.left.right = new C2_BstNode(3);

        C2_BstNode ans = searchBST(root,2);
        System.out.println(ans);

    }

    public static C2_BstNode searchBST(C2_BstNode root, int val) {

        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        else if (val < root.val) {
            return  searchBST(root.left, val);
        }else{
            return searchBST(root.right, val);
        }

    }

}

class C2_BstNode {
    int val;
    C2_BstNode left;
    C2_BstNode right;
    C2_BstNode() {}
    C2_BstNode(int val) { this.val = val; }
    C2_BstNode(int val, C2_BstNode left, C2_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
