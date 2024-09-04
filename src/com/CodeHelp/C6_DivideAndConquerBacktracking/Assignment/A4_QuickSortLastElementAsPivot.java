package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

public class A4_QuickSortLastElementAsPivot {

    public static void main(String[] args) {

        int[] arr = {5,1,23,43,21,12,78,8,7,32};
        printArray(arr);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }


    public static void quickSort(int[] arr, int start, int end) {


        if (start >= end) {return;}
        int pivot = end;
        int i = start-1;
        int j =start;

        while (j<pivot){
            if (arr[j]<arr[pivot]){
                i++;
                swap(arr,i,j);
            }
            j++;
        }
        i++;
        swap(arr,i,pivot);

        quickSort(arr,start,i-1);
        quickSort(arr,i+1,end);

    }

    public static void swap(int[] arr, int i, int j) {
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
