package com.CodeHelp.C2_SearchingAndSorting;

public class C4_FindMissingElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(findMissing(arr));

    }


    public static int findMissing(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans=-1;

        while (start<=end){

            mid = start + (end - start)/2;
            int element = arr[mid];
            if (element == mid+1){
                start=mid+1;

            }else{
               ans = element-1;
               end = mid-1;

            }

        }
        return ans;
    }

}
