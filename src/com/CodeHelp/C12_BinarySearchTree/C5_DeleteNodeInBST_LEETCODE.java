package com.CodeHelp.C12_BinarySearchTree;

/*
https://leetcode.com/problems/delete-node-in-a-bst/
 */
public class C5_DeleteNodeInBST_LEETCODE {

    public static void main(String[] args) {

        C5_BstNode root = new C5_BstNode(5);
        C5_BstNode three = new C5_BstNode(3);
        C5_BstNode two = new C5_BstNode(2);
        C5_BstNode four  = new C5_BstNode(4);
        C5_BstNode six = new C5_BstNode(6);
        C5_BstNode seven = new C5_BstNode(7);

        root.left = three;
        root.right = six;
        three.left = two;
        three.right = four;
        six.right = seven;

        deleteNode(root, 3);
    }

    public static C5_BstNode deleteNode(C5_BstNode root, int key) {

        if (root == null)return null;

        if (key< root.val){
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{

            if (root.left==null)return root.right;
            else if (root.right==null)return root.left;
            else{
                root.val = findSuccessor(root.right);

                root.right = deleteNode(root.right, root.val);
            }
        }

        return root;
    }

    public static int findSuccessor(C5_BstNode root) {

        int ans  = root.val;

        while (root.left!=null){
            ans = root.left.val;
            root = root.left;
        }

        return ans;
    }

    public static int findPredecessor(C5_BstNode root) {

        int ans = root.val;

        while (root.right!=null){
            ans = root.right.val;
            root = root.right;
        }

        return ans;
    }

}

class C5_BstNode {
    int val;
    C5_BstNode left;
    C5_BstNode right;
    C5_BstNode() {}
    C5_BstNode(int val) { this.val = val; }
    C5_BstNode(int val, C5_BstNode left, C5_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}