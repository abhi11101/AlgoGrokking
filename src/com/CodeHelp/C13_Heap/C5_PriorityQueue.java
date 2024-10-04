package com.CodeHelp.C13_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class C5_PriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        minHeap.add(10);
        minHeap.add(2);
        minHeap.add(30);
        minHeap.add(40);
        minHeap.add(4);

        System.out.println("Min heap top " + minHeap.peek());
        System.out.println(minHeap);
        maxHeap.add(10);
        maxHeap.add(120);
        maxHeap.add(5);
        maxHeap.add(40);
        System.out.println("Max heap top " + maxHeap.peek());
        System.out.println(maxHeap);
    }

}
