package com.CodeHelp.C10_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class C5_ReverseFirstK_ElementsOfQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        printQueue(queue);
        modifyQueue(queue,5);
        printQueue(queue);

    }

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<k;i++){
            stack.push(q.poll());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }

        for (int i =0;i<q.size()-k;i++){
            int element = q.poll();
            q.add(element);
        }
        return q;
    }

    public static void printQueue(Queue<Integer> queue) {

        for (int x : queue) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
