package com.CodeHelp.C13_Heap;

import java.util.ArrayList;
import java.util.List;

public class C9_BstToMaxHeap {

    public static void main(String[] args) {

    }

    public static void convertToMaxHeapUtil(C9_HeapNode root)
    {
        List<Integer> inOrder = new ArrayList<>();
        inOrderTraversal(root,inOrder);

        helper(root,inOrder, new int[]{0});

    }

    public static void helper(C9_HeapNode root, List<Integer> inOrder, int[] index){

        if (root == null || index[0]==inOrder.size())return;

        helper(root.left,inOrder,index);
        helper(root.right,inOrder,index);

        int element = inOrder.get(index[0]);
        index[0]++;
        root.data = element;
    }

    public static void inOrderTraversal(C9_HeapNode root, List<Integer> ans){

        if (root == null)return;

        inOrderTraversal(root.left, ans);
        ans.add(root.data);
        inOrderTraversal(root.right, ans);
    }
}

class C9_HeapNode{
    int data;
    C9_HeapNode left,right;
    C9_HeapNode(int d){
        data=d;
        left=right=null;
    }
}