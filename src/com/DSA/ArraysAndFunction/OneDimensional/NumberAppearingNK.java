package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearingNK {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 4, 5, 5, 5, 5 };
        int k = 4;
        find(arr,k);
    }
    public static void find(int arr[],int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int freq=arr.length/k;
        for (int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            if (m.getValue()>freq) System.out.println(m.getKey());
        }
    }
}
