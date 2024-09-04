package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/permutations-ii/
 */
public class A7_Permutations2_LEETCODE {

    public static void main(String[] args) {

        int[] num = {1,2,3};
        List<List<Integer>> res = permuteUnique(num);
        for (List<Integer> list : res) {
            printList(list);
        }


    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        recur(nums,list,sublist,arr);
        return list;
    }

    public static void recur(int[] nums,List<List<Integer>> list,List<Integer> sublist,boolean[] arr){
        if(sublist.size() == nums.length){
            list.add(new ArrayList<>(sublist));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]||i>0 && nums[i]==nums[i-1] && !arr[i-1])continue;
            sublist.add(nums[i]);
            arr[i] = true;
            recur(nums,list,sublist,arr);
            sublist.remove(sublist.size()-1);
            arr[i] = false;
        }
    }

    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
