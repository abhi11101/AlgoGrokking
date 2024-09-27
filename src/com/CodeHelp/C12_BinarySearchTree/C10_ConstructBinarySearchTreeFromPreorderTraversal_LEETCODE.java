package com.CodeHelp.C12_BinarySearchTree;

import java.util.*;

/*
https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class C10_ConstructBinarySearchTreeFromPreorderTraversal_LEETCODE {

    public static void main(String[] args) {

        int[] preOrder = {8,5,1,7,10,12};

        C10_BstNode ans = fasterWay(preOrder);

        levelOrder(ans);

    }

    public static C10_BstNode fasterWay(int[] preOrder){

        return fasterHelper(preOrder,Integer.MAX_VALUE, new int[]{0});
    }

    public static C10_BstNode fasterHelper(int[] preOrder, int upperBound, int[] index){

        if (index[0]>=preOrder.length || preOrder[index[0]]>upperBound) return null;

        int element = preOrder[index[0]];
        C10_BstNode root = new C10_BstNode(element);
        index[0]++;

        root.left = fasterHelper(preOrder, root.val, index);
        root.right = fasterHelper(preOrder,upperBound,index);

        return root;
    }

    public static C10_BstNode bstFromPreorder(int[] preorder) {
        
        int[] inOrder = Arrays.copyOf(preorder, preorder.length);
        Arrays.sort(inOrder);

        int[] preOrderIndex = {0};

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            map.put(inOrder[i], i);
        }

        C10_BstNode ans = constructTree(preorder,preOrderIndex,0,inOrder.length-1, map);;

        return ans;
        
    }


    public static C10_BstNode constructTree( int[] preorder, int[] preOrderIndex, int inOrderStart, int inOrderEnd,
                                             HashMap<Integer,Integer> map) {

        if (inOrderStart > inOrderEnd) {
            return null;
        }

        int element = preorder[preOrderIndex[0]];
        preOrderIndex[0]++;

        C10_BstNode root = new C10_BstNode(element);

        int pos = map.get(element);

        root.left = constructTree(preorder,preOrderIndex,inOrderStart,pos-1,map);
        root.right = constructTree(preorder,preOrderIndex,pos+1,inOrderEnd,map);

        return root;

    }

    public static void levelOrder(C10_BstNode root) {

        Queue<C10_BstNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                C10_BstNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(list);
        }
        System.out.println(ans);
    }

}

class C10_BstNode {
    int val;
    C10_BstNode left;
    C10_BstNode right;
    C10_BstNode() {}
    C10_BstNode(int val) { this.val = val; }
    C10_BstNode(int val, C10_BstNode left, C10_BstNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}