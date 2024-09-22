package com.CodeHelp.C11_Trees;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/binary-tree-right-side-view/description/
 */
public class C19_BinaryTreeRightSideView_LEETCODE {

    public static void main(String[] args) {

        C19_TreeNode root = new C19_TreeNode(10);
        C19_TreeNode twenty = new C19_TreeNode(20);
        C19_TreeNode thirty = new C19_TreeNode(30);
        C19_TreeNode forty = new C19_TreeNode(40);
        C19_TreeNode fifty = new C19_TreeNode(50);
        C19_TreeNode sixty = new C19_TreeNode(60);
        C19_TreeNode seventy = new C19_TreeNode(70);
        C19_TreeNode eighty = new C19_TreeNode(80);
        C19_TreeNode ninety = new C19_TreeNode(90);

        root.left = twenty;
        root.right = eighty;

        twenty.left = thirty;
        twenty.right = forty;

        eighty.left = fifty;
        eighty.right = ninety;

        forty.left = sixty;
        fifty.right = seventy;

        List<Integer> ans = rightSideView(root);
        System.out.println(ans);

    }

    public static List<Integer> rightSideView(C19_TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        helper(root,0,ans);

        return ans;

    }

    public static void helper(C19_TreeNode root, int level, List<Integer> ans) {

        if (root == null) {
            return;
        }

        if (level==ans.size()) {
            ans.add(root.val);
        }

        helper(root.right,level+1,ans);
        helper(root.left,level+1,ans);

    }

}

class C19_TreeNode {
    int val;
    C19_TreeNode left;
    C19_TreeNode right;
    C19_TreeNode() {}
    C19_TreeNode(int val) { this.val = val; }
    C19_TreeNode(int val, C19_TreeNode left, C19_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
