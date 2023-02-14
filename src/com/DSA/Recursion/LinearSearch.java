package com.DSA.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,4,arr.length,0));
    }

    private static boolean search(int[] arr,int target, int size, int i){
        if (size==0)return false;
        if (arr[i]==target)return true;
        boolean ans = search(arr,target,size-1,i+1);
        return ans;
    }
}
