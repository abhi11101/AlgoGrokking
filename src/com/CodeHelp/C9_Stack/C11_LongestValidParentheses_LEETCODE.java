package com.CodeHelp.C9_Stack;

import java.util.Stack;

/*
https://leetcode.com/problems/longest-valid-parentheses/
 */
public class C11_LongestValidParentheses_LEETCODE {

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("(()"));
        System.out.println(longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses(""));
    }

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            }
            else{
                stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                }else{
                    int lastIndex = stack.peek();
                    int length = i-lastIndex;
                    max = Math.max(max, length);
                }
            }

        }
        return max;
    }
}
