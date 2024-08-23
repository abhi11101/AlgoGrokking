package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/permutation-in-string/description/
 */
public class E17_PermutationInString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(checkInclusion("ab","eidbaooo"));
        System.out.println(checkInclusion("ab","eidboaoo"));


    }

    public static boolean checkInclusion(String s1, String s2) {

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        int s1Length = s1.length();
        int s2Length = s2.length();

        for (int i =0;i<s1Length;i++){
            s1Freq[s1.charAt(i)-'a']++;
        }

        int index =0;

        while(index <s1Length && index < s2Length){

            s2Freq[s2.charAt(index)-'a']++;
            index++;
        }

        if (check(s1Freq,s2Freq))return true;

        while (index<s2Length){

            char newChar = s2.charAt(index);
            s2Freq[newChar-'a']++;

            char oldChar  = s2.charAt(index-s1Length);
            s2Freq[oldChar-'a']--;

            if (check(s1Freq,s2Freq)){return true;}
            index++;


        }
        return false;
    }


    public static boolean check(int[] s1Freq, int[] s2Freq) {

        for (int i=0;i<26;i++){

            if (s1Freq[i] != s2Freq[i])return false;
        }
        return true;

    }

}
