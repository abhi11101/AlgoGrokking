package com.Unacademy.ArraysAndFunction.OneDimensional;

public class Duplicate_N_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,8,9};
        System.out.println(duplicate(arr,9));
    }

    public static int duplicate(int arr[], int size){
        int sum1=0;
        int sum2 = (size*(size+1))/2;
        for (int x : arr){
            sum1+=x;
        }
        return sum1-sum2;
    }
}
