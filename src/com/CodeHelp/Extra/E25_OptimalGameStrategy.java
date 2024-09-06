package com.CodeHelp.Extra;

public class E25_OptimalGameStrategy {

    public static void main(String[] args) {

        int[] nums = {8,15,3,7};
        int[] nums2 = {5, 3, 7, 10};
        System.out.println(find(nums));
        System.out.println(find(nums2));

    }

    public static int find(int[] arr){

        return helper(arr,0,arr.length-1);
    }

    public static int helper(int[] nums, int left , int right ){

        if (left>right)return 0;

        int choice1 = nums[left] + Math.min(helper(nums,left+2,right),helper(nums,left+1,right-1));

        int choice2 = nums[right] + Math.min(helper(nums,left,right-2),helper(nums,left+1,right-1));

        return Math.max(choice1,choice2);

    }

}
