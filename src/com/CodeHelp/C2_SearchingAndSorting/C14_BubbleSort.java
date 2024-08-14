package com.CodeHelp.C2_SearchingAndSorting;

public class C14_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {8,2,7,4,1,9,67,43,12,34,5};
        printArray(arr);
        sortArray(arr);
        printArray(arr);

    }

    public static void sortArray(int[] arr){

        int n  = arr.length;

        for (int i = 1; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    swapped=true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        // Condition to check if already sorted
            if (!swapped) {
                break;
            }

        }

    }

    private static void printArray(int[] arr) {

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
