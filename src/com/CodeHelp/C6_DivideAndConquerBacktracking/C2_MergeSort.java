package com.CodeHelp.C6_DivideAndConquerBacktracking;

public class C2_MergeSort {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 10,1,76,45,32,22};
        printArray(arr);
        sort(arr);
        printArray(arr);

    }


    public static void sort(int[] arr){

        mergeSort(arr,0,arr.length-1);

    }

    public static void mergeSort(int[] arr, int start, int end){

        if (start < end){

            int mid = start + (end - start)/2;

            mergeSort(arr,start,mid);

            mergeSort(arr,mid+1,end);

            mergeArray(arr,start,mid,end);

        }
    }

    public static void mergeArray(int[] arr, int start, int mid,  int end){

        int len1 = mid - start +1;
        int len2 = end - mid;

        int[] left = new int[len1];
        int[] right = new int[len2];

        int k = start;
        for (int i = 0; i < len1; i++){

            left[i] = arr[k];
            k++;
        }

        k= mid+1;
        for (int i = 0; i < len2; i++){
            right[i] = arr[k];
            k++;
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = start;

        while (leftIndex < len1 && rightIndex < len2){

            if (left[leftIndex] <= right[rightIndex]){
                arr[mainIndex] = left[leftIndex];
                leftIndex++;
            }
            else {
                arr[mainIndex] = right[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }

        while (leftIndex < len1){
            arr[mainIndex] = left[leftIndex];
            leftIndex++;
            mainIndex++;
        }
        while (rightIndex < len2){
            arr[mainIndex] = right[rightIndex];
            rightIndex++;
            mainIndex++;
        }
    }

    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
