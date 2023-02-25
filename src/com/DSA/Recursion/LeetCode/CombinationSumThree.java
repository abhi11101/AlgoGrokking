package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumThree {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(3,7,1,ans,new ArrayList<>());
  //      System.out.println(ans.size());
        show(ans);
    }

    private static void rec(int k, int n, int index, List<List<Integer>> ans, List<Integer> curr){
        if (curr.size()==k){
            if (n==0)ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=index;i<=9;i++){
            if (i>n)break;
            curr.add(i);
            rec(k,n-i,i+1,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
    private static void show(List<List<Integer>> ans){
        for (List<Integer> list : ans){
            for (int x : list){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
