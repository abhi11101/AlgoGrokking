package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
public class E59_MaximumAverageSubarray_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr,4));

    }

    public static double findMaxAverage(int[] nums, int k) {

        int index = 0;

        double sum = 0;
        double avg = 0;
        double max = 0;

        while (index<k){
            sum+=nums[index];
            index++;
        }
        avg =  sum/k;
        if (avg>max)max=avg;

        while (index<nums.length){

            int num = nums[index];
            sum+=num;

            int oldNum = nums[index-k];
            sum-=oldNum;

            avg = sum/k;
            if (avg>max)max=avg;
            index++;
        }
        return max;
    }

}
