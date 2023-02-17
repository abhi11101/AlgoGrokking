package com.DSA.Recursion;

import java.util.Deque;

public class CountSubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12,1, 5, 2,6};
        System.out.println(find(arr,0,6,0));
    }

    private static int find(int[] arr, int i,  int sum, int current_sum){
        if (i==arr.length){
            if (current_sum==sum)return 1;
            return 0;
        }
        current_sum+=arr[i];
        int ans = find(arr,i+1,sum,current_sum);
        current_sum-=arr[i];
        ans +=find(arr,i+1,sum,current_sum);
        return ans;
    }
}
