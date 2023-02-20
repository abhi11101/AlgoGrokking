package com.DSA.Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,7,1,9,3,8,2};
        sort(arr,0,arr.length-1);
        show(arr);
    }

    private static void sort(int[] arr, int start, int end){
        if(start>=end)return;

        int pivotIndex = partition(arr,start,end);

        sort(arr,start,pivotIndex-1);
        sort(arr,pivotIndex+1,end);

    }
    private static int partition(int[] arr, int start, int end){

        int pivot = arr[start];
        int count=0;

        for (int i=start+1 ;i<arr.length;i++){
            if (arr[i]<=pivot)
                count++;
        }

        int pivotIndex = start+count;

        swap(arr,pivotIndex,start);

        int left =start;
        int right = end;

        while (left<pivotIndex && right>pivotIndex){

            while (arr[left]<=pivot){
                left++;
            }
            while (arr[right]>pivot){
                right--;
            }

            if (left<pivotIndex && right>pivotIndex){
                swap(arr,left,right);
                left++;
                right--;
            }
        }

        return pivotIndex;
    }

    private static void swap(int[] arr, int firstIndex , int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex]= arr[secondIndex];
        arr[secondIndex]=temp;
    }

    private static void show(int[] arr){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
