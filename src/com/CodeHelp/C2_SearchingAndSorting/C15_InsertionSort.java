package com.CodeHelp.C2_SearchingAndSorting;

public class C15_InsertionSort {

    public static void main(String[] args) {

        int[] arr = {8,2,7,4,1,9,67,43,12,34,5};
        printArray(arr);
        sortInsertion(arr);
        printArray(arr);

    }

    public static void sortInsertion(int[] arr){

        for (int i =1 ; i < arr.length ; i++){

            int val = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;

            printArray(arr);
        }


    }

    private static void printArray(int[] arr) {

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
