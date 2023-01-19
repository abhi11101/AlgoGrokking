package com.Unacademy.ArraysAndFunction.OneDimensional;

public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,4,97,8};
        maxMin(arr);
    }

    public static void maxMin(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int x : arr){
            if (x>max) max =x;
            if (x<min) min =x;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }


}
