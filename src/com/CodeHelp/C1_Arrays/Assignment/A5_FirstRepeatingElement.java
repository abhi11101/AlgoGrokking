package com.CodeHelp.C1_Arrays.Assignment;

import java.util.HashSet;

public class A5_FirstRepeatingElement {

    public static void main(String[] args) {

        int[] data = {1,5,3,4,3,5,6};
        usingSet(data);
    }

    public static void usingSet(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        int res =0;
        for(int i =nums.length-1; i>=0; i--){

            if (set.contains(nums[i])){
                res =i;
            }else {
                set.add(nums[i]);
            }

        }
        System.out.println("Value is " + nums[res] + " at index " + (res+1));



    }

}
