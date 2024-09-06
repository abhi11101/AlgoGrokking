package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/search-insert-position/description/
 */
public class E38_SearchInsertPosition_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,2));
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0, end = nums.length - 1;

        int mid =0;
        int ans = 0;
        while(start <= end){

            mid = start + (end - start)/2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
                ans =mid;
            }
            else {

                end = mid - 1;
            }

        }
        return ans+1;

    }

}
