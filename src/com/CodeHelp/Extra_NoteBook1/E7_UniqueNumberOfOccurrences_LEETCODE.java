package com.CodeHelp.Extra_NoteBook1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
https://leetcode.com/problems/unique-number-of-occurrences/description/
 */
public class E7_UniqueNumberOfOccurrences_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,1,3};
        int[] arr2 = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            set.add(entry.getValue());
        }

        return set.size() == map.size();

    }

}
