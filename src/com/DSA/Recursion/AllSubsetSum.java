package com.DSA.Recursion;

import java.util.ArrayDeque;
import java.util.Deque;

public class AllSubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2,6,1};
        Deque<Integer> list = new ArrayDeque<>();
        findAllPairs(arr,list,7,0);
    }
    private static void findAllPairs(int[] arr, Deque<Integer> list, int sum, int i){
        if (i==arr.length){
            if (sum==0){
                show(list);
            }
            return;
        }
        list.addLast(arr[i]);
        findAllPairs(arr,list,sum-arr[i],i+1);
        list.removeLast();
        findAllPairs(arr,list,sum,i+1);
    }

    private static void show(Deque<Integer> list){
        if (list.size()==0) System.out.print("{}");
        else {for (int x : list){
            System.out.print(x+ " ");
        }}
        System.out.println();
    }
}
