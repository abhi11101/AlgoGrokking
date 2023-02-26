package com.DSA.BinarySearch.LeetCode;

public class SplitArrayLargestSum_410 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k =2;
        System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int mid;
        int ans=-1;
        for (int x : nums){
            start= Math.max(start,x);
            end+=x;
        }
    //    System.out.println("End "+ end);
        while (start<=end){
            mid = start + (end-start)/2;
            System.out.println("Mid "+ mid);
            if (isPossible(mid,nums,k)){
             //   System.out.println("If");
                ans = mid;
                end = mid-1;
            }
            else{
             //   System.out.println("else");
                start=mid+1;
            }
        }
        return ans;
    }
    private static boolean isPossible(int mid, int[]nums, int k){
        int count =1;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            if (sum + nums[i]<=mid){
                sum+=nums[i];
            }else {
                count++;
                if (count>k || nums[i]>mid)return false;
                sum=nums[i];
            }
        }
        return true;
    }
}
