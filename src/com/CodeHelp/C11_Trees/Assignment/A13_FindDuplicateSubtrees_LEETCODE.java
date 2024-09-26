package com.CodeHelp.C11_Trees.Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
https://leetcode.com/problems/find-duplicate-subtrees/
 */
public class A13_FindDuplicateSubtrees_LEETCODE {

    public static void main(String[] args) {

        A13_TreeNode root = new A13_TreeNode(1);
        A13_TreeNode two = new A13_TreeNode(2);
        A13_TreeNode three = new A13_TreeNode(3);
        A13_TreeNode four = new A13_TreeNode(4);
        A13_TreeNode two2 = new A13_TreeNode(2);
        A13_TreeNode four2 = new A13_TreeNode(4);
        A13_TreeNode four3 = new A13_TreeNode(4);

        root.left = two;
        root.right = three;
        two.left = four;
        three.left = two2;
        two2.left = four2;
        three.right = four3;

        List<A13_TreeNode> ans = findDuplicateSubtrees(root);
        System.out.println(ans);

    }

    public static List<A13_TreeNode> findDuplicateSubtrees(A13_TreeNode root) {

        List<A13_TreeNode> ans = new ArrayList<>();
        Map<String,Integer> path  = new HashMap<>();
        helper(root,path,ans);

        return ans;
    }

    public static String helper(A13_TreeNode root,Map<String,Integer> path,List<A13_TreeNode> ans){

        if (root == null){
            return  "N";
        }

        String curr = Integer.toString(root.val);
        String left = helper(root.left,path,ans);
        String right = helper(root.right,path,ans);

        String value = curr + "," + left + "," + right;

        if (path.containsKey(value)){

            if (path.get(value)==1){
                ans.add(root);
            }
            path.put(value,path.get(value)+1);
        }else{
            path.put(value,1);
        }
        return value;
    }
}

class A13_TreeNode {
    int val;
    A13_TreeNode left;
    A13_TreeNode right;
    A13_TreeNode() {}
    A13_TreeNode(int val) { this.val = val; }
    A13_TreeNode(int val, A13_TreeNode left, A13_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}