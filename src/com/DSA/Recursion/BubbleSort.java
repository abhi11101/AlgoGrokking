package com.DSA.Recursion;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,51,9,6,3,8,2};
        sort(arr,arr.length);
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
    private static void sort(int[] arr, int size){
        if (size==0 || size==1)return;
        for (int i=0;i<size-1;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            sort(arr,size-1);
        }
    }
}
