package com.Unacademy.ArraysAndFunction;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        find(arr);
    }

    public static void find(int arr[]){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            hashMap.put(arr[i],hashMap.get(arr[i])+1);
        }
        for (Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
