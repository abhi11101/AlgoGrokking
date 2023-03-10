package com.DSA.ArraysAndFunction.LeetCode;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
      int index=0;
      int iterator=0;
      while (iterator<nums.length){
          if (nums[iterator]!=0){
              nums[index++]=nums[iterator];
          }
          iterator++;
      }
      while (index<nums.length){
          nums[index++]=0;
      }
      for (int x: nums){
          System.out.print(x+" ");
      }
    }
}
