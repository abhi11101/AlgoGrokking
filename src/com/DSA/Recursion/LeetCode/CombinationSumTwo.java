package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {
    public static void main(String[] args) {
        int[] arr = {2,5,2,1,2};
        Arrays.sort(arr);
        List<List<Integer>> ans = combinationSum2(arr,5);
        showList(ans);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        rec(candidates,target,0,curr,ans);
        return ans;
    }

    public static void rec(int[] candidates,int target,int ind,List<Integer> curr ,List<List<Integer>> ans){
        if (target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=ind;i<candidates.length;i++){
            if (candidates[i]>target)break;
            if (i>ind && candidates[i]==candidates[i-1])continue;
            curr.add(candidates[i]);
            rec(candidates,target-candidates[i],i+1,curr,ans);
            curr.remove(curr.size()-1);
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
