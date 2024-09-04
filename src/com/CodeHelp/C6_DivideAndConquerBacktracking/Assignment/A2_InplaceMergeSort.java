package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

public class A2_InplaceMergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 10,1,76,45,32,22};
        printArray(arr);
        inplaceMergeSort(arr,0,arr.length-1);
        printArray(arr);

    }

    public static void inplaceMergeSort(int[] arr, int start, int end) {
        if (start>=end)return;
        int mid = start + (end - start) / 2;
        inplaceMergeSort(arr,start,mid);
        inplaceMergeSort(arr,mid+1,end);

        mergeInplace(arr,start,end);

    }

    public static void mergeInplace(int[] arr, int start, int end) {

        int totalLen = end - start + 1;
        int gap = totalLen / 2 + totalLen%2;

        while (gap >0){

            int i = start, j = start + gap;
            while (j<=end){
                if (arr[i]>arr[j]){
                    swap(arr,i,j);
                }
                i++;
                j++;
            }
            gap = gap<=1 ? 0 : (gap/2)+(gap%2);

        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
