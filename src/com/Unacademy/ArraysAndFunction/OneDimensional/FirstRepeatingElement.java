package com.Unacademy.ArraysAndFunction.OneDimensional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstRepeatingElement {

 //https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5,3,4};
        find(arr);
    }

    public static void find(int arr[]){
        HashSet<Integer> hashSet = new HashSet<>();
        int min =-1;
        for (int i =arr.length-1;i>0;i--){
            if (hashSet.contains(arr[i])){
                min=i;
            }
            else{
                hashSet.add(arr[i]);
            }
        }
        System.out.println(arr[min]);


    }
}
