package com.CodeHelp.Extra_NoteBook1;

import java.util.Arrays;

/*

 */
public class E75_ProductOfArrayExceptSelf_LEETCODE {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};
        int[] ans1 = productExceptSelf(nums1);
        printArray(ans1);

        int[] nums2 = {-1,1,0,-3,3};
        int[] ans2 = productExceptSelf(nums2);
        printArray(ans2);

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] =1;
        right[nums.length-1]=1;

        for (int i=0;i<nums.length-1;i++){

            left[i+1] = left[i]*nums[i];
        }

        for (int i = nums.length-1;i>=1;i--){
            right[i-1] = right[i]*nums[i];
        }

        int[] ans = new int[nums.length];

        for (int i=0;i<nums.length;i++){
            ans[i] = left[i]*right[i];
        }

        return ans;
    }

    public static int[] faster(int[] nums) {

        int[] ans = new int[nums.length];

        int left =1;
        for (int i=0;i<nums.length;i++){
            ans[i] = left;
            left *= nums[i];
        }

        int right =1;
        for (int i = nums.length-1;i>=0;i--){
            ans[i]*=right;
            right *= nums[i];
        }
        return ans;
    }
    public static void printArray(int[] arr){

        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

}
