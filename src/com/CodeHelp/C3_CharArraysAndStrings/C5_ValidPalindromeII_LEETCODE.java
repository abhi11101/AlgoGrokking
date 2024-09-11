package com.CodeHelp.C3_CharArraysAndStrings;

/*
https://leetcode.com/problems/valid-palindrome-ii/description/
 */
public class C5_ValidPalindromeII_LEETCODE {

    public static void main(String[] args) {

        String s = "abca";
        String s2 = "mlcupuuffuupuculm";
        System.out.println(validPalindrome(s2));

    }

    public static boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }
            else {
                if (isPalindrome(s,left+1,right))return true;
                if (isPalindrome(s,left,right-1))return true;
                return false;
            }

        }

        return true;
    }

    public  static  boolean isPalindrome(String s , int left, int right){

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }


}
