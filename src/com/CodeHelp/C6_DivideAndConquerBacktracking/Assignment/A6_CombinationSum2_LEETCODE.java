package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://leetcode.com/problems/combination-sum-ii/
 */
public class A6_CombinationSum2_LEETCODE {

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        List<List<Integer>> ans = combinationSum2(candidates, 8);
        for (List<Integer> list : ans) {
            printList(list);
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findSum(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }

    public static void findSum(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> temp) {

        if (index==candidates.length || target ==0){
            if (target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (candidates[i]>target)break;

            if (i>index && candidates[i]==candidates[i-1]){continue;}

            temp.add(candidates[i]);
            findSum(candidates,target-candidates[i],i+1,ans,temp);
            temp.remove(temp.size()-1);

        }

    }
    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
