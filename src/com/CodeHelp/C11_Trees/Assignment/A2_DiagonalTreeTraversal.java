package com.CodeHelp.C11_Trees.Assignment;

import java.util.*;

public class A2_DiagonalTreeTraversal {

    public static void main(String[] args) {

        A3_TreeNode root = new A3_TreeNode(8);
        A3_TreeNode three = new A3_TreeNode(3);
        A3_TreeNode ten = new A3_TreeNode(10);
        A3_TreeNode one = new A3_TreeNode(1);
        A3_TreeNode six = new A3_TreeNode(6);
        A3_TreeNode fourteen  = new A3_TreeNode(14);
        A3_TreeNode four  = new A3_TreeNode(4);
        A3_TreeNode seven = new A3_TreeNode(7);
        A3_TreeNode thirteen  = new A3_TreeNode(13);

        root.left = three;
        root.right = ten;

        three.left = one;
        three.right = six;
        ten.right = fourteen;

        six.left = four;
        six.right = seven;
        fourteen.left = thirteen;

        List<Integer> ans = diagonal(root);
        System.out.println(ans);

    }

    public static List<Integer> diagonal(A3_TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        if (root == null)return ans;

        Queue<A3_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            A3_TreeNode temp = queue.poll();

            while (temp!=null){

                ans.add(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                temp=temp.right;
            }
        }

        return ans;
    }

}

class A2_TreeNode {
    int val;
    A2_TreeNode left;
    A2_TreeNode right;
    A2_TreeNode() {}
    A2_TreeNode(int val) { this.val = val; }
    A2_TreeNode(int val, A2_TreeNode left, A2_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

