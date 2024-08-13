package com.CodeHelp.C2_SearchingAndSorting;

public class C3_LastOccurrenceOfElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,6,7,9,9,9};
        System.out.println(lastOccur(arr,4));
    }

    public static int lastOccur(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans =-1;

        while (start<=end){

            mid = start + (end - start)/2;
            int element= arr[mid];

            if (element==key){
                ans=mid;
                start=mid+1;
            }
            else if (element>key){
                end=mid-1;
            }else {
                start=mid+1;
            }


        }
        return ans;
    }

}
