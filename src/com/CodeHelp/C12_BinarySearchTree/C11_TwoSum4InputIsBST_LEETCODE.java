package com.CodeHelp.C12_BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class C11_TwoSum4InputIsBST_LEETCODE {

    public static void main(String[] args) {

        C11_BstNode root = new C11_BstNode(5);
        C11_BstNode two = new C11_BstNode(2);
        C11_BstNode three = new C11_BstNode(3);
        C11_BstNode four = new C11_BstNode(4);
        C11_BstNode six = new C11_BstNode(6);
        C11_BstNode seven = new C11_BstNode(7);

        root.left = three;
        root.right = six;
        three.left = two;
        three.right = four;
        six.left = seven;

        System.out.println(findTarget(root,9));


    }

    public static boolean findTarget(C11_BstNode root, int k) {

        List<Integer> inOrder = new ArrayList<>();
        inOrderStore(root, inOrder);

        int start = 0;
        int end = inOrder.size() -1;

        while (start < end) {

            int sum = inOrder.get(start) + inOrder.get(end);

            if (sum == k) {
                return true;
            }
            else if (sum < k) {
                start++;
            }else{
                end--;
            }

        }
        return false;
    }

    public static void inOrderStore(C11_BstNode root, List<Integer> inOrder) {

        if (root == null) {return;}

        inOrderStore(root.left, inOrder);
        inOrder.add(root.val);
        inOrderStore(root.right, inOrder);
    }

}

class C11_BstNode {
    int val;
    C11_BstNode left;
    C11_BstNode right;
    C11_BstNode() {}
    C11_BstNode(int val) { this.val = val; }
    C11_BstNode(int val, C11_BstNode left, C11_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}