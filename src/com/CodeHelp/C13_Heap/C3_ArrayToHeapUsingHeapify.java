package com.CodeHelp.C13_Heap;

public class C3_ArrayToHeapUsingHeapify {

    public static void main(String[] args) {

        int[] arr = {-1,12,15,13,11,14};

        printArray(arr);
        buildHeap(arr,arr.length);
        printArray(arr);

        int[] arr2 = {-1,12,56,43,6,78,87,5,44,3,23};
        printArray(arr2);
        buildHeap(arr2,arr2.length);
        printArray(arr2);


        int[] arr3 = {12,15,13,11,14};

        printArray(arr3);
        buildHeap0Based(arr3,arr3.length);
        printArray(arr3);

        int[] arr4 = {12,56,43,6,78,87,5,44,3,23};
        printArray(arr4);
        buildHeap0Based(arr4,arr4.length);
        printArray(arr4);
    }

    public static void buildHeap(int[] arr, int n){

        for (int i = (n-1)/2;i>0;i--){
            heapify(arr,n,i);
        }
    }

    public static void heapify(int[] arr, int n, int index){

        int leftIndex = 2*index;
        int rightIndex = 2*index+1;

        int largest = index;

        if (leftIndex < n && arr[leftIndex] > arr[largest]){
            largest = leftIndex;
        }
        if (rightIndex < n && arr[rightIndex] > arr[largest]){
            largest = rightIndex;
        }

        if (largest !=   index){

            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            index = largest;
            heapify(arr, n, index);
        }

    }


    public static void buildHeap0Based(int[] arr, int n){

        for (int i = n/2-1;i>=0;i--){
            heapify0Based(arr,n,i);
        }

    }

    public static void heapify0Based(int[] arr, int n, int index){

        int left = 2*index+1;
        int right = 2*index+2;

        int largest = index;
        if (left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest !=   index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            index = largest;
            heapify0Based(arr, n, index);
        }


    }
    public static void printArray(int[] arr){

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}