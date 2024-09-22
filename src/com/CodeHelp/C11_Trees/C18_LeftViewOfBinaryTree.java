package com.CodeHelp.C11_Trees;


import java.util.ArrayList;
import java.util.List;

public class C18_LeftViewOfBinaryTree {

    public static void main(String[] args) {

        C18_TreeNode root = new C18_TreeNode(10);
        C18_TreeNode twenty = new C18_TreeNode(20);
        C18_TreeNode thirty = new C18_TreeNode(30);
        C18_TreeNode forty = new C18_TreeNode(40);
        C18_TreeNode fifty = new C18_TreeNode(50);
        C18_TreeNode sixty = new C18_TreeNode(60);
        C18_TreeNode seventy = new C18_TreeNode(70);
        C18_TreeNode eighty = new C18_TreeNode(80);
        C18_TreeNode ninety = new C18_TreeNode(90);

        root.left = twenty;
        root.right = eighty;

        twenty.left = thirty;
        twenty.right = forty;

        eighty.left = fifty;
        eighty.right = ninety;

        forty.left = sixty;
        fifty.right = seventy;

        List<Integer> ans = leftView(root);
        System.out.println(ans);

    }

    public static List<Integer> leftView(C18_TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();

        helper(root,0,ans);

        return ans;
    }

    public static void helper(C18_TreeNode root, int level, List<Integer> ans){

        if (root == null)return;

        if (level==ans.size()){
            ans.add(root.val);
        }

        helper(root.left,level+1,ans);
        helper(root.right,level+1,ans);

    }

}

class C18_TreeNode {
    int val;
    C18_TreeNode left;
    C18_TreeNode right;
    C18_TreeNode() {}
    C18_TreeNode(int val) { this.val = val; }
    C18_TreeNode(int val, C18_TreeNode left, C18_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}