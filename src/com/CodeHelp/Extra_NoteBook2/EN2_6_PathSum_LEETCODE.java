package com.CodeHelp.Extra_NoteBook2;

/*
https://leetcode.com/problems/path-sum/
 */
public class EN2_6_PathSum_LEETCODE {

    public static void main(String[] args) {

        EN2_6_TreeNode root = new EN2_6_TreeNode(5);
        EN2_6_TreeNode four  = new EN2_6_TreeNode(4);
        EN2_6_TreeNode eight = new EN2_6_TreeNode(8);
        EN2_6_TreeNode eleven = new EN2_6_TreeNode(11);
        EN2_6_TreeNode thirteen  = new EN2_6_TreeNode(13);
        EN2_6_TreeNode four2  = new EN2_6_TreeNode(4);
        EN2_6_TreeNode seven = new EN2_6_TreeNode(7);
        EN2_6_TreeNode two = new EN2_6_TreeNode(2);
        EN2_6_TreeNode one  = new EN2_6_TreeNode(1);


        root.left = four;
        root.right = eight;

        four.left = eleven;
        eleven.left = seven;
        eleven.right = two;

        eight.left = thirteen;
        eight.right = four;
        four2.right = one;

        System.out.println(hasPathSum(root, 22));



    }

    public static boolean hasPathSum(EN2_6_TreeNode root, int targetSum) {


        return helper(root,0,targetSum);

    }

    public static boolean helper(EN2_6_TreeNode root, int currentSum, int targetSum) {

        if (root == null)return false;

        currentSum+=root.val;

        if (root.left==null && root.right==null){
            return targetSum==currentSum;
        }

        boolean left = helper(root.left, currentSum, targetSum);
        boolean right = helper(root.right, currentSum, targetSum);

        return left || right;
    }

}

class EN2_6_TreeNode {
    int val;
    EN2_6_TreeNode left;
    EN2_6_TreeNode right;
    EN2_6_TreeNode() {}
    EN2_6_TreeNode(int val) { this.val = val; }
    EN2_6_TreeNode(int val, EN2_6_TreeNode left, EN2_6_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}