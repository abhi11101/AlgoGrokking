package com.CodeHelp.Extra_NoteBook1;

import java.util.HashMap;

/*
https://leetcode.com/problems/contiguous-array/
 */
public class E78_ContiguousArray_LEETCODE {

    public static void main(String[] args) {

        int[] nums1 = {0,1,0};
        System.out.println(findMaxLength(nums1));

        int[] nums2 = {0,0,1,0,0,0,1,1};
        System.out.println(findMaxLength(nums2));

    }

    public static int findMaxLength(int[] nums) {
        int ans =0;
        int sum=0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,-1);

        for (int i=0;i< nums.length;i++){
            if (nums[i]==0){
                sum-=1;
            }
            else if (nums[i]==1){
                sum+=1;
            }
            if (freq.containsKey(sum) ){
                ans= Math.max(ans, (i-freq.get(sum)));
            }
            else freq.put(sum,i);
        }
        return ans;
    }

}
