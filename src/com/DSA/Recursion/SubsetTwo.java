package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetTwo {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,3};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println("Size "+ ans.size());
        showList(ans);

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        Arrays.sort(nums);
        rec(nums,0,ans,curr);
        return ans;
    }

    public static void rec(int[] nums, int index,List<List<Integer>> ans, List<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for (int i=index; i<nums.length;i++){
            if (i>index && nums[i]==nums[i-1])continue;
            curr.add(nums[i]);
            rec(nums,i+1,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
    private static void showList(List<List<Integer>> ans){
        for (List<Integer> l : ans){
            if (l.size()==0) System.out.print("{}");
            else{for (int x : l){
                System.out.print(x + " ");
            }}
            System.out.println();
        }
    }
}
