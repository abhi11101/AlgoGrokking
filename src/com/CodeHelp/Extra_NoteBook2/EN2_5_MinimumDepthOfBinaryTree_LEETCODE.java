package com.CodeHelp.Extra_NoteBook2;

/*
https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class EN2_5_MinimumDepthOfBinaryTree_LEETCODE {

    public static void main(String[] args) {

        EN2_5_TreeNode root = new EN2_5_TreeNode(3);
        root.left = new EN2_5_TreeNode(9);
        root.right = new EN2_5_TreeNode(20);
        root.right.left = new EN2_5_TreeNode(15);
        root.right.right = new EN2_5_TreeNode(7);


        System.out.println(minDepth(root));

    }

    public static int minDepth(EN2_5_TreeNode root) {

        if(root==null){
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left==0 && right ==0)return 1;

        else if(left==0 && right!=0)return right+1;
        else if(left!=0 && right==0)return left+1;

        else{
            return Math.min(left,right)+1;
        }
    }

}

class EN2_5_TreeNode {
    int val;
    EN2_5_TreeNode left;
    EN2_5_TreeNode right;
    EN2_5_TreeNode() {}
    EN2_5_TreeNode(int val) { this.val = val; }
    EN2_5_TreeNode(int val, EN2_5_TreeNode left, EN2_5_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}