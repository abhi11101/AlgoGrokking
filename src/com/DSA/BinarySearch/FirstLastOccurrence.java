package com.DSA.BinarySearch;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,50,50,50,60,70,80,90};
        first(arr,50);
    }
    public static void first(int arr[], int target){
        int firstIndex=-1;
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if (arr[mid]==target){
                firstIndex=mid;
                end=mid-1;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        System.out.println(firstIndex);
        last(arr,target);
    }
    public static void last(int arr[],int target){
        int lastIndex=-1;
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if (arr[mid]==target){
                lastIndex=mid;
                start=mid+1;
            }
            else if (arr[mid]<target)start=mid+1;
            else end=mid-1;
        }
        System.out.println(lastIndex);
    }
}
