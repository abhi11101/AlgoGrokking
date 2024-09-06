package com.CodeHelp.Extra;

import java.util.ArrayList;
import java.util.List;

public class E34_SubsetSum {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = printSubset(arr,8);
        for (List<Integer> list : ans) {
            printList(list);
        }

    }

    public static List<List<Integer>> printSubset(int[] arr, int sum){

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(arr,sum,0,ans,subset);
        return ans;
    }

    public static void helper(int[] arr, int sum, int index, List<List<Integer>> ans, List<Integer> subset){

        if (index == arr.length || sum==0){

            if (sum==0){
                ans.add(new ArrayList<>(subset));
            }
            return;
        }

        subset.add(arr[index]);
        helper(arr,sum-arr[index],index+1,ans,subset);
        subset.removeLast();
        helper(arr,sum,index+1,ans,subset);

    }

    private static void printList(List<Integer> list){

        for (int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
