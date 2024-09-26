package com.CodeHelp.C12_BinarySearchTree;

public class C4_PredecessorAndSuccessor {

    public static void main(String[] args) {

        C4_BstNode root = new C4_BstNode(8);
        C4_BstNode one = new C4_BstNode(1);
        C4_BstNode nine = new C4_BstNode(9);
        C4_BstNode four  = new C4_BstNode(4);
        C4_BstNode ten = new C4_BstNode(10);
        C4_BstNode three = new C4_BstNode(3);

        root.left = one;
        root.right = nine;
        one.right = four;
        four.left = three;
        nine.right = ten;

        findPreSuc(root, new C4_BstNode[]{null}, new C4_BstNode[]{null}, 8);
    }

    public static void findPreSuc(C4_BstNode root, C4_BstNode[] pre, C4_BstNode[] suc, int key) {


        pre[0] = findPredecessor(root,key);
        suc[0] = findSuccessor(root,key);

        System.out.println(pre[0].val);
        System.out.println(suc[0].val);
    }

    public static C4_BstNode findPredecessor(C4_BstNode root, int key){

        C4_BstNode pre = null;

        while (root != null){

            if (root.val>=key){
                root = root.left;
            }else{
                pre = root;
                root = root.right;
            }
        }

        return pre;
    }

    public static C4_BstNode findSuccessor(C4_BstNode root, int key){

        C4_BstNode suc = null;

        while (root != null){

            if (root.val<=key){
                root = root.right;
            }else{
                suc = root;
                root = root.left;
            }
        }

        return suc;
    }

}

class C4_BstNode {
    int val;
    C4_BstNode left;
    C4_BstNode right;
    C4_BstNode() {}
    C4_BstNode(int val) { this.val = val; }
    C4_BstNode(int val, C4_BstNode left, C4_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}