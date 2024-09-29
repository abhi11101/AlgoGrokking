package com.CodeHelp.Extra_NoteBook2;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/
 */
public class EN2_8_MinimumAbsoluteDifferenceInBST_LEETCODE {

    public static void main(String[] args) {

        EN2_8_TreeNode root = new EN2_8_TreeNode(4);
        root.left = new EN2_8_TreeNode(2);
        root.left.left = new EN2_8_TreeNode(1);
        root.left.right = new EN2_8_TreeNode(3);
        root.right = new EN2_8_TreeNode(6);

        System.out.println(getMinimumDifference(root));
        System.out.println(fasterWay(root));

    }


    public static int fasterWay(EN2_8_TreeNode root) {

        EN2_8_TreeNode[] prev = {null};

        int[] min = {Integer.MAX_VALUE};

        helperFaster(root,prev,min);

        return min[0];
    }

    public static void helperFaster(EN2_8_TreeNode root, EN2_8_TreeNode[] prev, int[] min) {

        if (root == null) {return;}

        helperFaster(root.left, prev, min);

        if (prev[0]!=null){

            int diff = Math.abs(root.val - prev[0].val);
            if (diff < min[0]) {
                min[0] = diff;
            }
        }

        prev[0] = root;

        helperFaster(root.right, prev, min);
    }

    public static int getMinimumDifference(EN2_8_TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        helper(root,inOrder);

        int min = Integer.MAX_VALUE;
        for(int i =1 ; i<inOrder.size();i++){

            int diff = inOrder.get(i) - inOrder.get(i-1);
            if(diff<min) min = diff;
        }
        return min;
    }

    public static void helper(EN2_8_TreeNode root, List<Integer> inOrder){

        if(root == null) return;

        helper(root.left,inOrder);
        inOrder.add(root.val);
        helper(root.right, inOrder);
    }

}

class EN2_8_TreeNode {
    int val;
    EN2_8_TreeNode left;
    EN2_8_TreeNode right;
    EN2_8_TreeNode() {}
    EN2_8_TreeNode(int val) { this.val = val; }
    EN2_8_TreeNode(int val, EN2_8_TreeNode left, EN2_8_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
