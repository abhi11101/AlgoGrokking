package com.CodeHelp.C12_BinarySearchTree.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A7_MergeTwoBST {

    public static void main(String[] args) {


    }

    public List<Integer> merge(A7_BstNode root1, A7_BstNode root2) {

        A7_BstNode curr1 = root1;
        A7_BstNode curr2 = root2;

        Stack<A7_BstNode> stack1 = new Stack<>();
        Stack<A7_BstNode> stack2 = new Stack<>();

        List<Integer> ans = new ArrayList<>();

        while (curr1 ==null || curr2 == null || !stack1.isEmpty() || !stack2.isEmpty()) {


            while(curr1!=null){
                stack1.push(curr1);
                curr1 = curr1.left;
            }
            while(curr2!=null){
                stack2.push(curr2);
                curr2 = curr2.left;
            }

            if (stack2.isEmpty() || (!stack1.isEmpty() && stack1.peek().val <= stack2.peek().val)){
                A7_BstNode node = stack1.pop();
                ans.add(node.val);
                stack1.push(node.right);
            }else{
                A7_BstNode node = stack2.pop();
                ans.add(node.val);
                stack2.push(node.right);
            }
        }
        return ans;
    }


}

class A7_BstNode {
    int val;
    A7_BstNode left;
    A7_BstNode right;
    A7_BstNode() {}
    A7_BstNode(int val) { this.val = val; }
    A7_BstNode(int val, A7_BstNode left, A7_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}