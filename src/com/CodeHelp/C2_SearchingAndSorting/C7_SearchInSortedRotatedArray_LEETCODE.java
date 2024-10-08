package com.CodeHelp.C2_SearchingAndSorting;

public class C7_SearchInSortedRotatedArray_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int[] nums2 = {1};
        System.out.println(search(nums,0));

    }

    public static int search(int[] nums, int target) {


        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start<=end){

            mid = start + (end - start)/2;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[start]<=nums[mid]){

                if (target>=nums[start] && target<nums[mid]){
                    end =mid-1;
                }else {
                    start = mid+1;
                }
            }
            else{
                if (target>nums[mid] && target <=nums[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }

        }

        return -1;

    }

}
