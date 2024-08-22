package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

/*

 */
public class A11_StringCompression_LEETCODE {

    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));

    }

    public static int compress(char[] chars) {

        int ansIndex =0;
        int previousCharIndex = 0;
        int count =0;

        while (previousCharIndex < chars.length) {

            int newCharIndex = previousCharIndex+1;

            while (newCharIndex < chars.length && chars[newCharIndex] == chars[previousCharIndex]) {
                newCharIndex++;
            }

            chars[ansIndex] = chars[previousCharIndex];
            ansIndex++;
            count = newCharIndex-previousCharIndex;


            if (count>1){
                String s = Integer.toString(count);
                for (int i =0;i<s.length();i++){
                    chars[ansIndex] = s.charAt(i);
                    ansIndex++;
                }
            }
            previousCharIndex = newCharIndex;

        }
        return ansIndex;
    }

}
