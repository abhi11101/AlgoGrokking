package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermutationsTwo_47 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        HashSet<List<Integer>> ans = new HashSet<>();
     //   rec(nums,0,ans);
    //    System.out.println("size "+ ans.size());
        List<List<Integer>> res = new ArrayList<>(ans);
     //   System.out.println("arr "+ res.size());
        faster(nums,res,new ArrayList<>(),new boolean[nums.length]);
        show(res);
    }
    private static void faster(int[] nums, List<List<Integer>> ans ,List<Integer> curr, boolean[] data){
        if (curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (data[i] || i>0 && nums[i]==nums[i-1] && !data[i-1] )continue;
            if (!data[i]){
                data[i]=true;
                curr.add(nums[i]);
                faster(nums,ans,curr,data);
                data[i]=false;
                curr.remove(curr.size()-1);
            }
        }
    }
    private static void rec(int[] nums, int index, HashSet<List<Integer>> ans){
        if (index==nums.length){
            List<Integer> curr = new ArrayList<>();
            for (int x : nums){
                curr.add(x);
            }
            ans.add(curr);
            return;
        }
        for (int i=index;i<nums.length;i++){
            swap(nums,index,i);
            rec(nums,index+1,ans);
            swap(nums,index,i);
        }
    }
    private static void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private static void show(List<List<Integer>> ans){
        for (List<Integer> list : ans){
            for (int x : list){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
