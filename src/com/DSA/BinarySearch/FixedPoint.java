package com.DSA.BinarySearch;

public class FixedPoint {
    // https://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/
    public static void main(String[] args) {
      int[] arr = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
      find(arr);
    }

    public static int find(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if (arr[mid]==mid){
                System.out.println(mid);
                return mid;
            }
            else if (arr[mid]>mid)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
