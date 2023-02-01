package com.DSA.ProgrammingBasic.SlidingWindow;

import java.util.HashSet;

public class LongestSubarrayK {
    public static void main(String[] args) {
        int[] arr= {3,2,1,1,1,1,1,5};
        find(arr,5);
    }
    public static void find(int arr[], int k){
        int i=0,j=0,sum=0;
        HashSet<Integer> set = new HashSet<>();
        while (j<arr.length && i<=j) {
            if (arr[j]==k) System.out.println(arr[j]);
            if (sum==k){
                System.out.println("I " + i + " J "+ j);
                j++;
            }
            if (sum>k){
                sum-=arr[i];
                i++;
            }
            if (sum<k){
                j++;
            }
            sum+=arr[j];
        }
    }
}
