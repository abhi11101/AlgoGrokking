package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode_1207 {

// https://leetcode.com/problems/unique-number-of-occurrences/description/
    public static void main(String[] args) {
    int arr[] = {1,2,3};
        System.out.println(unique(arr));
    }

    public static boolean unique(int arr[]){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int x : arr){
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (Map.Entry<Integer,Integer> m : hashMap.entrySet()){
            hashSet.add(m.getValue());
        }
        if (hashSet.size()==hashMap.size())return true;
        else return false;
    }
}
