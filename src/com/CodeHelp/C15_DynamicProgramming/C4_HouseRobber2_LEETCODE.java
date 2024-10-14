package com.CodeHelp.C15_DynamicProgramming;

import java.util.Arrays;

/*
https://leetcode.com/problems/house-robber-ii/
 */
public class C4_HouseRobber2_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {2,3,2};
        System.out.println(robUsingRecursion(nums));
        System.out.println(robUsingTopDown(nums));
        System.out.println(robUsingBottomUp(nums));
        System.out.println(robUsingSpaceOptimal(nums));

    }

    public static int robUsingRecursion(int[] nums) {

        if (nums.length==1)return nums[0];
        int n = nums.length-1;

        int firstHouse = helperRecursion(nums,0,n-1);

        int lastHouse = helperRecursion(nums,1,n);

        return Math.max(firstHouse,lastHouse);

    }

    public static int helperRecursion(int[] nums, int start, int index){

        if (index<start)return 0;

        if (index==start){
            return nums[start];
        }

        int include = nums[index] + helperRecursion(nums,start,index-2);

        int exclude = helperRecursion(nums,start,index-1);

        return Math.max(include,exclude);

    }

    public static int robUsingTopDown(int[] nums) {

        if (nums.length==1)return nums[0];

        int n = nums.length-1;

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        int firstHouse = helperTopDown(nums,0,n-1,dp);

        Arrays.fill(dp,-1);

        int lastHouse = helperTopDown(nums,1,n,dp);

        return Math.max(firstHouse,lastHouse);

    }

    public static int helperTopDown(int[] nums, int start, int index, int[] dp) {

        if (index<start)return 0;

        if (index==start){
            return nums[start];
        }

        if (dp[index]!=-1)return dp[index];


        int include = nums[index] + helperTopDown(nums,start,index-2,dp);

        int exclude = helperTopDown(nums,start,index-1,dp);

        dp[index] = Math.max(include,exclude);

        return dp[index];
    }

    public static int robUsingBottomUp(int[] nums) {

        if (nums.length==1)return nums[0];

        int n = nums.length-1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        int firstHouse = helperBottomUp(nums,0,n-1,dp);

        Arrays.fill(dp,-1);

        int lastHouse = helperBottomUp(nums,1,n,dp);


        return Math.max(firstHouse,lastHouse);
    }

    public static int helperBottomUp(int[] nums, int start, int end,int[] dp) {

        dp[start] = nums[start];

       for (int i = start+1; i<=end;i++){

           int temp = 0;
           if (i-2 >=start){
               temp = dp[i-2];
           }

           int include = temp + nums[i];

           int exclude = dp[i-1];

           dp[i] = Math.max(include,exclude);

       }

       return dp[end];
    }

    public static int robUsingSpaceOptimal(int[] nums) {

        if (nums.length==1)return nums[0];
        if (nums.length==2) return Math.max(nums[0],nums[1]);
        int n = nums.length-1;

        int firstHouse = helperSpaceOptimal(nums,0,n-1);

        int lastHouse = helperSpaceOptimal(nums,1,n);

        return Math.max(firstHouse,lastHouse);

    }

    public static int helperSpaceOptimal(int[] nums, int start, int end) {

        int prev2 =0;
        int prev1 = nums[start];

        int curr = 0;

        for (int i=start+1;i<=end;i++){

            int include = prev2 + nums[i];
            int exclude = prev1;

            curr = Math.max(include,exclude);
            prev2 = prev1;
            prev1 = curr;

        }

        return curr;
    }

}
