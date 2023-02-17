package com.DSA.Recursion;

import java.util.*;

public class ArrayPowerSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Deque<Integer> list = new ArrayDeque<>();
//        find(arr,0,list);
        List<List<Integer>> ans = new ArrayList<>();
        ans =leetCode(arr);
        showList(ans);
    }

    public static void find(int[] input, int i, Deque<Integer> output){
        if (i==input.length){
            show(output);
            return;
        }
        output.addLast(input[i]);
        find(input,i+1,output);
        output.removeLast();
        find(input,i+1,output);

    }
    private static void show(Deque<Integer> output){
        if (output.size()==0) System.out.print("{}");
        else {
        for (int x : output){
            System.out.print(x + " ");
        }}
        System.out.println();
    }
    private static List<List<Integer>> leetCode(int[] n){
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rec(n,0,curr,ans);
        return ans;
    }
    private static void rec(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans){
        if (i==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        rec(arr,i+1,curr,ans);
        curr.remove(curr.size()-1);
        rec(arr,i+1,curr,ans);
    }
    private static void showList(List<List<Integer>> list){
        for (List<Integer> l : list){
            if (l.size()==0) System.out.println("{}");
            else{for (int x : l){
                System.out.print(x+" ");
            }}
            System.out.println();
        }
    }
}
