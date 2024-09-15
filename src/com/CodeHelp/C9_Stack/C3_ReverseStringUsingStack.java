package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C3_ReverseStringUsingStack {

    public static void main(String[] args) {

        System.out.println(reverseStringUsingStack("abcdefg"));
    }

    public static String reverseStringUsingStack(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
