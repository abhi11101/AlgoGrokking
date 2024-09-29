package com.CodeHelp.C12_BinarySearchTree.Assignment;

import java.util.ArrayList;
import java.util.List;

public class A8_ReplaceEveryElementWithLeastGreaterElementOnItsRight {

    public static void main(String[] args) {

        int[] arr = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};

        ArrayList<Integer> ans = findLeastGreater(15,arr);
        System.out.println(ans);

        int[] arr2 = {2, 6, 9, 1, 3, 2};
        ArrayList<Integer> ans2 = findLeastGreater(6,arr2);
        System.out.println(ans2);

    }

    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {

        int[] succ = {-1};
        A8_BstNode root = null;
        int[] res = new int[n];
        for (int i = arr.length-1;i>=0;i--){

            succ[0] = -1;
            root = createTree(root,arr[i],succ);
            res[i] = succ[0];

        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(res[i]);
        }
        return ans;
    }

    public static A8_BstNode createTree(A8_BstNode root,int val,int[] succ){

        if (root==null){
            return new A8_BstNode(val);
        }

        if (val>=root.val){
            root.right = createTree(root.right,val,succ);
        }else{
            succ[0] = root.val;
            root.left = createTree(root.left,val,succ);
        }

        return root;

    }

}


class A8_BstNode {
    int val;
    A8_BstNode left;
    A8_BstNode right;
    A8_BstNode() {}
    A8_BstNode(int val) { this.val = val; }
    A8_BstNode(int val, A8_BstNode left, A8_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}