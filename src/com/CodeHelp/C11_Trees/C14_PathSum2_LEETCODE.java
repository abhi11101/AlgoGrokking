package com.CodeHelp.C11_Trees;


import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/path-sum-ii/
 */
public class C14_PathSum2_LEETCODE {

    public static void main(String[] args) {

        C14_TreeNode root = new C14_TreeNode(5);
        C14_TreeNode four  = new C14_TreeNode(4);
        C14_TreeNode eight = new C14_TreeNode(8);
        C14_TreeNode eleven = new C14_TreeNode(11);
        C14_TreeNode thirteen  = new C14_TreeNode(13);
        C14_TreeNode four2  = new C14_TreeNode(4);
        C14_TreeNode seven = new C14_TreeNode(7);
        C14_TreeNode two = new C14_TreeNode(2);
        C14_TreeNode five  = new C14_TreeNode(5);
        C14_TreeNode one  = new C14_TreeNode(1);


        root.left = four;
        root.right = eight;

        four.left = eleven;
        eleven.left = seven;
        eleven.right = two;

        eight.left = thirteen;
        eight.right = four2;
        four2.left = five;
        four2.right = one;

        List<List<Integer>> ans = pathSum(root,22);

        printList(ans);


    }

    public static List<List<Integer>> pathSum(C14_TreeNode root, int targetSum) {

        List<List<Integer>> res = new ArrayList<>();

        hasPathSum(root,targetSum,0,res,new ArrayList<>());

        return res;
    }

    public static void hasPathSum(C14_TreeNode root, int targetSum, int currentSum, List<List<Integer>> ans, List<Integer> curr) {

        if (root==null)return ;

        currentSum+=root.val;
        curr.add(root.val);

        if (root.left==null && root.right==null){

            if (currentSum==targetSum){
                ans.add(new ArrayList<>(curr));
                curr.removeLast();
                return ;
            }else{
                curr.removeLast();
                return ;
            }

        }

        hasPathSum(root.left,targetSum,currentSum,ans,curr);
        hasPathSum(root.right,targetSum,currentSum,ans,curr);

        curr.removeLast();

    }

    public static void printList(List<List<Integer>> list){

        for (List<Integer> l : list){

            System.out.println(l);
        }
        System.out.println();
    }
}

class C14_TreeNode {
    int val;
    C14_TreeNode left;
    C14_TreeNode right;
    C14_TreeNode() {}
    C14_TreeNode(int val) { this.val = val; }
    C14_TreeNode(int val, C14_TreeNode left, C14_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}