package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

public class A4_PalindromeCheckUsingRecursion {

    public static void main(String[] args) {

        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abca"));

    }


    public static boolean isPalindrome(String str) {

        return isPalindromeRec(str, 0, str.length() - 1);

    }

    public static boolean isPalindromeRec(String str, int start, int end) {

        if (start>=end){
            return true;
        }

        if (str.charAt(start)!=str.charAt(end)){
            return false;
        }

        return isPalindromeRec(str, start + 1, end - 1);

    }

}
