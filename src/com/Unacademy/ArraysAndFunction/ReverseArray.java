package com.Unacademy.ArraysAndFunction;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArr(arr);
        reverse(arr,arr.length);
        printArr(arr);
    }

    public static int[] reverse(int arr[], int size){
        int res[] = new int[size];
        int temp=0;
        for (int i=0;i<size/2;i++){
            temp=arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        return arr;
    }

    public static void printArr(int arr[]){
        for (int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
