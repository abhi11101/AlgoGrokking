package com.DSA.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,90,arr.length,0));
    }

    private static boolean search(int[] arr,int target, int size, int i){
        if (i==size)return false;
        if (arr[i]==target)return true;
        boolean ans = search(arr,target,size,i+1);
        return ans;
    }
}
