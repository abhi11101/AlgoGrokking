package com.CodeHelp.Extra_NoteBook2;

import java.util.Stack;

/*
https://leetcode.com/problems/removing-stars-from-a-string/description/
 */
public class EN2_9_RemovingStarsFromString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));

    }

    public static String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty())stack.pop();

            }else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

}
