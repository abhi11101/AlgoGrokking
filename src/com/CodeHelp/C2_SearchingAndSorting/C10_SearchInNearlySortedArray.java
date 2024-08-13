package com.CodeHelp.C2_SearchingAndSorting;

public class C10_SearchInNearlySortedArray {

    public static void main(String[] args) {

        int[] nums = {10, 3, 40, 20, 50, 80, 70};
        System.out.println(search(nums,50));

    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (mid>start && nums[mid-1]==target){
                return mid-1;
            }
            else if (mid<end && nums[mid+1]==target){
                return mid+1;
            }
            if (nums[mid]>target) {
                end = mid - 2;
            }
            else if (nums[mid]<target) {
                start = mid + 2;
            }

        }

        return -1;
    }


}
