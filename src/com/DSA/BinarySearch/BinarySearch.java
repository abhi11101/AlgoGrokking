package com.DSA.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,87,654};
        System.out.println(search(arr,87));
    }

    public static boolean search(int arr[], int num){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            //mid=(start+end)/2;
            mid = start/2 + end/2; // for case of integer overflowing, if start and end contains max value
            if (arr[mid]==num)return true;
            else if (arr[mid]<num)start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}
