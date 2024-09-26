package com.CodeHelp.C11_Trees.Assignment;

/*
https://leetcode.com/problems/path-sum-iii/description/
 */
public class A5_PathSum3_LEETCODE {

    public static void main(String[] args) {

        A5_TreeNode root = new A5_TreeNode(10);
        A5_TreeNode five = new A5_TreeNode(5);
        A5_TreeNode minusThree = new A5_TreeNode(-3);
        A5_TreeNode three = new A5_TreeNode(3);
        A5_TreeNode two = new A5_TreeNode(2);
        A5_TreeNode eleven = new A5_TreeNode(11);
        A5_TreeNode three2 = new A5_TreeNode(3);
        A5_TreeNode minusTwo = new A5_TreeNode(-2);
        A5_TreeNode one = new A5_TreeNode(1);

        root.left = five;
        root.right = minusThree;

        five.left = three;
        five.right = two;
        minusThree.right = eleven;

        three.left = three2;
        three.right = minusTwo;
        two.right = one;


        System.out.println(pathSum(root,8));

    }

    public static int pathSum(A5_TreeNode root, int targetSum) {
        int[] count = new int[1];
        count[0] = 0;

        // Start a new path from every node in the tree
        findPaths(root, targetSum, count);

        return count[0];
    }

    public static void findPaths(A5_TreeNode root, long targetSum, int[] count) {

        if (root == null) {
            return;
        }

        checkPath(root,targetSum,0L,count);

        findPaths(root.left,targetSum,count);
        findPaths(root.right,targetSum,count);

    }

    public static void checkPath(A5_TreeNode root, long targetSum, long currentSum, int[] count) {

        if (root == null) {
            return;
        }

        currentSum += root.val;

        if (currentSum==targetSum){
            count[0]++;
        }

        checkPath(root.left,targetSum,currentSum,count);
        checkPath(root.right,targetSum,currentSum,count);
    }

}

class A5_TreeNode {
    int val;
    A5_TreeNode left;
    A5_TreeNode right;
    A5_TreeNode() {}
    A5_TreeNode(int val) { this.val = val; }
    A5_TreeNode(int val, A5_TreeNode left, A5_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}