package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/combination-sum/description/
 */
public class A5_CombinationSum_LEETCODE {

    public static void main(String[] args) {

        int[] candidates = {2,3,6,7};
        List<List<Integer>> ans = combinationSum(candidates, 7);
        for (List<Integer> list : ans) {
            printList(list);
        }


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        findSum(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }

    public static void findSum(int[] candidates, int target, int index, List<List<Integer>> ans,List<Integer> curr) {

        if (index==candidates.length || target==0){
            if (target==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        if (candidates[index]<=target){
            curr.add(candidates[index]);
            findSum(candidates,target-candidates[index],index,ans,curr);
            curr.remove(curr.size()-1);
        }
        findSum(candidates,target,index+1,ans,curr);

    }

    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
