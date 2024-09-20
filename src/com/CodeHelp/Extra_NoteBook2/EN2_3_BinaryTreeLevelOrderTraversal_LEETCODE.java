package com.CodeHelp.Extra_NoteBook2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 */
public class EN2_3_BinaryTreeLevelOrderTraversal_LEETCODE {

    public static void main(String[] args) {


        En2_3_TreeNode root = new En2_3_TreeNode(10);
        En2_3_TreeNode second = new En2_3_TreeNode(60);
        En2_3_TreeNode second2 = new En2_3_TreeNode(30);

        root.left = second;
        root.right = second2;

        En2_3_TreeNode third = new En2_3_TreeNode(80);
        En2_3_TreeNode third2 = new En2_3_TreeNode(20);
        En2_3_TreeNode third3 = new En2_3_TreeNode(50);

        second.left = third;
        second.right = third2;
        second2.left = third3;

        En2_3_TreeNode fourth = new En2_3_TreeNode(70);
        En2_3_TreeNode fourth2 = new En2_3_TreeNode(40);

        third2.left = fourth;
        third2.right = fourth2;

        List<List<Integer>> ans = new ArrayList<>();

        levelOrderTraversal(root,ans);

        printList(ans);

        ans = levelOrderFaster(root);
        printList(ans);
    }

    public static List<List<Integer>> levelOrderFaster(En2_3_TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<En2_3_TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return ans;
        }

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                En2_3_TreeNode temp = queue.poll();

                list.add(temp.data);

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }

            }

            ans.add(list);
        }


        return ans;
    }

    public static void levelOrderTraversal(En2_3_TreeNode root, List<List<Integer>> ans) {

        Queue<En2_3_TreeNode> queue = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {

            En2_3_TreeNode node = queue.peek();

            queue.poll();

            if (node==null){

                ans.add(new ArrayList<>(level));
                level.clear();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
            else{
                level.add(node.data);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

        }
    }

    public static void printList(List<List<Integer>> ans){

        for (List<Integer> list : ans){
            System.out.println(list);
        }

    }

}

class En2_3_TreeNode{

    int data;
    En2_3_TreeNode left;
    En2_3_TreeNode right;

    En2_3_TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}