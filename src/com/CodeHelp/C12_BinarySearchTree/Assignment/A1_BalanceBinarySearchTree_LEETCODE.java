package com.CodeHelp.C12_BinarySearchTree.Assignment;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/balance-a-binary-search-tree/description/
 */
public class A1_BalanceBinarySearchTree_LEETCODE {

    public static void main(String[] args) {



    }

    public static A1_BstNode balanceBST(A1_BstNode root) {

        List<Integer> inOrder = new ArrayList<>();
        findInorder(root, inOrder);

        return buildTree(inOrder,0, inOrder.size()-1);

    }

    public static A1_BstNode buildTree(List<Integer> inOrder, int start, int end) {

        if (start > end) return null;

        int mid = (start + end)/2;

        int element = inOrder.get(mid);

        A1_BstNode root = new A1_BstNode(element);

        root.left = buildTree(inOrder, start, mid-1);
        root.right = buildTree(inOrder, mid+1, end);

        return root;
    }

    public static void findInorder(A1_BstNode root, List<Integer> inOrder) {

        if (root == null) {return;}

        findInorder(root.left, inOrder);
        inOrder.add(root.val);
        findInorder(root.right, inOrder);

    }

}


class A1_BstNode {
    int val;
    A1_BstNode left;
    A1_BstNode right;
    A1_BstNode() {}
    A1_BstNode(int val) { this.val = val; }
    A1_BstNode(int val, A1_BstNode left, A1_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}