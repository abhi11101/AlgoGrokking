package com.CodeHelp.C2_SearchingAndSorting.Assignment;

/*
https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */


import java.util.*;

public class A1_K_diffPairsInAnArray_LEETCODE {


    public static void main(String[] args) {

        int[] nums = {3,1,4,1,5};
        printArray(nums);
        System.out.println(findPairs(nums,2));

    }

    public static int findPairs(int[] nums, int k) {

        Arrays.sort(nums);
        int count = 0;
        int i =0;
        int j=1;
        while (j<nums.length){
            int diff = nums[j]-nums[i];
            if (diff==k){
                count++;
                System.out.println(nums[i] + " " + nums[j]);
                i++;
                j++;
            }
            else if (diff>k){
                i++;
            }
            else {
                j++;
            }

        }

        return count;
    }

    private static void printArray(int[] arr) {

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
