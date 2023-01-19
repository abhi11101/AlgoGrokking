package com.Unacademy.ArraysAndFunction.OneDimensional;

public class MinimizeHeightTwo {

    //https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        height(arr,5,arr.length);
    }

    public static void height(int arr[],int k,int n){
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            if (arr[i]<min)min=arr[i];
            if (arr[i]>max)max=arr[i];
        }
       if (max-k<0)max+=k;
       else max-=k;
       min+=k;
        System.out.println("\nMax " + max + " Min " + min);
        System.out.println("Minimum Difference " + (max-min));

    }
}
