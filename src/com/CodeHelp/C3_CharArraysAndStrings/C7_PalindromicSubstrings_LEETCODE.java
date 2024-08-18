package com.CodeHelp.C3_CharArraysAndStrings;

/*
https://leetcode.com/problems/palindromic-substrings/description/
 */
public class C7_PalindromicSubstrings_LEETCODE {

    public static void main(String[] args) {

        System.out.println(countSubstrings("abc"));
        System.out.println(anotherWay("noon"));
    }

    public static int anotherWay(String s){

        int count =0;

        for (int i = 0; i < s.length(); i++) {

            int oddAns = expandAroundIndex(s,i,i);
            count = count + oddAns;
            int evenAns = expandAroundIndex(s,i,i+1);
            count = count + evenAns;

        }

        return count;

    }

    public static int expandAroundIndex(String s , int left, int right){

        int count =0;
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){

            count++;
            left--;
            right++;

        }
        return count;
    }

    public static int countSubstrings(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            int left = i;
            int right = left+1;
            while (right<s.length()){
                boolean isPalindrome = isPalindrome(s, left, right);
                if (isPalindrome){count++;}
                right++;
            }
        }

        return count;
    }

    public static boolean isPalindrome(String s, int left, int right) {

        while (left<right){

            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
