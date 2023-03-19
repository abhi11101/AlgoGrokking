package com.DSA.ArraysAndFunction.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {

    //https://www.geeksforgeeks.org/majority-element/
    public static void main(String[] args) {
            int arr[] = {1,2,3,2,1,1,1,1};
         //   find(arr);
            MooreMajorityVotingAlgo(arr);
    }

    public static void find(int arr[]){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int majority = arr.length/2;
        boolean flag=false;
        for (int x : arr){
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer,Integer> m: hashMap.entrySet()){
            if (m.getValue()>majority){
                System.out.println(m.getKey());
                flag=true;
                break;
            }
        }
        if (!flag) System.out.println("No Majority Element");
    }

    public static void MooreMajorityVotingAlgo(int arr[]){
        int vote =0;
        int candidate =0;
        int count=0;
        for (int x: arr){
            if (vote==0){
                candidate=x;
                vote=1;
            } else if (x==candidate) {
                vote++;
            }
            else vote--;
        }
        for (int x : arr){
            if (x==candidate)count++;
        }
        if (count>arr.length/2) System.out.println("Majority Element is " + candidate);
        else System.out.println("No Majority Element");
    }
}
