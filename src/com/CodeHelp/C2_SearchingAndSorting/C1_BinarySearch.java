package com.CodeHelp.C2_SearchingAndSorting;

public class C1_BinarySearch {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println(isPresent(arr,4));

    }


    public static int isPresent(int[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;
        int mid ;

        while (start<=end){

            mid = start + (end - start)/2;

            int element = arr[mid];

            if(element == num){
                return mid;
            }
            else if (element<num)start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

}
