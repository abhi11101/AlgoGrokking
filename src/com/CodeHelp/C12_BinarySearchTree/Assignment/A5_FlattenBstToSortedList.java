package com.CodeHelp.C12_BinarySearchTree.Assignment;

public class A5_FlattenBstToSortedList {

    public static void main(String[] args) {

        A5_BstNode root = new A5_BstNode(5);
        A5_BstNode three = new A5_BstNode(3);
        A5_BstNode four = new A5_BstNode(4);
        A5_BstNode six = new A5_BstNode(6);
        A5_BstNode seven = new A5_BstNode(7);
        A5_BstNode eight = new A5_BstNode(8);
        A5_BstNode two = new A5_BstNode(2);

        root.left = three;
        root.right = seven;
        three.left = two;
        three.right = four;
        seven.left = six;
        seven.right = eight;

        A5_BstNode ans = flattenBST(root);
        printList(ans);
    }

    public static A5_BstNode flattenBST(A5_BstNode root) {

        A5_BstNode[] head = {null};
        helper(root, head);

        return head[0];
    }

    public static A5_BstNode helper(A5_BstNode root, A5_BstNode[] next) {

        if (root == null) {return null;}

        helper(root.right, next);

        root.right = next[0];
        next[0] = root;

        helper(root.left, next);

        root.left = null;

        return root;
    }

    public static void printList(A5_BstNode root) {

        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
        System.out.println();
    }

}

class A5_BstNode {
    int val;
    A5_BstNode left;
    A5_BstNode right;
    A5_BstNode() {}
    A5_BstNode(int val) { this.val = val; }
    A5_BstNode(int val, A5_BstNode left, A5_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}