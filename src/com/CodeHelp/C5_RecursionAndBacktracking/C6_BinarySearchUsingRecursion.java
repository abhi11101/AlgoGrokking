package com.CodeHelp.C5_RecursionAndBacktracking;

public class C6_BinarySearchUsingRecursion {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,0,arr.length-1,7));


    }


    public static int binarySearch(int[] arr, int start, int end, int target){

        if (start>end){
            return -1;
        }

        int mid  = start + (end - start)/2;

        if (arr[mid] == target){
            return mid;
        }

        if (arr[mid] > target){
            return binarySearch(arr, start, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, end, target);


    }

}
