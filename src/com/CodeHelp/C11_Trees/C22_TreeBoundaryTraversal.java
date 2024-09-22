package com.CodeHelp.C11_Trees;

import java.util.ArrayList;
import java.util.List;

public class C22_TreeBoundaryTraversal {

    public static void main(String[] args) {

        C22_TreeNode root = new C22_TreeNode(1);
        C22_TreeNode two = new C22_TreeNode(2);
        C22_TreeNode three = new C22_TreeNode(3);
        C22_TreeNode four = new C22_TreeNode(4);
        C22_TreeNode five = new C22_TreeNode(5);
        C22_TreeNode six = new C22_TreeNode(6);
        C22_TreeNode seven = new C22_TreeNode(7);
        C22_TreeNode eight = new C22_TreeNode(8);
        C22_TreeNode nine = new C22_TreeNode(9);

        root.left = two;
        root.right = three;

        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;

        five.left = eight;
        five.right = nine;

        List<Integer> ans = boundary(root);

        System.out.println(ans);

    }

    public static List<Integer> boundary(C22_TreeNode node)
    {
        List<Integer> ans = new ArrayList<Integer>();

        if (node == null)return ans;

        ans.add(node.val);

        if(node.left==null && node.right==null){
            return ans;
        }

        printLeftBoundary(node.left, ans);

        printLeafBoundary(node,ans);

        printRightBoundary(node.right,ans);

        return ans;

    }

    public static void printLeftBoundary(C22_TreeNode node, List<Integer> ans){

        if (node==null)return;

        if (node.left==null && node.right==null)return;

        ans.add(node.val);

        if (node.left!=null){
            printLeftBoundary(node.left,ans);
        }else{
            printLeftBoundary(node.right,ans);
        }

    }

    public static void printLeafBoundary(C22_TreeNode node, List<Integer> ans){

        if (node==null)return;

        if (node.left==null && node.right==null){
            ans.add(node.val);
            return;
        }

        printLeafBoundary(node.left,ans);
        printLeafBoundary(node.right,ans);
    }

    public static void printRightBoundary(C22_TreeNode node, List<Integer> ans){

        if (node==null)return;

        if (node.left==null && node.right==null)return;

        if (node.right!=null){
            printRightBoundary(node.right,ans);
        }else{
            printRightBoundary(node.left,ans);
        }

        ans.add(node.val);
    }

}

class C22_TreeNode {
    int val;
    C22_TreeNode left;
    C22_TreeNode right;
    C22_TreeNode() {}
    C22_TreeNode(int val) { this.val = val; }
    C22_TreeNode(int val, C22_TreeNode left, C22_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}