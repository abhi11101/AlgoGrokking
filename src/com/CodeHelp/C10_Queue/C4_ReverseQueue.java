package com.CodeHelp.C10_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class C4_ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        printQueue(queue);
        reverseQueue(queue);
        printQueue(queue);
        usingRecursion(queue);
        printQueue(queue);
    }

    public static void reverseQueue(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }

    public static void usingRecursion(Queue<Integer> queue) {

        if (queue.isEmpty()){
            return;
        }

        int element = queue.poll();
        reverseQueue(queue);
        queue.add(element);

    }

    public static void printQueue(Queue<Integer> queue) {

        for (int x : queue) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
