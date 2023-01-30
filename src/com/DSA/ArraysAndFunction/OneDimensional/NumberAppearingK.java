package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearingK {
    public static void main(String[] args) {
        int[] arr= {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(arr,2));
    }
    public static int firstElementKTime(int[] a, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : a){
      //      System.out.println("X " + x);
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
           //     System.out.println("X "+ x+ " map.get " + map.get(x));
                if(map.get(x)==k)return x;

            }
            else{
                map.put(x,1);
            }
            for (Map.Entry m : map.entrySet()){
                m.getKey();
            }
        }
        return -1;

    }
}
