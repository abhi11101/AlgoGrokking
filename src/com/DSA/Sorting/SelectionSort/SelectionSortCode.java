package com.DSA.Sorting.SelectionSort;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {4,9,2,6,1,0,3,7,8};
        show(arr);
        sort(arr,arr.length);
        show(arr);
    }

    public static void sort(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            int minIndex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minIndex])
                    minIndex=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void show(int[] arr){
        for (int x: arr){
            System.out.print(x+ " ");
        }
        System.out.println();
    }
}
