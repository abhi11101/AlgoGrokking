package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashSet;

public class ArraySubset {

    //https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {4,5,6,78};
        System.out.println(subset(arr,arr2));
    }

    public static boolean subset(int arr[], int arr2[]){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : arr){
           hashSet.add(x);
       }
       for (int x : arr2){
           if (!hashSet.contains(x))return false;
       }
       return true;
    }
}
