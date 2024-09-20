package com.CodeHelp.C11_Trees;

/*
https://leetcode.com/problems/same-tree/
 */
public class C7_SameTree_LEETCODE {

    public static void main(String[] args) {

        C7_TreeNode root1 = new C7_TreeNode(1);
        root1.left = new C7_TreeNode(2);
        root1.right = new C7_TreeNode(3);

        C7_TreeNode root2 = new C7_TreeNode(1);
        root2.left = new C7_TreeNode(2);
        root2.right = new C7_TreeNode(3);

        System.out.println(isSameTree(root1, root2));

    }

    public static boolean isSameTree(C7_TreeNode p, C7_TreeNode q) {

        if (p==null && q==null)return true;
        else if (p==null && q!=null)return false;
        else if (p!=null && q==null)return false;

        if (p.val!=q.val) return false;


        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);


    }

}

class C7_TreeNode {
    int val;
    C7_TreeNode left;
    C7_TreeNode right;
    C7_TreeNode() {}
    C7_TreeNode(int val) { this.val = val; }
    C7_TreeNode(int val, C7_TreeNode left, C7_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}