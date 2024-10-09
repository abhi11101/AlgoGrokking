package com.CodeHelp.C13_Heap.Assignment;

import java.util.Collections;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/minimum-difference-in-sums-after-removal-of-elements/description/
 */
public class A4_MinimumDifferenceInSumsAfterRemovalOfElements_LEETCODE {

    public static void main(String[] args) {

        int[] nums1 = {3,1,2};
        System.out.println(minimumDifference(nums1));

        int[] nums2 = {7,9,5,8,1,3};
        System.out.println(minimumDifference(nums2));
    }

    public static long minimumDifference(int[] nums) {

        int n = nums.length/3;

        long[] prefix = new long[nums.length];
        long[] suffix = new long[nums.length];

        long sum = 0;

        PriorityQueue<Long> maxHeap =  new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0;i< nums.length;i++){


            sum += nums[i];
            maxHeap.add((long)nums[i]);

            if (maxHeap.size()>n){
                sum -= maxHeap.poll();
            }

            if (maxHeap.size()==n){
                prefix[i] = sum;
            }

        }

        sum =0;
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (int i =nums.length-1;i>=0;i--){

            sum+=nums[i];
            minHeap.add((long)nums[i]);

            if (minHeap.size()>n){
                sum -= minHeap.poll();
            }
            if (minHeap.size()==n){
                suffix[i] = sum;
            }
        }
        printArray(prefix);
        printArray(suffix);
        long ans = Long.MAX_VALUE;
        for (int i =n-1; i<2*n;i++){
            ans = Math.min(ans , (prefix[i]-suffix[i+1]));
        }

        return ans;
    }

    public static void printArray(long[] nums){

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
