package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

import java.util.Arrays;
import java.util.HashMap;

/*
https://leetcode.com/problems/distribute-repeating-integers/
 */
public class A9_DistributeRepeatingIntegers_LEETCODE {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,4};
        int[] quantity1 = {2};
        System.out.println(canDistribute(num1,quantity1));

        int[] num2 = {1,2,3,3};
        int[] quantity2 = {2};
        System.out.println(canDistribute(num2,quantity2));

        int[] num3 = {1,1,2,2};
        int[] quantity3 = {2,2};
        System.out.println(canDistribute(num3,quantity3));

        int[] num4 = {1,1,2,2,1};
        int[] quantity4 = {2,3};
        System.out.println(canDistribute(num4,quantity4));

    }

    public static boolean canDistribute(int[] nums, int[] quantity) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int[] freq = new int[map.size()];
        int index =0;
        for (int x : map.values()) {
            freq[index] = x;
            index++;
        }

        Arrays.sort(quantity);
        return helper(freq,quantity,quantity.length-1);
    }


    public static boolean helper(int[] freq, int[] quantity, int iCustomer){

        if (iCustomer<0){
            return true;
        }

        int need = quantity[iCustomer];
        for (int i = 0; i <freq.length ; i++){
            if (freq[i]<need || (i>0 && freq[i]==freq[i-1]))continue;
            freq[i]-=need;
            if (helper(freq,quantity,iCustomer-1)){return true;}
            freq[i]+=need;
        }
        return false;
    }


    private static void printArray(int[] nums){

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

}
