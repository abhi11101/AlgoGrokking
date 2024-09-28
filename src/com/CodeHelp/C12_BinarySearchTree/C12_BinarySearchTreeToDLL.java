package com.CodeHelp.C12_BinarySearchTree;

public class C12_BinarySearchTreeToDLL {

    public static void main(String[] args) {

        C12_BstNode root = new C12_BstNode(5);
        C12_BstNode one = new C12_BstNode(1);
        C12_BstNode two = new C12_BstNode(2);
        C12_BstNode three = new C12_BstNode(3);
        C12_BstNode six = new C12_BstNode(6);
        C12_BstNode seven = new C12_BstNode(7);
        C12_BstNode eight = new C12_BstNode(8);

        root.left = two;
        root.right = seven;
        two.left = one;
        two.right = three;
        seven.left = six;
        seven.right = eight;

        convertToDLL(root);
    }

    public static void convertToDLL(C12_BstNode root) {

        C12_BstNode[] head = {null};

       // helper(root, head);

        helperLtoR(root,head, new C12_BstNode[]{null});
        printDLL(head[0]);
    }


    public static void helper(C12_BstNode root, C12_BstNode[] head) {

        if (root == null) {
            return ;
        }

        helper(root.right, head);

        root.right = head[0];

        if(head[0]!=null){
            head[0].left = root;
        }

        head[0] = root;

        helper(root.left, head);

    }

    public static void helperLtoR(C12_BstNode root, C12_BstNode[] head, C12_BstNode[] prev) {

        if (root == null) {
            return;
        }

        helperLtoR(root.left, head, prev);
        if (head[0] == null) {
            head[0] = root;
        }

        root.left = prev[0];
        if (prev[0] != null) {
            prev[0].right = root;
        }

        prev[0] = root;

        helperLtoR(root.right, head, prev);

    }

    public static void printDLL(C12_BstNode root) {

        C12_BstNode curr = root;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
        System.out.println();
    }
}

class C12_BstNode {
    int val;
    C12_BstNode left;
    C12_BstNode right;
    C12_BstNode() {}
    C12_BstNode(int val) { this.val = val; }
    C12_BstNode(int val, C12_BstNode left, C12_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}