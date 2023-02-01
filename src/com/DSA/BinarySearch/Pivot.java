package com.DSA.BinarySearch;

public class Pivot {
    public static void main(String[] args) {
        int[] arr= {5, 6, 7, 8, 9, 10, 3, 2, 1};
        find(arr);
    }

    public static void find(int arr[]){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<end){
            mid=start+(end-start)/2;
          //  System.out.println("Mid" + mid);
            if(arr[mid]<arr[mid+1]){start=mid+1; // arr[mid]>arr[0]
               System.out.println("If " + start);}
            else {end=mid;
                System.out.println("Else " + end);}
        }
        System.out.println(start);
    }
}
