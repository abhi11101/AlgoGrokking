package com.CodeHelp.C11_Trees.Assignment;

import java.util.ArrayList;
import java.util.List;

public class A9_MorrisTraversal {

    public static void main(String[] args) {

        A9_TreeNode root = new A9_TreeNode(1);
        A9_TreeNode two = new A9_TreeNode(2);
        A9_TreeNode three = new A9_TreeNode(3);
        A9_TreeNode four = new A9_TreeNode(4);
        A9_TreeNode five = new A9_TreeNode(5);
        A9_TreeNode six = new A9_TreeNode(6);
        A9_TreeNode seven = new A9_TreeNode(7);
        A9_TreeNode eight = new A9_TreeNode(8);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.left = seven;
        three.right = eight;
        five.left = six;

        List<Integer> ans = inOrderTraversal(root);
        System.out.println(ans);


    }

    public static List<Integer> inOrderTraversal(A9_TreeNode root) {

        List<Integer> ans  = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        A9_TreeNode curr = root;

       while (curr != null) {

           if (curr.left==null) {
            ans.add(curr.val);
            curr = curr.right;
           }else{
               A9_TreeNode pred = curr.left;

               while (pred.right!=curr && pred.right!=null){
                   pred = pred.right;
               }

               if (pred.right==null){
                   pred.right = curr;
                   curr=curr.left;
               }else{
                   pred.right = null;
                   ans.add(curr.val);
                   curr = curr.right; 
               }
           }
       }

        return ans;

    }

}

class A9_TreeNode {
    int val;
    A9_TreeNode left;
    A9_TreeNode right;
    A9_TreeNode() {}
    A9_TreeNode(int val) { this.val = val; }
    A9_TreeNode(int val, A9_TreeNode left, A9_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
