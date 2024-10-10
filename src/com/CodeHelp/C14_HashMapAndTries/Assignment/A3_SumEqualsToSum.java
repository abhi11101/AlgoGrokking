package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.HashMap;
import java.util.Map;

public class A3_SumEqualsToSum {

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 7, 1, 2, 9, 8};
        System.out.println(findPairs(nums1));

    }

    public static boolean findPairs(int arr[]) {

        Map<Integer,Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];
                if (map.containsKey(sum))return true;

                map.put(sum,true);
            }
        }

        return false;
    }

}
