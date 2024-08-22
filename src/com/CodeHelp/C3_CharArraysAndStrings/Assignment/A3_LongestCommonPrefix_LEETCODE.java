package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

import java.util.Arrays;

/*
https://leetcode.com/problems/longest-common-prefix/description/
 */
public class A3_LongestCommonPrefix_LEETCODE {

    public static void main(String[] args) {

        String[] st1 = {"flower","flow","flight"};
        String[] st2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(st1));


    }

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i =0 ;i<first.length;i++){

            if (first[i] != last[i]){
                break;
            }
            sb.append(first[i]);

        }

        return sb.toString();


    }

}
