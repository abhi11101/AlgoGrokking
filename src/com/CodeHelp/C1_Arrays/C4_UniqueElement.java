package com.CodeHelp.C1_Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class C4_UniqueElement {

    public static void main(String[] args) {

        int[] data = {1, 2, 4, 2, 1, 3, 6, 5, 5, 6, 4};

        usingSet(data);
        usingMap(data);
        usingXOR(data);
    }

    public static void usingSet(int [] data){

        Set<Integer> set = new HashSet<>();

        for (int num: data){
            if (set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        System.out.println(set);

    }

    public static void usingMap(int [] data){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: data){
            map.put(num, map.getOrDefault(num, 0) +1);
            System.out.println(map);
        }
        System.out.println(map);
        for (int num: data){
            if (map.get(num)==1){
                System.out.println(num);
                break;
            }
        }

    }

    public static void usingXOR(int [] data){

        int ans = 0; // 0^num = num, num^num=0
        for (int num: data){
            ans ^= num;
        }
        System.out.println(ans);

    }

}
