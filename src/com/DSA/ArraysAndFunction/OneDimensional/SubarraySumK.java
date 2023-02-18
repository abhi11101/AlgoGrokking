package com.DSA.ArraysAndFunction.OneDimensional;

import java.util.HashMap;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,-4,-3,5,-6,6,1};
        find(arr,7);
    }

    private static void find(int[] arr, int k){
        HashMap<Integer,Integer> prefix =new HashMap<>();
        HashMap<Integer,Integer> index = new HashMap<>();
        prefix.put(0,1);
        int sum=0;
        int count=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
         if (prefix.containsKey(sum-k)){
             count+=prefix.get(sum-k);
             if (!index.containsKey(sum-k))System.out.println("Start 0"  + " End "+ i);
             else System.out.println("Start " +(index.get(sum-k)+1) + " End "+ i);
         }
         prefix.put(sum,prefix.getOrDefault(sum,0)+1);
         index.put(sum,i);
         //   System.out.println("Sum "+ sum + " i " + i);
        }
        System.out.println("Count "+ count);
    }
}
