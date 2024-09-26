package com.CodeHelp.C11_Trees.Assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A4_TransformToSumTree {

    public static void main(String[] args) {

        A4_TreeNode root = new A4_TreeNode(10);
        A4_TreeNode minusTwo = new A4_TreeNode(-2);
        A4_TreeNode six = new A4_TreeNode(6);
        A4_TreeNode eight = new A4_TreeNode(8);
        A4_TreeNode minusFour  = new A4_TreeNode(-4);
        A4_TreeNode seven = new A4_TreeNode(7);
        A4_TreeNode five  = new A4_TreeNode(5);

        root.left = minusTwo;
        root.right = six;

        minusTwo.left = eight;
        minusTwo.right = minusFour;
        six.left = seven;
        six.right = five;

        List<List<Integer>> list1 = bfsTraversal(root);

        printList(list1);

        toSumTree(root);

        List<List<Integer>> list2 = bfsTraversal(root);
        printList(list2);
    }

    public static void toSumTree(A4_TreeNode root){

        findSum(root);

    }

    public static int findSum(A4_TreeNode root){

        if (root == null) return 0 ;

        if (root.left == null && root.right == null){

            int temp = root.val;
            root.val = 0;
            return temp;
        }

        int left = findSum(root.left);
        int right = findSum(root.right);

        int sum = left + right + root.val;
        root.val = left + right;

        return sum;
    }

    public static List<List<Integer>> bfsTraversal(A4_TreeNode root) {

        List<List<Integer>> ans  = new ArrayList<>();
        Queue<A4_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                A4_TreeNode cur = queue.poll();
                list.add(cur.val);

                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }

            ans.add(list);
        }
        return ans;
    }

    public static void printList(List<List<Integer>> ans) {

        for (List<Integer> list : ans) {

            System.out.println(list);
        }
        System.out.println();

    }
}

class A4_TreeNode {
    int val;
    A4_TreeNode left;
    A4_TreeNode right;
    A4_TreeNode() {}
    A4_TreeNode(int val) { this.val = val; }
    A4_TreeNode(int val, A4_TreeNode left, A4_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}