package com.CodeHelp.C11_Trees.Assignment;

/*
https://leetcode.com/problems/symmetric-tree/description/
 */
public class A1_SymmetricTree_LEETCODE {

    public static void main(String[] args) {

        A3_TreeNode root = new A3_TreeNode(1);
        A3_TreeNode two1 = new A3_TreeNode(2);
        A3_TreeNode two2 = new A3_TreeNode(2);
        A3_TreeNode three1 = new A3_TreeNode(3);
        A3_TreeNode three2 = new A3_TreeNode(3);
        A3_TreeNode four1 = new A3_TreeNode(4);
        A3_TreeNode four2 = new A3_TreeNode(4);

        root.left = two1;
        root.right = two2;

        two1.left = three1;
        two1.right = four1;
        two2.left = four2;
        two2.right = three2;

        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(A3_TreeNode root) {
        if(root.left==null && root.right==null)return true;

        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(A3_TreeNode p, A3_TreeNode q){

        if(p==null && q==null) return true;

        if(p!=null && q!=null){

            boolean same = p.val==q.val;

            return same && isMirror(p.left,q.right) && isMirror(p.right, q.left);
        }
        return false;
    }


}

class A1_TreeNode {
    int val;
    A3_TreeNode left;
    A3_TreeNode right;
    A1_TreeNode() {}
    A1_TreeNode(int val) { this.val = val; }
    A1_TreeNode(int val, A3_TreeNode left, A3_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}