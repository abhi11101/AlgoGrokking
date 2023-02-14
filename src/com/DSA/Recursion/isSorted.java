package com.DSA.Recursion;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sorted(arr,arr.length,0));
    }

    private static boolean sorted(int[] arr, int size, int i){
        if (size==0 || size==1)return true;
        if (arr[i]>arr[i+1])return false;
        else {boolean ans = sorted(arr,size-1,i+1);
        return ans;}
    }
}
