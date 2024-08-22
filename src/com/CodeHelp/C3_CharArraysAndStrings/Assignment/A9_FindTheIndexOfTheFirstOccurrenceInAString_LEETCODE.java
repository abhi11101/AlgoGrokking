package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 */
public class A9_FindTheIndexOfTheFirstOccurrenceInAString_LEETCODE {


    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        int n  = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {

            for (int j = 0; j < m; j++) {

                if (haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if (j == m-1){
                    return i;
                }

            }

        }
        return -1;
    }


}
