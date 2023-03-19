package com.DSA.ArraysAndFunction.LeetCode;

public class RotateArrayByN_189 {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotate(arr,2);
        show(arr);
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k=k%n; //Because if k>n then when k==n , the array will become as original array
//        if k=10 and n=7 , we are rotating values by k distance but when k=7 , the array will be same ,
//        so basically we need k%n=3 times rotate
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);

    }

    public static void reverse(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    public static void show(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
