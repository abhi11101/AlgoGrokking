package com.DSA.ArraysAndFunction.OneDimensional;


public class Leader {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,0};
        find(arr);
    }
    public static void find(int arr[]){
        int i=0,j=arr.length-1;
        while (i<=j && j<arr.length){
            if (i==arr.length-1){
                System.out.println(arr[i]);
                break;
            }
            if (i==j){
                System.out.println(arr[i]);
                i++;
                j=arr.length-1;
            }
            if(arr[i]>arr[j])j--;
            else if (arr[i]<arr[j]){
                i++;
                j=arr.length-1;
            }
        }
    }
}
