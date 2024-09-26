package com.CodeHelp.C11_Trees.Assignment;

public class A11_MaximumSumOfNonAdjacentNodes {

    public static void main(String[] args) {

        A11_TreeNode root  = new A11_TreeNode(1);
        A11_TreeNode two = new A11_TreeNode(2);
        A11_TreeNode three = new A11_TreeNode(3);
        A11_TreeNode four = new A11_TreeNode(4);
        A11_TreeNode five = new A11_TreeNode(5);
        A11_TreeNode one2 = new A11_TreeNode(1);

        root.left = two;
        root.right = three;
        two.left = one2;
        three.left = four;
        three.right = five;

        System.out.println(getMaxSum(root));
    }

    public static int getMaxSum(A11_TreeNode root)
    {
        int[] ans = getMax(root);

        return Math.max(ans[0], ans[1]);
    }

    public static int[] getMax(A11_TreeNode root){

        if (root == null){
            return new int[]{0,0};
        }

        int[] left = getMax(root.left);
        int[] right = getMax(root.right);

        int a = root.val + left[1] + right[1];

        int b = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);

        return new int[]{a,b};

    }

}

class A11_TreeNode {
    int val;
    A11_TreeNode left;
    A11_TreeNode right;
    A11_TreeNode() {}
    A11_TreeNode(int val) { this.val = val; }
    A11_TreeNode(int val, A11_TreeNode left, A11_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}