package com.CodeHelp.C1_Arrays.Assignment;

import java.util.HashSet;
import java.util.Set;

/*

https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class A3_FindDuplicate_LEETCODE {

    // Optimal solution is with binary search

    public static void main(String[] args) {

        int[] a= {1,3,4,2,2};
        int[] b = {3,1,3,4,2};
        int[] c = {3,3,3,3,3};
//        System.out.println(usingSet(a));
        System.out.println(swapping(c));
    }



    public static int swapping(int[] nums){
    //        int i =0;
    //        for (int j=0;j<nums.length;j++){
    //
    //            int val = nums[nums[i]];
    //            if (nums[i]==val){
    ////                System.out.println("if");
    //                return nums[i];
    //            }else {
    ////                System.out.println("else");
    //                int temp = nums[nums[i]];
    //                nums[nums[i]] = nums[i];
    //                nums[i] = temp;
    //            }
    ////            printArray(nums);
    //
    //        }
    //        return -1;

        while (nums[0]!=nums[nums[0]]){
            int temp = nums[nums[0]];
            nums[nums[0]]=nums[0];
            nums[0]=temp;
        }
        return nums[0];
    }

    public static int usingSet(int[] nums){

        Set<Integer> set = new HashSet<>();

        for ( int num : nums){

            if (set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;

    }

    private static void printArray(int[] arr) {

        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
