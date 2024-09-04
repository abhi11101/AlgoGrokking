package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

public class A1_CountInversion {

    public static void main(String[] args) {

        long[] arr = {2, 4, 1, 3, 5};
        long[] arr2 = {8,4,2,1};
        long[] arr3 = {57, 38, 91, 10, 38, 28, 79, 41};
        System.out.println(inversionCount(arr,5));
        System.out.println(inversionCount(arr2,4));
        System.out.println(inversionCount(arr3,8));

    }

    public static long inversionCount(long arr[], int n) {

        long ans = mergeSort(arr, 0, n - 1);
        return ans;
    }

    public static long mergeSort(long[] arr, int start, int end){

        int count =0;

        if (start<end) {
            int mid = start + (end - start) / 2;

            count += mergeSort(arr, start, mid);
            count += mergeSort(arr, mid + 1, end);

            count += mergeArray(arr, start, mid, end);
        }
        return count;


    }

    public static long mergeArray(long[] arr, int start, int mid, int end) {

        long count = 0;
        int len1 = mid - start + 1;
        int len2 = end - mid;

        long[] left = new long[len1];
        long[] right = new long[len2];

        int k = start;

        for (int i = 0; i < len1; i++) {
            left[i] = arr[k];
            k++;
        }

        k = mid+1;

        for (int i = 0; i < len2; i++) {
            right[i] = arr[k];
            k++;
        }

        int leftIndex =0;
        int rightIndex =0;
        int mainIndex = start;


        while (leftIndex < len1 && rightIndex < len2) {

            if (left[leftIndex] <= right[rightIndex]) {

                arr[mainIndex] = left[leftIndex];
                leftIndex++;

            }
            else {
                arr[mainIndex] = right[rightIndex];
                rightIndex++;

                count+= len1 - leftIndex;
            }
            mainIndex++;

        }

        while (leftIndex < len1) {
            arr[mainIndex] = left[leftIndex];
            leftIndex++;
            mainIndex++;
        }

        while (rightIndex < len2) {
            arr[mainIndex] = right[rightIndex];
            rightIndex++;
            mainIndex++;
        }

        return count;
    }

}
