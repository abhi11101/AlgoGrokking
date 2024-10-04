package com.CodeHelp.C13_Heap;

public class C8_IsBinaryTreeHeap {

    public static void main(String[] args) {

        C8_HeapNode root = new C8_HeapNode(100);
        root.left = new C8_HeapNode(90);
        root.right = new C8_HeapNode(80);
        root.left.left = new C8_HeapNode(10);
        root.left.right = new C8_HeapNode(20);
        root.right.left = new C8_HeapNode(50);
        root.right.right = new C8_HeapNode(60);
        root.left.left.left = new C8_HeapNode(1);
        root.left.left.right = new C8_HeapNode(4);

        System.out.println(isHeap(root));

        C8_HeapNode root2 = new C8_HeapNode(5);
        root2.left = new C8_HeapNode(2);
        root2.right = new C8_HeapNode(3);
        System.out.println(isHeap(root2));
    }

    public static boolean isHeap(C8_HeapNode tree) {

        int[] ans = helper(tree);

        if (ans[0]==1)return true;
        return false;
    }

    public static int[] helper(C8_HeapNode root) {

        if (root == null) {
            return new int[]{1,Integer.MIN_VALUE};
        }

        int[] left = helper(root.left);
        int[] right = helper(root.right);


        int isHeap;

        int leftdata = left[1];
        int rightdata = right[1];

        if (root.data >leftdata && root.data >rightdata && left[0] == 1 && right[0] == 1) {

            isHeap = 1;
        }else{
            isHeap = 0;
        }

        int[] ans = {isHeap,root.data};

        return ans;
    }
}

class C8_HeapNode{
    int data;
    C8_HeapNode left,right;
    C8_HeapNode(int d){
        data =d;
        left=right=null;
    }
}