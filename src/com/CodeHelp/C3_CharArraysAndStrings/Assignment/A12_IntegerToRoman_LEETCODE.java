package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

/*
https://leetcode.com/problems/integer-to-roman/description/
 */

public class A12_IntegerToRoman_LEETCODE {

    public static void main(String[] args) {

        System.out.println(intToRoman(3749));

    }

    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index =0;
        String ans = new String();
        while (num>0){

            if (num>=values[index]){
                ans += romanSymbols[index];
                num -= values[index];
            }else {
                index++;
            }
        }

        return ans;
    }



}
