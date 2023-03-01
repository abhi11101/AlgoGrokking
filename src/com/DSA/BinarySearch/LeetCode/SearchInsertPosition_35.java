package com.DSA.BinarySearch.LeetCode;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        int ans=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target){
                end=mid-1;
                ans=mid;
            }else {
                start=mid+1;
                ans =start;
            }
        }
        return ans;
    }
}
