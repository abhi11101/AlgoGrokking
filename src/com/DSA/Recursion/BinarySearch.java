package com.DSA.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(search(arr,34,0,arr.length-1));
    }

    private static boolean search(int[] arr, int target, int start, int end){
       if (start>end)return false;
       int mid = start + (end-start)/2;
       if (arr[mid]==target)return true;
       if (arr[mid]<target){
          return search(arr,target,mid+1,end);
       }
       else  return search(arr,target,start,mid-1);
    }
}
