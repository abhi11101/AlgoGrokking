package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumThree {
    public static void main(String[] args) {
        List<Integer> curr= new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int[] arr= {2,3};
        find(arr,0,ans,curr);
        System.out.println("Showing subsets");
        show(ans);
        findSum(ans,result);
        Collections.sort(result);
        System.out.println("Sum of Each subset");
        showList(result);
    }

    private static void find(int[] arr, int i, List<List<Integer>> ans, List<Integer> curr){
        if (i==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        find(arr,i+1,ans,curr);
        curr.remove(curr.size()-1);
        find(arr,i+1,ans,curr);
    }

    private static void findSum(List<List<Integer>> list, ArrayList<Integer> result){
        int sum;
        for (List<Integer> l : list){
            sum=0;
            if (l.size()==0)result.add(0);
            else {
                for (int x : l){
                sum+=x;
            }
            result.add(sum);
            }
        }
    }

    private static void show(List<List<Integer>> list){
        for (List<Integer> l : list){
            if (l.size()==0) System.out.print("{}");
            for (int x :l){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }

    private static void showList(ArrayList<Integer> list){
        for (int x : list){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
