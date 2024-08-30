package com.CodeHelp.Extra;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/permutations/description/
 */
public class E20_Permutation_LEETCODE {

    public static void main(String[] args) {

        int[] num1 = {1,2,3};
        int[] num2 = {0,1};

        List<List<Integer>> res = permute(num1);
        for (List<Integer> list : res) {
            printList(list);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        helper(nums,ans,0);

        return ans;

    }

    public static void helper(int[] nums, List<List<Integer>> ans, int index){

        if (index == nums.length){

            List<Integer> curr = new ArrayList<>();
            for (int x : nums){
                curr.add(x);
            }
            ans.add(curr);
            return;
        }

        for (int i = index; i < nums.length; i++){

            swap(nums,index,i);
            helper(nums,ans,index+1);
            swap(nums,index,i);

        }

    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
