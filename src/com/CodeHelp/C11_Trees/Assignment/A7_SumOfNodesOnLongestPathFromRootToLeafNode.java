package com.CodeHelp.C11_Trees.Assignment;

public class A7_SumOfNodesOnLongestPathFromRootToLeafNode {

    public static void main(String[] args) {


        A7_TreeNode root  = new A7_TreeNode(4);
        A7_TreeNode two = new A7_TreeNode(2);
        A7_TreeNode five = new A7_TreeNode(5);
        A7_TreeNode seven = new A7_TreeNode(7);
        A7_TreeNode one = new A7_TreeNode(1);
        A7_TreeNode two2 = new A7_TreeNode(2);
        A7_TreeNode three = new A7_TreeNode(3);
        A7_TreeNode six = new A7_TreeNode(6);


        root.left = two;
        root.right = five;
        two.left = seven;
        two.right = one;
        five.left = two2;
        five.right = three;
        one.left = six;

        System.out.println(sumOfLongRootToLeafPath(root));

    }

    public static int sumOfLongRootToLeafPath(A7_TreeNode root)
    {

        A7_Pair pair =findHeight(root);

        return pair.sum;


    }

    public static A7_Pair findHeight(A7_TreeNode root){

        if (root == null)return new A7_Pair(0, 0);

        A7_Pair left = findHeight(root.left);
        A7_Pair right = findHeight(root.right);

        int sum = root.val;

        if(left.height == right.height){
            sum+= left.sum > right.sum ? left.sum : right.sum;
        }else if (left.height > right.height){
            sum+= left.sum;
        }else{
            sum+= right.sum;
        }


        return new A7_Pair(Math.max(left.height, right.height) + 1,sum);

    }

}

class A7_TreeNode {
    int val;
    A7_TreeNode left;
    A7_TreeNode right;
    A7_TreeNode() {}
    A7_TreeNode(int val) { this.val = val; }
    A7_TreeNode(int val, A7_TreeNode left, A7_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class A7_Pair{

    int height;
    int sum;

    A7_Pair(int height, int sum){
        this.height = height;
        this.sum = sum;
    }

}