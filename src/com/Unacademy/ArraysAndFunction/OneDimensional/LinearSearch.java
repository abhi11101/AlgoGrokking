package com.Unacademy.ArraysAndFunction.OneDimensional;

public class LinearSearch {
    public static void main(String[] args) {
         int arr[] = {2,7,1,0,43,6};
        System.out.println(search(arr,56));
    }

    public static String search(int arr[], int num){
        for (int x : arr){
            if (x==num) return  "Present";
        }
        return "Not Present";
    }
}
