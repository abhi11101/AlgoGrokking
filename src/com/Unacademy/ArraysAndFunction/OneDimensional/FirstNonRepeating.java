package com.Unacademy.ArraysAndFunction.OneDimensional;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

    //https://www.geeksforgeeks.org/non-repeating-element/?ref=lbp
    public static void main(String[] args) {
    int arr[] = {7,2,6,5,2,5,3,3,7,1,6,5};
    find(arr);
    }

    public static void find(int arr[]){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        boolean unique =false;
        for(int x: arr){
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }

        for (int x : arr){
            if (hashMap.get(x)==1){
                System.out.println(x);
                unique=true;
                break;
            }
        }
        if (!unique) System.out.println("Nothing unique");

    }
}
