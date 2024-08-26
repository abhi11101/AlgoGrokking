package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

public class A6_PrintAllSubArraysUsingRecursion {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        printAllSubArrays(arr);

    }

    public static void printAllSubArrays(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            printAllSubArraysWork(arr,i,i);
            System.out.println("-----------------");

        }

    }

    public static void printAllSubArraysWork(int[] arr, int start , int end) {

        if (end == arr.length) {
            return;
        }
        printArray(arr,start, end);
        printAllSubArraysWork(arr, start, end+1);

    }

    public static void printArray(int[] arr, int start ,  int end) {

        while (start <= end) {
            System.out.print(arr[start] + " ");
            start++;
        }
        System.out.println();
    }


}
