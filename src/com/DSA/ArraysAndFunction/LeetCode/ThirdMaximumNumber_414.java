package com.DSA.ArraysAndFunction.LeetCode;


public class ThirdMaximumNumber_414 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Integer firstMax=null;
        Integer secondMax =null;
        Integer thirdMax =null;
        for(Integer x : nums){
            if (x.equals(firstMax) || x.equals(secondMax) || x.equals(thirdMax))continue;
            if(firstMax==null || x>firstMax){
                thirdMax=secondMax;
                secondMax=firstMax;
                firstMax=x;
            }else if(secondMax==null || x>secondMax){
                thirdMax=secondMax;
                secondMax=x;
            } else if (thirdMax==null || x>thirdMax) {
                thirdMax=x;
            }
        }
        return thirdMax==null ? firstMax : thirdMax;
    }

}
