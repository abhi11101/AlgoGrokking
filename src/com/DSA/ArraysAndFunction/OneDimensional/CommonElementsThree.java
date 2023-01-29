package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsThree {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[] = {2,3,4,5};
        int arr3[] = {5,6,7};
        find(arr,arr2,arr3);
    }

    public static void find(int arr[], int arr2[],int arr3[]){
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        boolean same = false;
        for (int x : arr){   //O(n)
            set.add(x);      // O(1)
        }
        for (int x : arr2){  // O(n)
            if (set.contains(x))set1.add(x); //O(1)
        }
        for (int x : arr3){
            if (set1.contains(x)){
                same=true;
                System.out.print(x + " ");
            }
        }
        if (same==false) System.out.println("Nothing Common");
    }
}
