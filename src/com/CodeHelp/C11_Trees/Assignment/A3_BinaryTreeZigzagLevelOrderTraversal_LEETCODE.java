package com.CodeHelp.C11_Trees.Assignment;

import java.util.*;

/*
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class A3_BinaryTreeZigzagLevelOrderTraversal_LEETCODE {

    public static void main(String[] args) {

        A3_TreeNode root = new A3_TreeNode(3);
        A3_TreeNode nine = new A3_TreeNode(9);
        A3_TreeNode twenty = new A3_TreeNode(20);
        A3_TreeNode fifteen  = new A3_TreeNode(15);
        A3_TreeNode seven = new A3_TreeNode(7);

        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        List<List<Integer>> ans = zigzagLevelOrder(root);

        System.out.println(ans);
    }

    public static List<List<Integer>> zigzagLevelOrder(A3_TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if (root==null)return ans;

        boolean leftToRight = true;
        Queue<A3_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            Integer[] level =  new Integer[size];

            for (int i = 0; i < size; i++) {

                A3_TreeNode temp = queue.poll();

                int index = leftToRight ? i : size-i-1;

                level[index] = temp.val;

                if (temp.left!=null) queue.add(temp.left);
                if (temp.right!=null) queue.add(temp.right);

            }

            leftToRight = !leftToRight;
            List<Integer> list = Arrays.asList(level);
            ans.add(list);

            System.out.println(ans);
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

class A3_TreeNode {
    int val;
    A3_TreeNode left;
    A3_TreeNode right;
    A3_TreeNode() {}
    A3_TreeNode(int val) { this.val = val; }
    A3_TreeNode(int val, A3_TreeNode left, A3_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}