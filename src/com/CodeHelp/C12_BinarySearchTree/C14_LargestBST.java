package com.CodeHelp.C12_BinarySearchTree;

public class C14_LargestBST {

    public static void main(String[] args) {

        C14_BstNode root = new C14_BstNode(6);
        C14_BstNode six = new C14_BstNode(6);
        C14_BstNode two = new C14_BstNode(2);
        C14_BstNode three = new C14_BstNode(3);
        C14_BstNode one = new C14_BstNode(1);
        C14_BstNode two2 = new C14_BstNode(2);
        C14_BstNode three2 = new C14_BstNode(3);

        root.left = six;
        root.right = two;
        six.right = two2;
        two.left = one;
        two.right = three;

        System.out.println(largestBst(root));

    }

    public static int largestBst(C14_BstNode root)
    {
       int ans[] = {Integer.MIN_VALUE};
        helper(root, ans);
        return ans[0];
    }

    public static BstNodeData helper(C14_BstNode root, int[] ans){

        if (root == null){
            return  new BstNodeData(0,Integer.MAX_VALUE, Integer.MIN_VALUE,true);
        }

        BstNodeData left = helper(root.left, ans);
        BstNodeData right = helper(root.right, ans);

        BstNodeData currentNodeData = new BstNodeData();

        currentNodeData.size = left.size + right.size +1;
        currentNodeData.minValue = Math.min(root.val, left.minValue);
        currentNodeData.maxValue = Math.max(root.val, right.maxValue);


        if (left.isBST && right.isBST && root.val>left.maxValue && root.val<right.minValue){
            currentNodeData.isBST = true;
        }else{
            currentNodeData.isBST = false;
        }

        if (currentNodeData.isBST){
            ans[0] = Math.max(ans[0], currentNodeData.size);
        }

        return currentNodeData;
    }
}

class BstNodeData{

    int size;
    int minValue;
    int maxValue;
    boolean isBST;

    BstNodeData(){}

    BstNodeData(int size, int minValue, int maxValue,boolean isBST){
        this.size = size;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.isBST = isBST;
    }


}


class C14_BstNode {
    int val;
    C14_BstNode left;
    C14_BstNode right;
    C14_BstNode() {}
    C14_BstNode(int val) { this.val = val; }
    C14_BstNode(int val, C14_BstNode left, C14_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}