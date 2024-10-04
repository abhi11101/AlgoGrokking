package com.CodeHelp.C13_Heap;

import java.util.LinkedList;
import java.util.Queue;

/*

 */
public class C10_CheckCompletenessOfBinaryTree_LEETCODE {

    public static void main(String[] args) {


    }

    public boolean isCompleteTree(C10_HeapNode root) {

        Queue<C10_HeapNode> queue = new LinkedList<>();
        boolean isNull = false;
        queue.add(root);

        while (!queue.isEmpty()) {

            C10_HeapNode temp = queue.poll();

            if (temp==null){
                isNull = true;
            }else{

                if (isNull)return false;

                queue.add(temp.left);
                queue.add(temp.right);
            }

        }

        return true;
    }

}

class C10_HeapNode{
    int val;
    C10_HeapNode left,right;
    C10_HeapNode(int d){
        val =d;
        left=right=null;
    }
}