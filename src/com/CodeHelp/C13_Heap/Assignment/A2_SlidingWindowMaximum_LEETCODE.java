package com.CodeHelp.C13_Heap.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*
https://leetcode.com/problems/sliding-window-maximum/
 */
public class A2_SlidingWindowMaximum_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] ans = maxSlidingWindow(nums, 3);
        printArray(ans);

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]);

        for (int i =0;i<k;i++){
            int[] data = {nums[i],i};
            maxHeap.add(data);
        }

        List<Integer> list = new ArrayList<>();
        list.add(maxHeap.peek()[0]);

        int index =k;

        while (index<nums.length){

            while (!maxHeap.isEmpty() && (index-maxHeap.peek()[1])>=k)maxHeap.poll();

            int[] data = {nums[index],index};
            maxHeap.add(data);

            list.add(maxHeap.peek()[0]);

            index++;
        }

        int[] ans = new int[list.size()];

        for (int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void printArray(int[] nums){

        for (int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
