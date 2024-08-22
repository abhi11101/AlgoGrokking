package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

import java.util.HashMap;

/*
https://leetcode.com/problems/valid-anagram/description/
 */
public class A1_ValidAnagram_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat","car"));
        System.out.println(fasterWay("anagram", "nagaram"));
        System.out.println(fasterWay("rat","car"));
    }

    public static boolean fasterWay(String s, String t) {

        if (s.length() != t.length()) return false;
        char[] charArray = new char[26];

        for (char c : s.toCharArray()) {

            charArray[c - 'a']++;

        }

        for (char c : t.toCharArray()) {
            charArray[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charArray[i] != 0) return false;
        }

        return true;
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);
            if (!map.containsKey(c) || map.get(c)==0) return false;
            else{
                map.put(c, map.getOrDefault(c, 0) - 1);
            }

        }
        return true;

    }

}
