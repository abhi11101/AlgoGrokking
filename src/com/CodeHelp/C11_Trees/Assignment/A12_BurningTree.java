package com.CodeHelp.C11_Trees.Assignment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class A12_BurningTree {

    public static void main(String[] args) {

        A12_TreeNode root = new A12_TreeNode(1);
        A12_TreeNode two = new A12_TreeNode(2);
        A12_TreeNode three = new A12_TreeNode(3);
        A12_TreeNode four = new A12_TreeNode(4);
        A12_TreeNode five = new A12_TreeNode(5);
        A12_TreeNode six = new A12_TreeNode(6);
        A12_TreeNode seven = new A12_TreeNode(7);
        A12_TreeNode eight = new A12_TreeNode(8);
        A12_TreeNode nine = new A12_TreeNode(9);
        A12_TreeNode ten = new A12_TreeNode(10);

        root.left = two;
        root.right = three;
        two.left = four;
        two.right = five;
        three.right = six;
        five.left = seven;
        five.right = eight;
        six.right = nine;
        nine.right = ten;

        System.out.println(minTime(root,8));

    }

    public static int minTime(A12_TreeNode root, int target)
    {

        Map<A12_TreeNode, A12_TreeNode> parentMap = new HashMap<>();

        A12_TreeNode targetNode = findTargetAndParentMapping(root,target,parentMap);

        return burnTree(targetNode,parentMap);
    }


    public static A12_TreeNode findTargetAndParentMapping(A12_TreeNode root, int target, Map<A12_TreeNode, A12_TreeNode> parentMap){

        Queue<A12_TreeNode> queue = new LinkedList<>();
        queue.add(root);

        A12_TreeNode targetNode = null;
        parentMap.put(root,null);

        while (!queue.isEmpty()){

            A12_TreeNode currentNode = queue.poll();

            if (currentNode.val==target){
                targetNode = currentNode;
            }
            if (currentNode.left!=null){
                queue.add(currentNode.left);
                parentMap.put(currentNode.left,currentNode);
            }
            if (currentNode.right!=null){
                queue.add(currentNode.right);
                parentMap.put(currentNode.right,currentNode);
            }

        }

        return targetNode;
    }

    public static int burnTree(A12_TreeNode root, Map<A12_TreeNode, A12_TreeNode> parentMap){

        Map<A12_TreeNode, Boolean> isBurnt = new HashMap<>();
        Queue<A12_TreeNode> currentBurningQueue = new LinkedList<>();
        currentBurningQueue.add(root);
        isBurnt.put(root,true);
        int time =0;

        while (!currentBurningQueue.isEmpty()){

            int size = currentBurningQueue.size();
            boolean isFireSpreaded = false;

            for (int i = 0; i < size; i++) {

                A12_TreeNode currentNode = currentBurningQueue.poll();
                if (currentNode.left!=null && !isBurnt.containsKey(currentNode.left)){
                    currentBurningQueue.add(currentNode.left);
                    isBurnt.put(currentNode.left,true);
                    isFireSpreaded = true;
                }
                if (currentNode.right!=null && !isBurnt.containsKey(currentNode.right)){
                    currentBurningQueue.add(currentNode.right);
                    isBurnt.put(currentNode.right,true);
                    isFireSpreaded = true;
                }
                if (parentMap.get(currentNode)!=null && !isBurnt.containsKey(parentMap.get(currentNode))){

                    currentBurningQueue.add(parentMap.get(currentNode));
                    isBurnt.put(parentMap.get(currentNode),true);
                    isFireSpreaded = true;
                }
            }
            if (isFireSpreaded){
                time++;
            }
        }

        return time;

    }

}

class A12_TreeNode {
    int val;
    A12_TreeNode left;
    A12_TreeNode right;
    A12_TreeNode() {}
    A12_TreeNode(int val) { this.val = val; }
    A12_TreeNode(int val, A12_TreeNode left, A12_TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
