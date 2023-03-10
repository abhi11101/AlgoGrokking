package com.DSA.CharacterAndString.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc","baba"));
        System.out.println(faster("paper","title"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())return false;
        HashMap<Character,Character> Freq = new HashMap<>();
        HashMap<Character,Boolean> Used = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (Freq.containsKey(c)){
                if (Freq.get(c)!=d)return false;
            }else {
                if (Used.containsKey(d))return false;
                else {
                    Freq.put(c, d);
                    Used.put(d,true);
                }
            }
        }
        return true;
    }
    private static boolean faster(String s, String t){
        int[] s_to_t = new int[256];
        int[] t_to_s = new int[256];

        Arrays.fill(s_to_t,-1);
        Arrays.fill(t_to_s,-1);

        for (int i=0;i<s.length();i++){
            char st = s.charAt(i);
            char ts = t.charAt(i);

            if (s_to_t[st]==-1 && t_to_s[ts]==-1){
                s_to_t[st]=ts;
                t_to_s[ts]=st;
            }else if (s_to_t[st]!=ts && t_to_s[ts]!=st){
                return false;
            }
        }
        return true;
    }
}
