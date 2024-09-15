package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/rotate-string/description/
 */
public class E16_RotateString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(rotateString("abcde","cdeab"));
        System.out.println(rotateString("abcde","abced"));


    }

    public static boolean rotateString(String s, String goal) {

        if (s.length()!=goal.length()) return false;

        goal = goal+goal;
        return goal.contains(s);


    }


}
