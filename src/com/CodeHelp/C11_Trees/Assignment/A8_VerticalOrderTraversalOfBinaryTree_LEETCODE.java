package com.CodeHelp.C11_Trees.Assignment;

import java.util.*;

/*
https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 */
public class A8_VerticalOrderTraversalOfBinaryTree_LEETCODE {

    static int rowLevels = 0;
    public static void main(String[] args) {

        A8_TreeNode root = new A8_TreeNode(1);
        A8_TreeNode two = new A8_TreeNode(2);
        A8_TreeNode three = new A8_TreeNode(3);
        A8_TreeNode four = new A8_TreeNode(4);
        A8_TreeNode five = new A8_TreeNode(5);
        A8_TreeNode six = new A8_TreeNode(6);
        A8_TreeNode seven = new A8_TreeNode(7);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        three.right = seven;

        List<List<Integer>> ans = verticalTraversal(root);
        System.out.println(ans);
    }

    public static List<List<Integer>> verticalTraversal(A8_TreeNode root) {

        List<List<Integer>> ans  = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Map<Integer, TreeMap<Integer,List<Integer>>> map = new TreeMap<>();

        dfs(root,0,0,map);


        for (TreeMap<Integer,List<Integer>> colMap : map.values()){

            List<Integer> list = new ArrayList<>();

            for (List<Integer> sublist : colMap.values()) {

                Collections.sort(sublist);
                list.addAll(sublist);
            }
            ans.add(list);

        }

        return ans;
    }

    public static void dfs(A8_TreeNode root, int col, int level, Map<Integer, TreeMap<Integer,List<Integer>>> map) {


        if (root == null) {
            return;
        }

        if (!map.containsKey(col)){
            map.put(col, new TreeMap<>());
        }
        if (!map.get(col).containsKey(level)){
            map.get(col).put(level, new ArrayList<>());
        }
        map.get(col).get(level).add(root.val);

        dfs(root.left,col-1,level+1,map);
        dfs(root.right,col+1,level+1,map);

    }

}

class A8_TreeNode {
    int val;
    A8_TreeNode left;
    A8_TreeNode right;
    A8_TreeNode() {}
    A8_TreeNode(int val) { this.val = val; }
    A8_TreeNode(int val, A8_TreeNode left, A8_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
