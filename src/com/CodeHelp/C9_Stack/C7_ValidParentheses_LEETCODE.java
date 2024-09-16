package com.CodeHelp.C9_Stack;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses/description/
 */
public class C7_ValidParentheses_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop()!=c)
                return false;

        }
        return true;
    }
}