package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

import java.util.HashMap;

/*
https://leetcode.com/problems/reorganize-string/description/
 */
public class A6_ReorganizeString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(reorganizeString("eqmeyggvp"));
    }

    public static String reorganizeString(String s) {

        HashMap<Character,Integer> hashMap = new HashMap<>();
        int max = 0;
        char maxChar = 0;
        for (char c : s.toCharArray()) {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
            if (hashMap.get(c)>max){
                max = hashMap.get(c);
                maxChar = c;
            }
        }
        System.out.println("Maxchar " + maxChar);
        int index =0;
        char[] charArray = new char[s.length()];
        while (index < charArray.length && max >0){
            charArray[index] = maxChar;
            max--;
            index+=2;

        }
        System.out.println("max " + max);
        if (max>0)return "";

        index = 1;
        int sIndex =0;
        while (index < charArray.length && sIndex < s.length()){

            if (s.charAt(sIndex) != maxChar && charArray[index] != maxChar){
                charArray[index] = s.charAt(sIndex);
                index++;
                sIndex++;
            }
            else if (charArray[index]==maxChar){
                index++;
            }else {
                sIndex++;
            }

        }
        for (char c : charArray){
            System.out.print(c + " ");
        }
        System.out.println();
        return new String(charArray);

    }


}
