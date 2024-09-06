package com.CodeHelp.Extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/subsets-ii/description/
 */
public class E27_Subsets2_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<List<Integer>> ans  = subsetsWithDup(nums);
        for (List<Integer> list : ans) {
            printList(list);
        }

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);
        helper(nums,0,curr,ans);

        return ans;

    }

    public static void helper(int[] nums, int index, List<Integer> curr, List<List<Integer>> ans) {

        ans.add(new ArrayList<>(curr));
        for (int i=index; i<nums.length;i++){
            if (i!=index && nums[i]==nums[i-1])continue;
            curr.add(nums[i]);
            helper(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);
        }


    }
    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
