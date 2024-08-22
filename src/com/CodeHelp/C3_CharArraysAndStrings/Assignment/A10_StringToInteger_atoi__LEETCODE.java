package com.CodeHelp.C3_CharArraysAndStrings.Assignment;

/*
https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class A10_StringToInteger_atoi__LEETCODE {

    public static void main(String[] args) {

        System.out.println(myAtoi("    -fsfsf473chris"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("2147483646"));
    }


    public static int myAtoi(String s) {

        long ans = 0;
        int index =0;
        int sign = 1; //+ve

        while (index < s.length() && s.charAt(index)== ' '){
            index++;
        }

        if ( index<s.length() && (s.charAt(index)=='+' || s.charAt(index)=='-')){

            sign = s.charAt(index)=='+' ? 1 : -1;
            index++;
        }

        while (index<s.length() && s.charAt(index)>='0' && s.charAt(index)<='9'){

            if (ans  > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && s.charAt(index) > '7')){

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            }else {
                ans = ans*10 + (s.charAt(index)- '0');
                index++;
            }

        }

        return (int) (sign*ans);


    }

}
