package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/single-number/description/
 */
public class E48_SingleNumber_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {

        int ans =0;
        for (int x : nums){
            ans^=x;
        }
        return ans;
    }

}
