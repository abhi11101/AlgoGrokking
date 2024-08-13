package com.CodeHelp.C2_SearchingAndSorting;

public class C2_FirstOccurrenceOfElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,4,4,6,7,9,9,9};
        System.out.println(firstOccur(arr,4));

    }


    public static int firstOccur(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        int res = -1;
        while (start<=end){

            mid = start + (end - start)/2;

            int element = arr[mid];

            if (element==target){
                res=mid;
                end = mid-1;
            }
            else if (element>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return res;

    }

}
