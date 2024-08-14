package com.CodeHelp.C2_SearchingAndSorting;

public class C13_SelectionSort {

    public static void main(String[] args) {

        int[] arr = {8,2,7,4,1,9,67,43,12,34,5};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;

            for (int j=i+1;j<arr.length;j++){

                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    private static void printArray(int[] arr) {

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
