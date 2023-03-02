package com.DSA.ArraysAndFunction.LeetCode;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int unique=0;
        int j=1;
        int n = nums.length;
       while (j<n){
           int val = nums[unique];
           System.out.println("Val "+ val);
           while (j<n){
               if (nums[j]==val)
               j++;
               else break;
           }
           System.out.println("Uni "+ unique);
           System.out.println("J "+ j);
           if (j<n){unique+=1;
           nums[unique]=nums[j];
           j++;}
       }
        return unique+1;
    }

}
