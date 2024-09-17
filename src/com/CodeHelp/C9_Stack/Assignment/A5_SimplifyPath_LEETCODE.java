package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/simplify-path/description/
 */
public class A5_SimplifyPath_LEETCODE {

    public static void main(String[] args) {

        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println("/../");
    }

    public static String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        int index = 0;

        while (index < path.length()) {

            int start = index;
            int end = index+1;
            while (end < path.length() && path.charAt(end) != '/') {
                end++;
            }
            index = end;

            String minPath = path.substring(start, end);

            if (minPath.equals("/") || minPath.equals("/."))continue;

            else if (!minPath.equals("/..")){
                stack.push(minPath);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        String ans = stack.isEmpty() ? "/" : "";
        String finalAns = reverseStack(stack,new StringBuilder(ans));

        return finalAns;

    }

    public static String reverseStack(Stack<String> stack, StringBuilder s) {

        if (stack.isEmpty()) return s.toString();

        String temp = stack.pop();

        reverseStack(stack, s);

        s.append(temp);

        return s.toString();
    }
}
