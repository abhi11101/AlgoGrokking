package com.CodeHelp.C13_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/find-median-from-data-stream/
 */
public class C18_FindMedianFromDataStream_LEETCODE {

    public static void main(String[] args) {

        MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        System.out.println(finder.findMedian());
        finder.addNum(2);
        System.out.println(finder.findMedian());
        finder.addNum(3);
        System.out.println(finder.findMedian());
    }

}

class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder() {

        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        if (minHeap.isEmpty() && maxHeap.isEmpty()) {
            maxHeap.add(num);
        }
        else{
            double median = findMedian();

            if (num<median){

                if (maxHeap.size()<=minHeap.size()){
                    maxHeap.add(num);
                }else{

                    int element = maxHeap.poll();
                    minHeap.add(element);
                    maxHeap.add(num);
                }

            }else{
                if (minHeap.size()<=maxHeap.size()){
                    minHeap.add(num);
                }else{
                    int element = minHeap.poll();
                    maxHeap.add(element);
                    minHeap.add(num);
                }
            }
        }
    }

    public double findMedian() {

        if (minHeap.size()>maxHeap.size()) {
            return minHeap.peek();
        }else if (maxHeap.size()>minHeap.size()) {
            return maxHeap.peek();
        }else{

            int first = minHeap.peek();
            int second  = maxHeap.peek();
            System.out.println("Else" + first + second);
            return (double) (first+second)/2;

        }

    }
}
