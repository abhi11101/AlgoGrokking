package com.CodeHelp.Extra;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 */
public class E43_FindAllAnagramsinString_LEETCODE {

    public static void main(String[] args) {

        List<Integer> ans = findAnagrams("cbaebabacd","abc");
        for (int i :ans){
            System.out.print(i+" ");
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        if (s.length()<p.length())return ans;

        int sLen = s.length();
        int pLen = p.length();
        int[] sFreq = new int[26];
        int[] pFreq = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int sIndex =0;

        while (sIndex < sLen && sIndex<pLen) {

            char c = s.charAt(sIndex);
            sFreq[c-'a']++;
            sIndex++;

        }
        if (isSame(sFreq,pFreq)) {
            ans.add(sIndex-pLen);
        }

        while (sIndex < sLen) {

           char newChar = s.charAt(sIndex);
            System.out.println("new char " + newChar);
           sFreq[newChar-'a']++;

           char oldChar = s.charAt(sIndex-pLen);
           System.out.println("old char " + oldChar);
           sFreq[oldChar-'a']--;

           if (isSame(sFreq,pFreq)) {
               System.out.println("Is same");
               System.out.println("Sindex " + sIndex);
               ans.add(sIndex-pLen+1);
           }
           sIndex++;

        }

        return ans;
    }

    public static boolean isSame(int[] sFreq, int[] pFreq) {

        for (int i =0; i<26 ;i++){
            if (sFreq[i] != pFreq[i]){
                return false;
            }
        }
        return true;
    }

}
