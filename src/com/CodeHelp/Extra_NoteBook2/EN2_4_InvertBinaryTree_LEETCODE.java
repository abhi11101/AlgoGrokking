package com.CodeHelp.Extra_NoteBook2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
https://leetcode.com/problems/invert-binary-tree/
 */
public class EN2_4_InvertBinaryTree_LEETCODE {

    public static void main(String[] args) {

        EN2_4_TreeNode root1 = new EN2_4_TreeNode(4);
        EN2_4_TreeNode second1 = new EN2_4_TreeNode(2);
        EN2_4_TreeNode second2 = new EN2_4_TreeNode(7);

        root1.left = second1;
        root1.right = second2;

        EN2_4_TreeNode third1 = new EN2_4_TreeNode(1);
        EN2_4_TreeNode third2 = new EN2_4_TreeNode(3);
        EN2_4_TreeNode third3 = new EN2_4_TreeNode(6);
        EN2_4_TreeNode third4 = new EN2_4_TreeNode(9);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;
        second2.right = third4;

        List<List<Integer>> list1 = treeBFSTraversal(root1);
        printList(list1);

        EN2_4_TreeNode ans = invertTree(root1);

        List<List<Integer>> list2 = treeBFSTraversal(ans);
        printList(list2);
    }

    public static EN2_4_TreeNode invertTree(EN2_4_TreeNode root) {

        if(root==null)return root;

        EN2_4_TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }

    public static List<List<Integer>> treeBFSTraversal(EN2_4_TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<EN2_4_TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                EN2_4_TreeNode temp = queue.poll();
                list.add(temp.val);

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

    public static void printList(List<List<Integer>> list) {

        for (List<Integer> list1 : list) {

            System.out.println(list1);

        }
        System.out.println();
    }

}

class EN2_4_TreeNode {
    int val;
    EN2_4_TreeNode left;
    EN2_4_TreeNode right;
    EN2_4_TreeNode() {}
    EN2_4_TreeNode(int val) { this.val = val; }
    EN2_4_TreeNode(int val, EN2_4_TreeNode left, EN2_4_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
