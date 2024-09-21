package com.CodeHelp.C11_Trees;

public class C13_KthAncestorInTree {

    public static void main(String[] args) {

        C13_TreeNode root = new C13_TreeNode(10);
        C13_TreeNode twenty = new C13_TreeNode(20);
        C13_TreeNode thirty = new C13_TreeNode(30);

        root.left = twenty;
        root.right = thirty;

        C13_TreeNode forty = new C13_TreeNode(40);
        C13_TreeNode fifty = new C13_TreeNode(50);
        C13_TreeNode sixty = new C13_TreeNode(60);

        twenty.left = forty;
        twenty.right = fifty;
        thirty.right = sixty;

        C13_TreeNode seventy = new C13_TreeNode(70);
        C13_TreeNode eighty = new C13_TreeNode(80);
        C13_TreeNode ninety = new C13_TreeNode(90);
        C13_TreeNode hundred = new C13_TreeNode(100);

        forty.left = seventy;
        fifty.left = eighty;
        sixty.left = ninety;
        sixty.right = hundred;

        C13_TreeNode hundredTen = new C13_TreeNode(110);
        C13_TreeNode hundredTwenty = new C13_TreeNode(120);

        eighty.left = hundredTen;
        eighty.right = hundredTwenty;


        int ans = kthAncestor(root,2,120);
        System.out.println(ans);

    }

    public static int kthAncestor(C13_TreeNode root, int k, int node)
    {

        int[] ans = new int[1];
        ans[0] = -1;
        int[] count = new int[1];
        count[0] = k;

        findAncestor(root,count,node,ans);

        return ans[0];

    }

    public static boolean findAncestor(C13_TreeNode root, int[] k, int node, int[] ans){


        if (root == null){
            return false;
        }

        if (root.val==node){
            return true;
        }

        boolean left = findAncestor(root.left,k,node,ans);

        boolean right = findAncestor(root.right,k,node,ans);

        if(left || right){
            k[0]--;
        }
        if (k[0]==0){
            k[0] = -1;
            ans[0] = root.val;
        }
        return left || right;
    }

}


class C13_TreeNode {
    int val;
    C13_TreeNode left;
    C13_TreeNode right;
    C13_TreeNode() {}
    C13_TreeNode(int val) { this.val = val; }
    C13_TreeNode(int val, C13_TreeNode left, C13_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

