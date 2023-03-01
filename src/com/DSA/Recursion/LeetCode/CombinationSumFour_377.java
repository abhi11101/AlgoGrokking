package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumFour_377 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        //Arrays.sort(nums);
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();
        rec(nums,target,ans,new ArrayList<>());
        show(ans);
      //  System.out.println(combinationSum4(nums,target));
    }
    //public static int combinationSum4(int[] nums, int target) {
    //        return rec(nums,target,0);
   // }

    public static int rec(int[] nums, int target, List<List<Integer>> ans , List<Integer> curr){
        if (target==0 ){
            ans.add(new ArrayList<>(curr));
            return 1;
        }
        int count =0;
        for (int i =0; i<nums.length;i++){
            if (nums[i]>target)break;
            curr.add(nums[i]);
            rec(nums,target-nums[i],ans,curr);
            curr.remove(curr.size()-1);
        }
        return count;
    }
    private static void show(List<List<Integer>> ans){
        for (List<Integer> list : ans){
            for (int x : list){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
