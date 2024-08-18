package com.CodeHelp.C3_CharArraysAndStrings;

/*
https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/
 */
public class C3_RemoveAllOccurrencesOfSubstring_LEETCODE {

    public static void main(String[] args) {

        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s,part));
        System.out.println(removeOccurrences2(s,part));

    }

    public static String removeOccurrences(String s, String part) {

        int i  = s.indexOf(part);

        if (i ==-1)return s;

        s = s.substring(0,i) + s.substring(i+part.length());
        return removeOccurrences(s, part);


    }

    public static String removeOccurrences2(String s, String part) {

        while (s.contains(part)) {
            int i = s.indexOf(part);
            s = s.substring(0,i) + s.substring(i+part.length());

        }

        return s;
    }

}
