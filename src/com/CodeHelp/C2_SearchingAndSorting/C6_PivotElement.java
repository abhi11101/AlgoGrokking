package com.CodeHelp.C2_SearchingAndSorting;

public class C6_PivotElement {

    public static void main(String[] args) {

        int[] nums = {3,4,5,6,7,1,2};
        System.out.println(nums[pivot(nums)]);

    }


    public static int pivot(int[] nums){

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start<=end){

            mid = start + (end - start)/2;

            if (nums[mid]>nums[mid+1] && mid+1<nums.length){
                return mid;
            }
            if (nums[mid]<nums[mid-1] && mid-1>=0){
                return mid-1;
            }

            if (nums[start]<=nums[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
       return -1;
    }

}
