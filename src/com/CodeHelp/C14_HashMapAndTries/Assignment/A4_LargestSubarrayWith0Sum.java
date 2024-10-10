package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.HashMap;
import java.util.Map;

public class A4_LargestSubarrayWith0Sum {

    public static void main(String[] args) {

        int[] arr1 = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr1,8));

        int[] arr2 = {1, 0, -4, 3, 1, 0};
        System.out.println(maxLen(arr2,6));

    }

    public static int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> map  = new HashMap<>();
        map.put(0,-1);
        int sum=0;

        int max = 0;
        for (int i = 0; i < n; i++){

            sum+=arr[i];

            if (map.containsKey(sum)){

                int current =  i - map.get(sum);
                max = Math.max(max,current);

            }else {
                map.put(sum,i);
            }

        }
        return max;
    }

}
