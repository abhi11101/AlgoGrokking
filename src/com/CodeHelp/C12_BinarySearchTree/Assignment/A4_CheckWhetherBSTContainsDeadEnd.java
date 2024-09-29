package com.CodeHelp.C12_BinarySearchTree.Assignment;

public class A4_CheckWhetherBSTContainsDeadEnd {

    public static void main(String[] args) {

        A4_BstNode root = new A4_BstNode(8);
        A4_BstNode five = new A4_BstNode(5);
        A4_BstNode nine = new A4_BstNode(9);
        A4_BstNode two = new A4_BstNode(2);
        A4_BstNode seven = new A4_BstNode(7);
        A4_BstNode one = new A4_BstNode(1);

        root.left = five;
        root.right = nine;
        five.left = two;
        five.right = seven;
        two.left = one;

        System.out.println(isDeadEnd(root));
    }

    public static boolean isDeadEnd(A4_BstNode root)
    {
         return helper(root,0,Integer.MAX_VALUE);
    }

    public static boolean helper(A4_BstNode root, int lowerBound , int upperBound){

        if (root == null)return false;

        boolean left = helper(root.left, lowerBound, root.val);

        if (root.left==null && root.right==null){

            return Math.abs(lowerBound-root.val)==1 && Math.abs(upperBound-root.val)==1;

        }

        boolean right = helper(root.right,root.val,upperBound);

        return left || right;
    }

}

class A4_BstNode {
    int val;
    A4_BstNode left;
    A4_BstNode right;
    A4_BstNode() {}
    A4_BstNode(int val) { this.val = val; }
    A4_BstNode(int val, A4_BstNode left, A4_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}