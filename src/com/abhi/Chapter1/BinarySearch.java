package com.abhi.Chapter1;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int array[] = {10,40,67,99,102,453};
        for (int i=0;i<10;i++){
            arr[i]=i;
        }
        System.out.println(binary(array,100));
    }
    public static String binary(int arr[], int key){
        int first = 0;
        int last = arr.length-1;
        int mid = (last + first)/2;
        while(first<=last){
             if (arr[mid]==key)return "Position: " + (mid+1) + " Index: " + mid;
            if (key<arr[mid]){
                last =mid-1;
                mid = (last+first)/2;
            }
            if (key>arr[mid]){
                first = mid+1;
                mid = (last+first)/2;
            }
        }
        return "Not Present";
    }
}
