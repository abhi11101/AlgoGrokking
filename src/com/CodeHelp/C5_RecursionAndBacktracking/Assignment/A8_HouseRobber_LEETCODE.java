package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*

 */
public class A8_HouseRobber_LEETCODE {


    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        int[] arr2 = {2,7,9,3,1};
        System.out.println(rob(arr));
        System.out.println(rob(arr2));

    }

    public static int rob(int[] nums) {

        return find(nums, 0, 0);

    }

    public static int find(int[] nums, int index, int sum) {

        if (index>= nums.length){
            return sum;
        }

        int ansInclude = find(nums,index+2, sum+nums[index]);
        int ansExclude = find(nums,index+1, sum);

        return Math.max(ansInclude, ansExclude);

    }
}
