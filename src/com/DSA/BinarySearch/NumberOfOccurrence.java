package com.DSA.BinarySearch;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,50,50,50,60,70,80};
        System.out.println(find(arr,10));
    }
    public static int find(int arr[],int target){
        int firstIndex=-1;
        int lastIndex=-1;
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end) {
        mid=(start+end)/2;
        if (arr[mid]==target){
            firstIndex=mid;
            end=mid-1;
        } else if (arr[mid]<target) start=mid+1;
        else end=mid-1;
        }
        start=0;
        end=arr.length-1;
        while (start<=end) {
            mid=(start+end)/2;
            if (arr[mid]==target){
                lastIndex=mid;
                start=mid+1;
            } else if (arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        if (lastIndex+firstIndex<0)return 0;
        else return lastIndex-firstIndex+1;
    }
}
