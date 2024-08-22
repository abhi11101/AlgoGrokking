package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

/*
https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class A4_ReverseVowelsOfAString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {

        String vowel = "aeiouAEIOU";

        char[] charArray = s.toCharArray();
        int i =0;
        int j = s.length()-1;

        while (i<j){

            if (vowel.indexOf(charArray[i])==-1 ){
                i++;
                continue;
            }
            if (vowel.indexOf(charArray[j])==-1){
                j--;
                continue;
            }
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }

}
