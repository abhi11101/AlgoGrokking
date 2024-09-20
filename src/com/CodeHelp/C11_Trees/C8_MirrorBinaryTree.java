package com.CodeHelp.C11_Trees;


public class C8_MirrorBinaryTree {

    public static void main(String[] args) {

        C8_TreeNode root1 = new C8_TreeNode(4);
        C8_TreeNode second1 = new C8_TreeNode(2);
        C8_TreeNode second2 = new C8_TreeNode(7);

        root1.left = second1;
        root1.right = second2;

        C8_TreeNode third1 = new C8_TreeNode(1);
        C8_TreeNode third2 = new C8_TreeNode(3);
        C8_TreeNode third3 = new C8_TreeNode(6);
        C8_TreeNode third4 = new C8_TreeNode(9);

        second1.left = third1;
        second1.right = third2;
        second2.left = third3;
        second2.right = third4;


        C8_TreeNode root2 = new C8_TreeNode(4);
        C8_TreeNode sec1 = new C8_TreeNode(7);
        C8_TreeNode sec2 = new C8_TreeNode(2);

        root2.left = sec1;
        root2.right = sec2;

        C8_TreeNode thr1 = new C8_TreeNode(9);
        C8_TreeNode thr2 = new C8_TreeNode(6);
        C8_TreeNode thr3 = new C8_TreeNode(3);
        C8_TreeNode thr4 = new C8_TreeNode(1);

        sec1.left = thr1;
        sec1.right = thr2;
        sec2.left = thr3;
        sec2.right = thr4;

        System.out.println(invertTree(root1,root2));
    }

    public static boolean invertTree(C8_TreeNode root1, C8_TreeNode root2) {

        if (root1==null && root2==null)return true;
        else if (root1 == null && root2!=null)return false;
        else if (root1!=null && root2==null)return false;

        if (root1.val!=root2.val)return false;


        return invertTree(root1.left,root2.right)&&invertTree(root1.right,root2.left);

    }

}


class C8_TreeNode {
    int val;
    C8_TreeNode left;
    C8_TreeNode right;
    C8_TreeNode() {}
    C8_TreeNode(int val) { this.val = val; }
    C8_TreeNode(int val, C8_TreeNode left, C8_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
