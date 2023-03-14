package com.DSA.ArraysAndFunction.LeetCode;

public class ValidMountainArray_941 {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr){
        if (arr.length<1)return false;
        int inc=0;
        int dec=0;
        int index=1;
        while (index<arr.length && arr[index]>arr[index-1]){
            inc++;
            index++;
        }
        while (index<arr.length && arr[index]<arr[index-1]){
            dec++;
            index++;
        }
        return inc>0 && dec>0 && (inc+dec==arr.length-1);
    }
}
