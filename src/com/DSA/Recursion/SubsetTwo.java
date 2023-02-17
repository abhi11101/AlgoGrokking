package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetTwo {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        showList(ans);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        rec(nums,0,curr,ans);
        return ans;
    }
    private static void rec(int[] nums, int index,List<Integer> curr,List<List<Integer>> ans ){
        if (index==nums.length){
            ans.add(curr);
            return;
        }

    }
    private static void showList(List<List<Integer>> ans){
        for (List<Integer> l : ans){
            for (int x : l){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
