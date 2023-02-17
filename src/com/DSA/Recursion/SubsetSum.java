package com.DSA.Recursion;

import java.util.ArrayDeque;
import java.util.Deque;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        System.out.println(find(arr,14,0));

    }

    public static boolean find(int[] arr, int sum, int i){
        if (sum<0 || i==arr.length)return false;
        if (sum==0)return true;
        boolean ans = find(arr,sum-arr[i],i+1) || find(arr,sum,i+1);
        return ans;
    }


}
