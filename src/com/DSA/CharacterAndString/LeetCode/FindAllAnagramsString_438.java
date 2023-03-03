package com.DSA.CharacterAndString.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsString_438 {

    //    https://leetcode.com/problems/find-all-anagrams-in-a-string/
    public static void main(String[] args) {
        String s = "abab";
        String p ="ab";
        List<Integer> ans = findAnagrams(s,p);
        showList(ans);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int ws =p.length();
        int[] base = new int[26];
        for (int i=0;i<ws;i++){
            char c = p.charAt(i);
            base[c-'a']++;
        }
        int i=0;
        int index =0;
        int[] window = new int[26];
        while (i<ws && i<s.length()){
            char c = s.charAt(i);
            window[c-'a']++;
            i++;
        }
        if (check(base,window)){
            ans.add(i-ws);
        }
        while (i<s.length()){
            int newChar = s.charAt(i)-'a';
            window[newChar]++;
            int oldChar = s.charAt(i-ws)-'a';
            window[oldChar]--;
            i++;
            if (check(base,window)){
                ans.add(i-ws);
            }
        }
        return ans;
    }

    private static boolean check(int[] base, int[] window){
        for (int i=0;i<26;i++){
            if (base[i]!=window[i])return false;
        }
        return true;
    }

    private static void showList(List<Integer> ans){
        for (int x : ans){
            System.out.println(x);
        }
    }
}
