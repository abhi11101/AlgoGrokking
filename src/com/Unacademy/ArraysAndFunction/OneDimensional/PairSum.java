package com.Unacademy.ArraysAndFunction.OneDimensional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairSum {
    public static void main(String[] args) {
        int arr[] = {49, 50,48, 24, 99, 51, 33, 39, 29, 83, 74, 72, 22, 46, 40, 51, 67, 37, 78, 76, 26, 28,
                76, 25, 10, 65, 64, 47, 34, 88, 26, 49, 86, 73, 73, 36, 75, 5, 26, 4, 39, 99, 27, 12, 97, 67,
                63, 15, 3, 92, 90};
        int num[] = {1,5,7,1};
       // find(arr,50);
        check(num,6);
    }

    public static void find(int arr[], int sum){
        int i =0;
        Arrays.sort(arr);
        int j = arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]==sum){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
            }
            else if (arr[i]+arr[j]>sum)j--;
            else i++;
        }
    }
    public static void check(int arr[], int sum){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count=0;
        for (int i=0;i<arr.length;i++){
            int new_sum=sum-arr[i];
            if (hashMap.containsKey(new_sum)){
                count+=hashMap.get(new_sum);
            }
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);
    }
}
