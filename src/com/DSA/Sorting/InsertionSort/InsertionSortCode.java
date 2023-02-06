package com.DSA.Sorting.InsertionSort;

public class InsertionSortCode {
    public static void main(String[] args) {
        int[] arr= {7,3,8,2,0,3,56,1,574,4};
        show(arr);
        sort(arr,arr.length);
        show(arr);
    }
    public static void sort(int[] arr,int n){

    }

    public static void show(int[] arr){
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }


}
