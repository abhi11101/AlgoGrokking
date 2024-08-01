package com.CodeHelp.C1_Arrays;

/*
https://leetcode.com/problems/majority-element/description/
 */

public class C9_MajorityElement_LEETCODE {

    public static void main(String[] args) {

        int[] data = {2,2,1,1,1,2,2};

        int res = majorityElement(data);
        System.out.println(res);

    }

    public static int majorityElement(int[] nums) {

        int vote =0;
        int candidate=0;

        for(int x : nums){

            if(vote==0){
                candidate =x;
                vote++;
            }
            else if(x==candidate){
                vote++;
            }else{
                vote--;
            }
        }

        return candidate;

    }

}
