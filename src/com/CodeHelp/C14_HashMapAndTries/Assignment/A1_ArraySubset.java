package com.CodeHelp.C14_HashMapAndTries.Assignment;

import java.util.HashMap;
import java.util.Map;

public class A1_ArraySubset {

    public static void main(String[] args) {

        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};

        System.out.println(isSubset(a1,a2,a1.length,a2.length));

    }


    public static String isSubset( long a1[], long a2[], long n, long m) {

        Map<Long,Integer> map = new HashMap<>();

        for (long x : a1){
            map.put(x,map.getOrDefault(x,0) + 1);
        }

        for (long x : a2){

            if (map.containsKey(x) && map.get(x) > 0){
                map.put(x,map.get(x)-1);
            }else return "No";

        }

        return "Yes";
    }

}
