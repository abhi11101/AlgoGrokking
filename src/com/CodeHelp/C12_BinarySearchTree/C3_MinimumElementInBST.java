package com.CodeHelp.C12_BinarySearchTree;

public class C3_MinimumElementInBST {

    public static void main(String[] args) {

        C3_BstNode root = new C3_BstNode(5);
        C3_BstNode four  = new C3_BstNode(4);
        C3_BstNode six  = new C3_BstNode(6);
        C3_BstNode three = new C3_BstNode(3);
        C3_BstNode seven  = new C3_BstNode(7);
        C3_BstNode one  = new C3_BstNode(1);

        root.left = four;
        root.right = six;
        four.left = three;
        six.right = seven;
        three.left = one;

        System.out.println(minValue(root));

    }

    public static int minValue(C3_BstNode root) {

        if (root == null)return -1;
        if (root.left == null)return root.val;

        C3_BstNode curr = root;
        int ans = -1;
        while (curr != null) {
            ans = curr.val;
            curr = curr.left;
        }

        return ans;
    }


}

class C3_BstNode {
    int val;
    C3_BstNode left;
    C3_BstNode right;
    C3_BstNode() {}
    C3_BstNode(int val) { this.val = val; }
    C3_BstNode(int val, C3_BstNode left, C3_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
