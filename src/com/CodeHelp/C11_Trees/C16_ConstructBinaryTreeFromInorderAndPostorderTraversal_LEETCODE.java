package com.CodeHelp.C11_Trees;

import java.util.*;

/*
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
 */
public class C16_ConstructBinaryTreeFromInorderAndPostorderTraversal_LEETCODE {

    public static void main(String[] args) {

        C16_TreeNode root = new C16_TreeNode(3);
        C16_TreeNode nine = new C16_TreeNode(9);
        C16_TreeNode twenty = new C16_TreeNode(20);
        C16_TreeNode fifteen  = new C16_TreeNode(15);
        C16_TreeNode seven = new C16_TreeNode(7);

        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        int[] inorder = {9,3,15,20,7};
        int[] postOrder = {9,15,7,20,3};

        List<List<Integer>> prev = bfsTraversal(root);
        printList(prev);

        C16_TreeNode ans = buildTree(inorder, postOrder);

        List<List<Integer>> post = bfsTraversal(ans);
        printList(post);

    }

    public static C16_TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer,Integer> inOrderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }

        int[] postOrderIndex = new int[1];
        postOrderIndex[0] = postorder.length-1;

        return helper(postorder,postOrderIndex,inOrderMap,0,inorder.length-1);

    }

    public static C16_TreeNode helper(int[] postorder, int[] postOrderIndex, HashMap<Integer,Integer> inOrderMap, int inOrderStart, int inOrderEnd) {

        if (inOrderStart > inOrderEnd) {
            return null;
        }

        int element = postorder[postOrderIndex[0]];
        postOrderIndex[0]--;

        C16_TreeNode root = new C16_TreeNode(element);

        int pos = inOrderMap.get(element);

        root.right = helper(postorder,postOrderIndex, inOrderMap,pos+1,inOrderEnd);
        root.left = helper(postorder,postOrderIndex,inOrderMap,inOrderStart,pos-1);

        return root;

    }

    public static List<List<Integer>> bfsTraversal(C16_TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<C16_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                C16_TreeNode temp = queue.poll();
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

    public static void printList(List<List<Integer>> ans) {

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        System.out.println();

    }

}

class C16_TreeNode {
    int val;
    C16_TreeNode left;
    C16_TreeNode right;
    C16_TreeNode() {}
    C16_TreeNode(int val) { this.val = val; }
    C16_TreeNode(int val, C16_TreeNode left, C16_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}