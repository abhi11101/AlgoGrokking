package com.CodeHelp.C11_Trees.Assignment;

/*
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 */
public class A10_FlattenBinaryTreeToLinkedList_LEETCODE {

    public static void main(String[] args) {

        A10_TreeNode root = new A10_TreeNode(1);
        A10_TreeNode two = new A10_TreeNode(2);
        A10_TreeNode three = new A10_TreeNode(3);
        A10_TreeNode four = new A10_TreeNode(4);
        A10_TreeNode five = new A10_TreeNode(5);
        A10_TreeNode six = new A10_TreeNode(6);

        root.left = two;
        root.right = five;
        two.left = three;
        two.right = four;
        five.right = six;

        flatten(root);
        print(root);
    }

    public static void flatten(A10_TreeNode root) {

        A10_TreeNode curr = root;
        while (curr != null) {


            if (curr.left != null) {
                A10_TreeNode pred = curr.left;
                while (pred.right != null) {
                    pred = pred.right;
                }

                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    public static void print(A10_TreeNode root) {

        A10_TreeNode curr = root;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }

    }
}

class A10_TreeNode {
    int val;
    A10_TreeNode left;
    A10_TreeNode right;
    A10_TreeNode() {}
    A10_TreeNode(int val) { this.val = val; }
    A10_TreeNode(int val, A10_TreeNode left, A10_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}