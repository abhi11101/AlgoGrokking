package com.CodeHelp.Extra_NoteBook1;

import java.util.Arrays;

/*
https://leetcode.com/problems/max-number-of-k-sum-pairs/description/
 */
public class E61_MaxNumberOfKSumPairs_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(maxOperations(arr,5));

    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int i =0;
        int j = nums.length-1;
        int count =0;
        while(i<j){
            int sum = nums[j]+nums[i];
            if(sum==k){
                count++;
                i++;
                j--;
            }
            else if(sum>k)j--;
            else i++;
        }
        return count;
    }

}
