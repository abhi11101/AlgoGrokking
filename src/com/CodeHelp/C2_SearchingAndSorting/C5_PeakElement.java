package com.CodeHelp.C2_SearchingAndSorting;

public class C5_PeakElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {5,6,7,8,9,10,3,2,1};
        System.out.println(peakFind(arr));
        System.out.println(peakFind(b));
        System.out.println(peakFind(c));
    }


    public static int peakFind(int[] arr){

        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start<end){

            mid = start+(end-start)/2;

            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }else {
                end=mid;
            }

        }
        return start;
    }

}
