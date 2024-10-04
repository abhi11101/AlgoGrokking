package com.CodeHelp.C13_Heap;

public class C11_MergeTwoBinaryMaxHeaps {

    public static void main(String[] args) {

        int[] a = {10, 5, 6, 2};
        int[] b = {12, 7, 9};

        int[] ans = mergeHeaps(a,b,a.length,b.length);

        for (int x : ans){
            System.out.print(x+ " ");
        }
        System.out.println();

    }

    public static int[] mergeHeaps(int[] a, int[] b, int n, int m) {

        int[] ans = new int[n+m];
        int index =0;

        for (int x : a){
            ans[index++] = x;
        }
        for (int x : b){
            ans[index++] = x;
        }

        for (int i = (n+m)/2 -1;i>=0;i--){
            heapify(ans,n+m,i);
        }
        return  ans;

    }

    public static void heapify(int[] arr, int size , int index) {

        int left = index*2+1;
        int right = index*2+2;

        int largest = index;

        if (left<size && arr[left]>arr[largest]){
            largest = left;
        }
        if (right<size && arr[right]>arr[largest]){
            largest = right;
        }

        if (largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(arr,size,largest);
        }
    }
}
