package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
https://leetcode.com/problems/group-anagrams/
 */
public class A7_GroupAnagrams_LEETCODE {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams2(String[] strs) {


        HashMap< int[],List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] hash = new int[256];
            for (int i = 0; i < str.length(); i++) {
                hash[str.charAt(i)]++;
            }

            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);


        }

        return new ArrayList<>(map.values());
    }

}
