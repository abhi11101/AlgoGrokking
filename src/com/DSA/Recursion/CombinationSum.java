package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        List<List<Integer>> ans =new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
//        findAllPairs(arr,list,8,0,0);
 //        ans = leetCode(arr,8);
        otherApproach(arr,8,0,ans,list);
         showList(ans);
    }

    private static void otherApproach(int[] arr, int target, int i, List<List<Integer>> ans,List<Integer> curr){
        if (i==arr.length){
            if (target==0)ans.add(new ArrayList<>(curr));
            return;
        }
        if (arr[i]<=target){
            curr.add(arr[i]);
            otherApproach(arr,target-arr[i],i,ans,curr);
            curr.remove(curr.size()-1);
        }
        otherApproach(arr,target,i+1,ans,curr);
    }
    private static void findAllPairs(int[] arr, ArrayList<Integer> list, int sum, int i, int s){
        if (i==arr.length || s==sum){
                if (s==sum)show(list);
            return;
        }
        if (s+arr[i]<=sum){
            list.add(arr[i]);
            s+=arr[i];
            findAllPairs(arr,list,sum,i,s);
            list.remove(list.size()-1);
            s-=arr[i];
            findAllPairs(arr,list,sum,i+1,s);
        }else {
            findAllPairs(arr,list,sum,i+1,s);
        }
    }
    public static List<List<Integer>> leetCode(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rec(candidates,target,0,0,ans,curr);
        return ans;
    }

    public static void rec(int[] candidates,int target, int s ,int i,List<List<Integer>> ans,List<Integer> curr){
       if (i==candidates.length || s==target){
           if (s==target){
               ans.add(new ArrayList<>(curr));
           }
           return;
       }
       if (s+candidates[i]<=target){
           curr.add(candidates[i]);
           s+=candidates[i];
           rec(candidates,target,s,i,ans,curr);
           curr.remove(curr.size()-1);
           s-=candidates[i];
           rec(candidates,target,s,i+1,ans,curr);
       }else{
           rec(candidates,target,s,i+1,ans,curr);
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
    private static void show(ArrayList<Integer> list){
        if (list.size()==0) System.out.print("{}");
        else {for (int x : list){
            System.out.print(x+ " ");
        }}
        System.out.println();
    }
}
