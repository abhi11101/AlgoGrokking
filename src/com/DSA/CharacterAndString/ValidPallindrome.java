package com.DSA.CharacterAndString;

public class ValidPallindrome {
    public static void main(String[] args) {
        System.out.println(check( "0P"));
    }

    public static boolean check(String s){
        int length = s.length();
        int left = 0;
        int right = length - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            if (leftChar >= 65 && leftChar <= 90) {
                leftChar = (char) (leftChar + 32);
            }
            if (!(leftChar >= 48 && leftChar <= 57) && !(leftChar >= 97 && leftChar <= 122)) {
                left++;
                continue;
            }
            char rightChar = s.charAt(right);
            if (rightChar >= 65 && rightChar <= 90) {
                rightChar = (char) (rightChar + 32);
            }
            if (!(rightChar >= 48 && rightChar <= 57) && !(rightChar >= 97 && rightChar <= 122)) {
                right--;
                continue;
            }
            if (leftChar == rightChar) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;

    }}
