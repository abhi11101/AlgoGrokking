package com.CodeHelp.C15_DynamicProgramming;

import java.util.Arrays;

/*
https://leetcode.com/problems/house-robber/
 */
public class C3_HouseRobber_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
        System.out.println(robUsingTopDown(nums));
        System.out.println(robUsingBottomUp(nums));
        System.out.println(robUsingSpaceOptimal(nums));

    }

    public static int rob(int[] nums) {

        return helper(nums,nums.length-1);

    }

    public static int helper(int[] nums, int index){

        if (index ==0){
            return nums[0];
        }
        if (index<0){
            return 0;
        }

        int ansInclude = nums[index] + helper(nums, index-2 );
        int ansExclude = helper(nums,index-1);


        return Math.max(ansInclude,ansExclude);
    }

    public static int robUsingTopDown(int[] nums) {

        int[] dp  = new int[nums.length+1];
        Arrays.fill(dp,-1);

        return helperTopDown(nums,nums.length-1,dp);

    }

    public static int helperTopDown(int[] nums,int index, int[] dp) {

       if (index<0)return 0;
       if (index ==0)return nums[0];

       if (dp[index] != -1) {
           return dp[index];
       }

        int ansInclude = nums[index] + helperTopDown(nums,index-2,dp);
        int ansExclude = helperTopDown(nums,index-1,dp);

        dp[index] = Math.max(ansInclude,ansExclude);

        return dp[index];
    }

    public static int robUsingBottomUp(int[] nums) {

        int n = nums.length-1;

        int[] dp = new int[n+1];
        dp[0] = nums[0];

        for (int i = 1; i <= n; i++) {

            int temp = 0;
            if (i-2>=0){
                temp = dp[i-2];
            }

            int include = temp + nums[i];
            int exclude = dp[i-1];

            dp[i] = Math.max(include,exclude);

        }

        return dp[n];
    }

    public static int robUsingSpaceOptimal(int[] nums) {

        int prev1 = nums[0];
        int prev2 = 0;
        int curr =0;

        for (int i = 1; i < nums.length; i++) {

            int include = prev2 + nums[i];
            int exclude = prev1;

            curr = Math.max(include,exclude);

            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }

}
