package com.CodeHelp.C3_CharArraysAndStrings;

/*
https://leetcode.com/problems/valid-palindrome/
 */
public class C4_ValidPalindrome_LEETCODE {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        int left =0;
        int right = s.length()-1;

        while (left < right) {

            char charLeft = s.charAt(left);
            if ((charLeft>=65 && charLeft<=90)){
                charLeft = (char)(charLeft - 'A' + 'a');
            }

            if ( !(charLeft>= 48 && charLeft <= 57) && !(charLeft>=97 && charLeft<=122) ) {
                left++;
                continue;
            }

            char charRight = s.charAt(right);
            if ((charRight>=65 && charRight<=90)){
                charRight = (char)(charRight - 'A' + 'a');
            }
            if (!(charRight>=48 && charRight<=57) && !(charRight>=97 && charRight<=122)) {

               right--;
               continue;

            }

            if (charRight==charLeft){
                left++;
                right--;
            }
            else {
                return false;
            }

        }
        return true;


    }

}
