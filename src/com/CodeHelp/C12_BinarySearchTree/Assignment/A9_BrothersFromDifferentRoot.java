package com.CodeHelp.C12_BinarySearchTree.Assignment;

import java.util.Stack;

public class A9_BrothersFromDifferentRoot {

    public static void main(String[] args) {

        A9_BstNode root = new A9_BstNode(5);
        root.left = new A9_BstNode(3);
        root.right = new A9_BstNode(7);
        root.left.left = new A9_BstNode(2);
        root.left.right = new A9_BstNode(4);
        root.right.left = new A9_BstNode(6);
        root.right.right = new A9_BstNode(8);


        A9_BstNode root2 = new A9_BstNode(10);
        root2.left = new A9_BstNode(6);
        root2.right = new A9_BstNode(15);
        root2.left.left = new A9_BstNode(3);
        root2.left.right = new A9_BstNode(8);
        root2.right.left = new A9_BstNode(11);
        root2.right.right = new A9_BstNode(18);


        System.out.println(countPairs(root, root2,16));

    }

    public static int countPairs(A9_BstNode root1, A9_BstNode root2, int x)
    {

        int ans =0;
        Stack<A9_BstNode> stack1 = new Stack<A9_BstNode>();
        Stack<A9_BstNode> stack2 = new Stack<A9_BstNode>();

        A9_BstNode curr1 = root1;
        A9_BstNode curr2 = root2;

        while (true){

            while (curr1!=null){
                stack1.push(curr1);
                curr1 = curr1.left;
            }

            while (curr2!=null){
                stack2.push(curr2);
                curr2 = curr2.right;
            }

            if (stack1.isEmpty() || stack2.isEmpty()){
                break;
            }

            A9_BstNode node1 = stack1.peek();
            A9_BstNode node2 = stack2.peek();
            int sum  = node1.val + node2.val;

            if (sum == x){
                ans++;
                stack1.pop();
                stack2.pop();
                curr1 = node1.right;
                curr2 = node2.left;
            }
            else if(sum > x){
                stack2.pop();
                curr2 = node2.left;
            }else{
                stack1.pop();
                curr1 = node1.right;
            }
        }
        return ans;
    }

}

class A9_BstNode {
    int val;
    A9_BstNode left;
    A9_BstNode right;
    A9_BstNode() {}
    A9_BstNode(int val) { this.val = val; }
    A9_BstNode(int val, A9_BstNode left, A9_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
