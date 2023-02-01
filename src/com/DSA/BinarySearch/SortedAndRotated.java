package com.DSA.BinarySearch;

public class SortedAndRotated {
    public static void main(String[] args) {
    int[] arr= {3,5,1};
   // find(arr,11);
    for(int i=0;i<arr.length;i++){
        find(arr,arr[i]);
    }
    }

    public static void find(int A[], int key){
        int start=0;
        int end=A.length-1;
        int mid;
        while (start<=end){
        mid =start + (end-start)/2;
        if (A[mid]==key){
            System.out.println(mid);
            break;
        }
        else if (A[mid]>=A[start]){
            if (key>=A[start] && key<A[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }else{
            if (key<=A[end] && key>A[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

        }

    }
}
