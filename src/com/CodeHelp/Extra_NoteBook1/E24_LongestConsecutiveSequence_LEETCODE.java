package com.CodeHelp.Extra_NoteBook1;

import java.util.HashSet;

/*
https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class E24_LongestConsecutiveSequence_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int count =1;
                while (set.contains(currentNum+1)){

                    count++;
                    currentNum++;
                }
                max = Math.max(max, count);
                }


            }

        return max;
    }

}
