package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArraySubset {

    //https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 1, 1};
        int arr2[] = {1, 2, 3, 1};
     //   System.out.println(subset(arr,arr2));
        System.out.println(duplicates(arr,arr2));
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
    public static boolean duplicates(int arr[], int arr2[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (int x : arr2){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer,Integer> m : map1.entrySet()){
        //    System.out.println(m.getKey());
            if (map.containsKey(m.getKey())){
               // System.out.println("If " + map.containsKey(m.getKey()));
                if (map.get(m.getKey())<m.getValue())return false;
            }
            else return false;
        }
        return true;
    }
}
