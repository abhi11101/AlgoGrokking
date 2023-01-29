package com.DSA.ArraysAndFunction.OneDimensional;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        find(arr,11);
    }

    public static void find(int arr[], int sum){
        int j = arr.length-1;
        int newT;

        for (int i = 0 ;i<arr.length;i++){
         newT = sum-arr[i];
         int k = i+1;
         while (k<j){
             if (arr[k]+arr[j]==newT){
                 System.out.println(arr[i]+ " " +arr[k] + " "+arr[j]);
                 k++;
             }
             else if (arr[k]+arr[j]<newT)k++;
             else j--;
         }
        }
    }
}
