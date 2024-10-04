package com.CodeHelp.C13_Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class C7_KthLargestElementInArray_LEETCODE {

    public static void main(String[] args) {

        int[] arr1 = {3,2,1,5,6,4};
        System.out.println(findKthLargestUsingMaxHeap(arr1,2));
        System.out.println(findKthLargestUsingMinHeap(arr1,2));

        int[] arr2 = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargestUsingMaxHeap(arr2,4));
        System.out.println(findKthLargestUsingMinHeap(arr2,4));
    }

    public static int findKthLargestUsingMaxHeap(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
        }

        int ans = -1;
        while (k>0){
            ans = maxHeap.poll();
            k--;
        }

        return ans;
    }

    public static int findKthLargestUsingMinHeap(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i =0;i<k;i++){
            minHeap.add(nums[i]);
        }

        int index = k;
        while (index < nums.length){

            if (minHeap.peek() < nums[index]){
                minHeap.poll();
                minHeap.add(nums[index]);
            }
            index++;
        }

        return minHeap.peek();
    }

}
