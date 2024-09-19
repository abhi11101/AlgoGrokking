package com.CodeHelp.C10_Queue;

import java.util.*;

/*
https://leetcode.com/problems/sliding-window-maximum/
 */
public class C10_SlidingWindowMaximum_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
//        int[] ans = maxSlidingWindow(nums, 3);

        int[] nums2 = {9,10,9,-7,-4,-8,2,-6};
        int[] ans2 = maxSlidingWindow(nums2, 5);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        int index =0;


        while (index < k){

            while (!queue.isEmpty() && nums[index] >= nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.add(index);
            index++;
        }
        System.out.println("Queue " + queue);
        res.add(nums[queue.peek()]);
        while (index< nums.length){
            System.out.println("Queue " + queue);
            if (!queue.isEmpty() && (index - queue.peek())>=k){
                queue.pollFirst();
            }

            while (!queue.isEmpty() && nums[index]>=nums[queue.peekLast()]){
                queue.pollLast();
            }

            queue.add(index);

            res.add(nums[queue.peek()]);
            index++;

        }
        System.out.println(res);
        return res.stream().mapToInt(i->i).toArray();
    }

}
