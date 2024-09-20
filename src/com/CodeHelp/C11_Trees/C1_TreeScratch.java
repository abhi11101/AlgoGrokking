package com.CodeHelp.C11_Trees;

import java.awt.datatransfer.FlavorEvent;
import java.util.*;

public class C1_TreeScratch {

    public static void main(String[] args) {

        C1_TreeNode root = buildTree();
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderTraversal(root,ans);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static C1_TreeNode buildTree() {

        int data;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        data = sc.nextInt();


        if (data==-1){
            return null;
        }

        C1_TreeNode root = new C1_TreeNode(data);

        System.out.println("Enter data for left of " + data + " ");

        root.left = buildTree();

        System.out.println("Enter data for right of " + data + " ");

        root.right = buildTree();

        return root;

    }

    public static void levelOrderTraversal(C1_TreeNode root, List<List<Integer>> ans) {

        Queue<C1_TreeNode> queue = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {

            C1_TreeNode node = queue.peek();

            queue.poll();

            if (node==null){

                System.out.println();
                ans.add(new ArrayList<>(level));
                level.clear();
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
            else{
                System.out.print(node.data + " ");
                level.add(node.data);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

        }
        System.out.println(level);
    }

}

class C1_TreeNode{

    int data;
    C1_TreeNode left;
    C1_TreeNode right;

    C1_TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}