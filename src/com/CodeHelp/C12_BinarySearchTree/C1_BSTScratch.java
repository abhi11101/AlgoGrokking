package com.CodeHelp.C12_BinarySearchTree;

import java.util.*;

public class C1_BSTScratch {

    public static void main(String[] args) {

        C1_BstNode root = null;
        C1_BstNode a = takeInput(root);

        List<List<Integer>> ans  = levelOrderTraversal(a);
        System.out.println(ans);
    }

    public static C1_BstNode takeInput(C1_BstNode root) {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data!=-1){

            root = insertIntoBST(root,data);
            data = sc.nextInt();
        }

        return root;
    }

    public static C1_BstNode insertIntoBST(C1_BstNode root, int data){

        if (root==null){
            root = new C1_BstNode(data);
            return root;
        }

        if (root.val > data){
            root.left = insertIntoBST(root.left,data);
        }else{
            root.right = insertIntoBST(root.right,data);
        }

        return root;

    }

    public static List<List<Integer>> levelOrderTraversal(C1_BstNode root){

        Queue<C1_BstNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                C1_BstNode cur = queue.poll();
                level.add(cur.val);
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }

            }
            ans.add(level);

        }


        return ans;
    }

}

class C1_BstNode {
    int val;
    C1_BstNode left;
    C1_BstNode right;
    C1_BstNode() {}
    C1_BstNode(int val) { this.val = val; }
    C1_BstNode(int val, C1_BstNode left, C1_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}