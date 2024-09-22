package com.CodeHelp.C11_Trees;

import java.util.*;

/*
https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class C15_ConstructBinaryTreeFromPreorderAndInorderTraversal_LEETCODE {

    public static void main(String[] args) {

        C15_TreeNode root = new C15_TreeNode(3);
        C15_TreeNode nine = new C15_TreeNode(9);
        C15_TreeNode twenty = new C15_TreeNode(20);
        C15_TreeNode fifteen  = new C15_TreeNode(15);
        C15_TreeNode seven = new C15_TreeNode(7);

        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        int[] inorder = {9,3,15,20,7};
        int[] preorder = {3,9,20,15,7};

        List<List<Integer>> prev = bfsTraversal(root);
        printList(prev);

        C15_TreeNode ans = buildTreeFaster(preorder, inorder);

        List<List<Integer>> post = bfsTraversal(ans);
        printList(post);

    }

    public static C15_TreeNode buildTreeFaster(int[] preorder, int[] inorder) {

        HashMap<Integer,Integer> inOrderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }

        int[] preOrderIndex = new int[1];
        preOrderIndex[0] = 0;
        return helperFaster(preorder,preOrderIndex,inOrderMap,0,inorder.length-1);

    }

    public static C15_TreeNode helperFaster(int[] preorder, int[] preOrderIndex, HashMap<Integer,Integer> inOrderMap, int inOrderStart, int inOrderEnd) {

        if (inOrderStart > inOrderEnd) {
            return null;
        }

        int element = preorder[preOrderIndex[0]];
        preOrderIndex[0]++;

        C15_TreeNode root = new C15_TreeNode(element);

        int pos = inOrderMap.get(element);

        root.left = helperFaster(preorder,preOrderIndex,inOrderMap,inOrderStart,pos - 1);
        root.right = helperFaster(preorder,preOrderIndex,inOrderMap,pos+1,inOrderEnd);

        return root;


    }

    public static C15_TreeNode buildTree(int[] preorder, int[] inorder) {

        int[] preIndex = new int[1];
        preIndex[0]=0;
        return helper(preorder,inorder,preIndex,0,inorder.length-1);

    }

    public static C15_TreeNode helper(int[] preorder, int[] inorder, int[] preIndex, int inOrderStart, int inOrderEnd) {

        if (preIndex[0] == preorder.length || inOrderStart>inOrderEnd) {
            return null;
        }

        int element = preorder[preIndex[0]];
        preIndex[0]++;
        C15_TreeNode root = new C15_TreeNode(element);

        int pos = findPosition(inorder,element);

        root.left = helper(preorder,inorder,preIndex,inOrderStart,pos-1);
        root.right = helper(preorder,inorder,preIndex,pos+1,inOrderEnd);


        return root;

    }

    public static int findPosition(int[] inorder, int target) {

        for (int i = 0; i < inorder.length; i++) {

            if (inorder[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static List<List<Integer>> bfsTraversal(C15_TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<C15_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                C15_TreeNode temp = queue.poll();
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

class C15_TreeNode {
    int val;
    C15_TreeNode left;
    C15_TreeNode right;
    C15_TreeNode() {}
    C15_TreeNode(int val) { this.val = val; }
    C15_TreeNode(int val, C15_TreeNode left, C15_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}