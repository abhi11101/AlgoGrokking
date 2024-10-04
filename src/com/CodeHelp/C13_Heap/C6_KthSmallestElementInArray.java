package com.CodeHelp.C13_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class C6_KthSmallestElementInArray {

    public static void main(String[] args) {

        int[] arr = {10,8,70,90,4,60,1};
        System.out.println(kthSmallestUsingMinHeap(arr,4));
        System.out.println(kthSmallestUsingMaxHeap(arr,4));

        int[]arr2 = {3,11,6,9,4,12,2,8};
        System.out.println(kthSmallestUsingMinHeap(arr2,5));
        System.out.println(kthSmallestUsingMaxHeap(arr2,5));
    }

    public static int kthSmallestUsingMinHeap(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : nums) {
            minHeap.add(x);
        }

        int ans = 0;
        while (k>0){
            ans = minHeap.poll();
            k--;
        }

        return  ans;
    }

    public static int kthSmallestUsingMaxHeap(int[] nums, int k) {
        if (k>nums.length)return -1;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0;i<k;i++){
            maxHeap.add(nums[i]);
        }

        int index = k;
        while (index<nums.length){

            if (maxHeap.peek()>nums[index]){
                maxHeap.poll();
                maxHeap.add(nums[index]);
            }
            index++;

        }

        return maxHeap.peek();
    }

}
