package com.CodeHelp.C12_BinarySearchTree.Assignment;

import java.util.ArrayList;
import java.util.List;

public class A3_MedianOfBST {

    public static void main(String[] args) {

        A3_BstNode root = new A3_BstNode(6);
        A3_BstNode three = new A3_BstNode(3);
        A3_BstNode four = new A3_BstNode(4);
        A3_BstNode seven = new A3_BstNode(7);
        A3_BstNode eight = new A3_BstNode(8);
        A3_BstNode nine = new A3_BstNode(9);
        A3_BstNode one = new A3_BstNode(1);

        root.left = three;
        root.right = eight;
        three.left = one;
        three.right = four;
        eight.left = seven;
        eight.right = nine;


        System.out.println(findMedian(root));

        System.out.println(efficientWay(root));
    }

    public static float efficientWay(A3_BstNode root) {


        int n = countNodes(root);


        return findMedianFaster(root, n);
    }

    public static float findMedianFaster(A3_BstNode root, int n) {

        if (root==null) return 0;


        A3_BstNode current = root;
        int currentCount =0;

        int odd1 = (n+1)/2;
        int oddVal = -1;

        int even1 = n/2;
        int evenVal = -1;

        int even2 = n/2+1;
        int even2Val = -1;

        while (current!=null) {

            if (current.left == null) {
                currentCount++;
                if (currentCount == odd1) oddVal = current.val;
                if (currentCount == even1) evenVal = current.val;
                if (currentCount == even2) even2Val = current.val;
                current = current.right;
            }else{

                A3_BstNode prev = current.left;
                while (prev.right!=current &&prev.right !=null){
                    prev = prev.right;
                }

                if (prev.right==null){
                    prev.right = current;
                    current = current.left;
                }else{
                    prev.right = null;
                    currentCount++;
                    if (currentCount == odd1) oddVal = current.val;
                    if (currentCount == even1) evenVal = current.val;
                    if (currentCount == even2) even2Val = current.val;
                    current = current.right;
                }
            }
        }

        float ans = -1;

        if (n%2==0){

            ans = (float)(evenVal + even2Val)/2;

        }else{
            ans = oddVal;
        }
        return ans;

    }
    public static int countNodes(A3_BstNode root) {

        if (root == null) {return 0;}

        A3_BstNode current = root;

        int n =0;
        while (current != null) {


            if (current.left==null){
                n++;
                current = current.right;
            }else{


                A3_BstNode prev = current.left;

                while (prev.right!=current &&prev.right !=null){
                    prev = prev.right;
                }

                if (prev.right==null){
                    prev.right = current;
                    current = current.left;
                }else{
                    prev.right = null;
                    n++;
                    current = current.right;
                }
            }
        }

        return n;
    }

    public static float findMedian(A3_BstNode root)
    {
        List<Integer> inOrder = new ArrayList<Integer>();
        findInorder(root, inOrder);

        int n = inOrder.size();

        if (n % 2 == 0){

            int first = inOrder.get(n/2);
            int second = inOrder.get((n/2) -1);

            return (float)(first + second) / 2;

        }else{
            return (float)inOrder.get(n/2);
        }
    }

    public static void findInorder(A3_BstNode root, List<Integer> inOrder){

        if (root == null)return;

        findInorder(root.left, inOrder);
        inOrder.add(root.val);
        findInorder(root.right, inOrder);
    }

}

class A3_BstNode {
    int val;
    A3_BstNode left;
    A3_BstNode right;
    A3_BstNode() {}
    A3_BstNode(int val) { this.val = val; }
    A3_BstNode(int val, A3_BstNode left, A3_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}