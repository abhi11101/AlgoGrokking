package com.CodeHelp.C13_Heap;

public class C4_HeapSort {

    public static void main(String[] args) {

        int[] arr = {-1,12,15,13,11,14};
        printArray(arr);
        buildHeap1Based(arr,arr.length);
        heapSort1Based(arr,arr.length);
        printArray(arr);


        int[] arr2 = {-1,12,56,43,6,78,87,5,44,3,23};
        printArray(arr2);
        buildHeap1Based(arr2,arr2.length);
        heapSort1Based(arr2,arr2.length);
        printArray(arr2);

    }


    public static void heapSort1Based(int[] arr, int n) {

        while (n!=1){

            int temp = arr[1];
            arr[1] = arr[n-1];
            arr[n-1] = temp;
            n--;
            heapify1Based(arr,n,1);
        }
    }

    public static void heapify1Based(int[] arr, int n, int index) {

        int left = 2*index;
        int right = 2*index+1;

        int largest = index;

        if (left<n && arr[left]>arr[largest]) largest = left;

        if (right<n && arr[right]>arr[largest]) largest = right;

        if (largest != index) {

            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            index = largest;
            heapify1Based(arr,n,index);
        }
    }

    public static void buildHeap1Based(int[] arr, int n){

        for (int i = (n-1)/2;i>0;i--){
            heapify1Based(arr,n,i);
        }
    }

    public static void printArray(int[] arr){

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
