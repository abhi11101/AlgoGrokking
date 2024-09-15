package com.CodeHelp.Extra_NoteBook1;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/custom-sort-string/description/
 */
public class E13_CustomSortString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(customSortString("bcafg","abcd"));
        System.out.println(customSortString("kqep","pekeq"));
        System.out.println(faster("bcafg","abcd"));
        System.out.println(faster("kqep","pekeq"));

    }

    public static String customSortString(String order, String s) {

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i =0; i<order.length();i++){

            char ch = order.charAt(i);

            while (map.getOrDefault(ch,0)>0){
                sb.append(ch);
                map.put(ch,map.get(ch)-1);
            }

        }
        for (char ch : map.keySet()){

            int count = map.get(ch);

            while (count>0){

                sb.append(ch);
                count--;

            }

        }
        return sb.toString();
    }

    public static String faster(String order, String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (char c : order.toCharArray()){
            int count  = freq[c-'a'];
            while (count>0){
                sb.append(c);
                count--;
            }
            freq[c-'a']=0;

        }

        for (int i =0;i<26;i++){

            int count = freq[i];
            while (count>0) {
                sb.append((char)(i + 'a'));
                count--;

            }

        }

        return sb.toString();


    }



}
