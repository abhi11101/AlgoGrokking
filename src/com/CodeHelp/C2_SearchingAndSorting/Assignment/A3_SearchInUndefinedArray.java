package com.CodeHelp.C2_SearchingAndSorting.Assignment;

public class A3_SearchInUndefinedArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,9));

    }


    public static int search(int[] arr, int target){

        int start =0;
        int end =1;
        int mid;
        int val = arr[end];

        while (val<=target){

            start = end;
            end = end*2;
            val = arr[end];

        }

        while (start<=end){

            mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

}
