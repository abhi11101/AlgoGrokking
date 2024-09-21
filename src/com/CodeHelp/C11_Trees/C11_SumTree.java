package com.CodeHelp.C11_Trees;

public class C11_SumTree {

    public static void main(String[] args) {

        C11_TreeNode root = new C11_TreeNode(3);
        root.left = new C11_TreeNode(1);
        root.right = new C11_TreeNode(2);

        System.out.println(isSumTree(root));

    }

    public static boolean isSumTree(C11_TreeNode root) {

        boolean[] ans = new boolean[1];

        findSum(root, ans);

        return ans[0];

    }

    public static int findSum(C11_TreeNode root,boolean[] ans) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {return root.val;}
        int left = findSum(root.left,ans);
        int right = findSum(root.right,ans);

        ans[0] = root.val == left+right;

        return left + right + root.val;

    }

}

class C11_TreeNode {
    int val;
    C11_TreeNode left;
    C11_TreeNode right;
    C11_TreeNode() {}
    C11_TreeNode(int val) { this.val = val; }
    C11_TreeNode(int val, C11_TreeNode left, C11_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
