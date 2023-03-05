package com.DSA.BasicMath.LeetCode;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,4,3,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int ans =0;
        for (int x : nums){
            ans = ans^x;
        }
        return ans;
    }
}
