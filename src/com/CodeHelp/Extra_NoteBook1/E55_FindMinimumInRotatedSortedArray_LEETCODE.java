package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 */
public class E55_FindMinimumInRotatedSortedArray_LEETCODE {

    public static void main(String[] args) {

        int[] arr1 = {3,4,5,1,2};
        System.out.println(findMin(arr1));

        int[] arr2 = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr2));

        int[] arr3 = {11,13,15,17};
        System.out.println(findMin(arr3));

    }

    public static int findMin(int[] nums) {

        int start =0;
        int end = nums.length-1;
        int mid = 0;

        while (start <= end) {

            mid = start + (end - start)/2;

            if (nums[mid]>nums[mid+1]){
                return nums[mid+1];
            } else if (nums[mid]<nums[mid-1]) {
                return nums[mid];
            }
            else if (nums[start]<nums[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }

        return nums[0];
    }

}
