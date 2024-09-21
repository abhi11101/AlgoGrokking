package com.CodeHelp.C11_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C10_ConvertToSumTree {

    public static void main(String[] args) {

        C10_TreeNode root = new C10_TreeNode(3);
        root.left = new C10_TreeNode(1);
        root.right = new C10_TreeNode(2);

        List<List<Integer>> list1 = bfsTraversal(root);

        printList(list1);

        C10_TreeNode ans = convertToSumTree(root);

        List<List<Integer>> list2 = bfsTraversal(ans);
        printList(list2);

    }

    public static C10_TreeNode convertToSumTree(C10_TreeNode root) {
        if (root == null) {return root;}

        findSum(root);

        return root;
    }

    public static int findSum(C10_TreeNode root) {

        if (root == null)return 0;

        int left = findSum(root.left);
        int right = findSum(root.right);

        root.val = root.val + left + right;

        return root.val;

    }

    public static List<List<Integer>> bfsTraversal(C10_TreeNode root) {

        List<List<Integer>> ans  = new ArrayList<>();
        Queue<C10_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                C10_TreeNode cur = queue.poll();
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

class C10_TreeNode {
    int val;
    C10_TreeNode left;
    C10_TreeNode right;
    C10_TreeNode() {}
    C10_TreeNode(int val) { this.val = val; }
    C10_TreeNode(int val, C10_TreeNode left, C10_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
