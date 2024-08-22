package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

/*
https://leetcode.com/problems/reverse-only-letters/description/
 */
public class A2_ReverseOnlyLetters_LEETCODE {

    public static void main(String[] args) {

        String s1 = "ab-cd";
        String s2 = "a-bC-dEf-ghIj";
        String s3 = "Test1ng-Leet=code-Q!";

        System.out.println(reverseOnlyLetters(s3));

    }

    public static String reverseOnlyLetters(String s) {

        char[] charArray = s.toCharArray();
        int i =0;
        int j = charArray.length-1;

        while (i<j){

            if (!((charArray[i]>=65 && charArray[i]<=90) || (charArray[i]>=97 && charArray[i]<=122))){
                i++;
                continue;
            }
            if (!((charArray[j]>=65 && charArray[j]<=90) || (charArray[j]>=97 && charArray[j]<=122))){
                j--;
                continue;
            }
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] =temp;
            i++;
            j--;

        }

        return new String(charArray);
    }

}
