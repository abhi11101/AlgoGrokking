package com.CodeHelp.Extra_NoteBook2;

import java.util.*;

/*
https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 */
public class EN2_7_BinaryTreeLevelOrderTraversal2I_LEETCODE {

    public static void main(String[] args) {

        EN2_7_TreeNode root = new EN2_7_TreeNode(3);
        EN2_7_TreeNode nine = new EN2_7_TreeNode(9);
        EN2_7_TreeNode twenty = new EN2_7_TreeNode(20);
        EN2_7_TreeNode fifteen  = new EN2_7_TreeNode(15);
        EN2_7_TreeNode seven = new EN2_7_TreeNode(7);

        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        List<List<Integer>> ans = levelOrderBottom(root);

        System.out.println(ans);

    }

    public static List<List<Integer>> levelOrderBottom(EN2_7_TreeNode root) {

        Queue<EN2_7_TreeNode> queue = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                EN2_7_TreeNode temp = queue.poll();

                list.add(temp.val);

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }

            }

            stack.push(list);

        }

        List<List<Integer>> ans  = new ArrayList<>();

        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }

        return ans;
    }

}

class EN2_7_TreeNode {
    int val;
    EN2_7_TreeNode left;
    EN2_7_TreeNode right;
    EN2_7_TreeNode() {}
    EN2_7_TreeNode(int val) { this.val = val; }
    EN2_7_TreeNode(int val, EN2_7_TreeNode left, EN2_7_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}