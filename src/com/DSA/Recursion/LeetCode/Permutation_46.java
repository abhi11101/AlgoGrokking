package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutation_46 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = permute(arr);
        System.out.println("Size "+ ans.size());
        showList(ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
     // rec(nums,ans,curr,flag);
        work(0,nums,ans);
        return ans;
    }
    public static void rec(int[] nums, List<List<Integer>> ans, List<Integer> curr, boolean[] flag){
        if (curr.size()== nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (!flag[i]){
                flag[i]=true;
                curr.add(nums[i]);
                rec(nums,ans,curr,flag);
                curr.remove(curr.size()-1);
                flag[i]=false;
            }
        }
    }
    private static void work(int index, int[] nums,List<List<Integer>> ans){
        if (index==nums.length){
            List<Integer> curr = new ArrayList<>();
            for (int x : nums){
                curr.add(x);
            }
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=index;i< nums.length;i++){
        swap(i,index,nums);
        work(index+1,nums,ans);
        swap(i,index,nums);
        }
    }
    private static void swap(int i, int j, int[] nums){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
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
