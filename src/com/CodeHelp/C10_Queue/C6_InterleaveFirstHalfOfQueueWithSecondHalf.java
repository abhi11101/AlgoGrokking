package com.CodeHelp.C10_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C6_InterleaveFirstHalfOfQueueWithSecondHalf {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
//        queue.add(6);

        printQueue(queue);
        rearrangeQueue(5,queue);
        printQueue(queue);

    }

    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {

        int size = q.size();
        int half =  size / 2;

        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < half; i++) {
            temp.add(q.poll());
        }
        printQueue(temp);

        while (!temp.isEmpty()){

            int first = temp.poll();
            int second = q.poll();
            q.add(first);
            q.add(second);
        }

        if (size%2!=0){
            int element = q.poll();
            q.add(element);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int x : q){
            res.add(x);
        }

        return res;
    }

    public static void printQueue(Queue<Integer> queue) {

        for (int x : queue) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
