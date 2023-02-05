package com.DSA.BinarySearch;

import java.util.HashMap;

public class BookAllocation {
    public static void main(String[] args) {
        int[] book =  {12, 34, 67, 90};
        find(book,5);
    }
    public static void find(int[] arr,int M){
        if(M>arr.length) System.out.println("Invalid");
        else {
            int start = 0;
            int end = 0;
            for (int x : arr) {
                end += x;
            }
            int ans = -1;
            int mid;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (isPossible(arr, M, mid)) {
                    ans = mid;
                    end = mid - 1;
                } else start = mid + 1;
            }
            System.out.println(ans);
        }
    }
    public static boolean isPossible(int[] arr ,int M, int mid){
        int sum=0;
        int count=1;
        for (int i=0;i<arr.length;i++){
            if (sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else {
                count++;
                if (count > M || arr[i] > mid) return false;
                sum = arr[i];
            }
        }
    return true;
    }
}
