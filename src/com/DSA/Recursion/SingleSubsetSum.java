package com.DSA.Recursion;

import java.util.ArrayDeque;
import java.util.Deque;

public class SingleSubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        Deque<Integer> list = new ArrayDeque<>();
        find(arr,0,list,7,0);
    }

    private static boolean find(int[] arr, int i, Deque<Integer> list, int sum , int current_sum){
        if (i==arr.length){
            if (current_sum==sum){
                show(list);
                return true;
            }else return false;
        }
            list.addLast(arr[i]);
            current_sum+=arr[i];
            if (find(arr,i+1,list,sum,current_sum))return true;
            list.removeLast();
            current_sum-=arr[i];
            if (find(arr,i+1,list,sum,current_sum))return true;

        return false;
    }

    private static void show(Deque<Integer> list){
        for (int x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
