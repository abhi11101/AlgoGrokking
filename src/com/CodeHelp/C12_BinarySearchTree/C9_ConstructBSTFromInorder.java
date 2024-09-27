package com.CodeHelp.C12_BinarySearchTree;

import java.util.*;

public class C9_ConstructBSTFromInorder {

    public static void main(String[] args) {

        int[] inorder = {1,4,6,10,14,24,45,67,88};
        C9_BstNode ans = constructTree(inorder, 0, inorder.length - 1);
        levelOrder(ans);
    }
    
    public static C9_BstNode constructTree(int[] inorder, int start, int end) {

        if (start>end)return null;

        int mid = (start + end)/2;

        int element = inorder[mid];
        C9_BstNode root = new C9_BstNode(element);

        root.left = constructTree(inorder, start, mid-1);
        root.right = constructTree(inorder, mid+1, end);

        return root;
    }
    public static void levelOrder(C9_BstNode root) {

        Queue<C9_BstNode> queue = new LinkedList<C9_BstNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                C9_BstNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(list);
        }
        System.out.println(ans);
    }
    
}

class C9_BstNode {
    int val;
    C9_BstNode left;
    C9_BstNode right;
    C9_BstNode() {}
    C9_BstNode(int val) { this.val = val; }
    C9_BstNode(int val, C9_BstNode left, C9_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}