package com.DSA.BinarySearch;

public class SearchInUndefinedArray {
    public static void main(String[] args) {
        int[] arr= new int[10000];
        for (int i=0; i<10000;i++){
            arr[i]=i;
        }
        find(arr,6785);
    }
    public static void find(int arr[],int target){
        int start=0;
        int end=1;
        int mid;
        int val=arr[end];
        while (val<target){
            start=end;
            end=end*2;
            val=arr[end];
        }
        System.out.println("Start "+ start + " End "+ end);
        while (start<=end){
            mid=start+(end-start)/2;
            if (arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if (arr[mid]<target)start=mid+1;
            else end=mid-1;
        }
    }
}
