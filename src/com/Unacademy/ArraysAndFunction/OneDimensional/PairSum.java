package com.Unacademy.ArraysAndFunction.OneDimensional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {1,4,7,2,5,6,3};
        find(arr,9);
    }

    public static void find(int arr[], int sum){
        int i =0;
        Arrays.sort(arr);
        int j = arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]==sum){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
            }
            else if (arr[i]+arr[j]>sum)j--;
            else i++;
        }
    }
}
