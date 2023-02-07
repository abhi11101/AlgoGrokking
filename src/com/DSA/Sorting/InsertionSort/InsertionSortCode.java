package com.DSA.Sorting.InsertionSort;

public class InsertionSortCode {
    public static void main(String[] args) {
        int[] arr= {7,3,8,2,0,3,56,1,574,4};
        show(arr);
        sort(arr,arr.length);
        show(arr);
    }
    public static void sort(int[] arr,int n){
    for (int i=1;i<n;i++){
        int key =arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    }

    public static void show(int[] arr){
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }


}
