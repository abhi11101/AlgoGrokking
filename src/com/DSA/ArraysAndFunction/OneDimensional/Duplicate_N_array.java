package com.DSA.ArraysAndFunction.OneDimensional;

public class Duplicate_N_array {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4};
        System.out.println(duplicate(arr,arr.length-1));
    }

    public static int duplicate(int arr[], int n){

        int sum1=0;
        int sum2 = (n*(n+1))/2;
        for (int x : arr){
            sum1+=x;
        }
        return sum1-sum2;
    }
}
