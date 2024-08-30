package com.CodeHelp.C6_DivideAndConquerBacktracking;

public class C3_QuickSort {

    public static void main(String[] args) {

        int[] arr = {34,54,1,12,32,78,65,99};
        printArray(arr);
        sort(arr, 0, arr.length-1);
        printArray(arr);

    }


    public static void sort(int[] arr, int start, int end){

        if (start < end){


            int pivot = partition(arr, start,end);

            sort(arr, start, pivot - 1);

            sort(arr, pivot + 1, end);

        }

    }

    public static int partition(int[] arr, int start, int end){

        int pivotIndex = start;
        int pivotElement = arr[start];

        int count = 0;

        for (int i = start+1; i <=end; i++){

            if (arr[i]<=pivotElement){
                count++;
            }

        }

        int correctIndex = start + count;
        swap(arr,pivotIndex,correctIndex);
        pivotIndex = correctIndex;

        int i = start;
        int j = end;

        while (i< pivotIndex && j> pivotIndex){

            while (arr[i]<=pivotElement){
                i++;
            }
            while (arr[j]>pivotElement){
                j--;
            }

            if ( i < pivotIndex && j>pivotIndex){
                swap(arr,i,j);
            }

        }

        return pivotIndex;

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
