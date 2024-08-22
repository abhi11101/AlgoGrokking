package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

import java.util.Arrays;
import java.util.HashMap;

/*
https://leetcode.com/problems/isomorphic-strings/description/
 */
public class A5_IsomorphicStrings_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));

    }

    public static boolean isIsomorphic(String s, String t) {

        int[] s_to_t = new int[256];
        int[] t_to_s = new int[256];

        Arrays.fill(s_to_t, -1);
        Arrays.fill(t_to_s, -1);

        for (int i = 0; i < s.length(); i++) {

            char st = s.charAt(i);
            char ts = t.charAt(i);

            if (s_to_t[st]==-1 && t_to_s[ts]==-1){
                s_to_t[st]=ts;
                t_to_s[ts]=st;
            }else if (s_to_t[st] != ts && t_to_s[ts] != st){
                return false;
            }
        }
        return true;
    }

}
