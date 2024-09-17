package com.CodeHelp.Extra_NoteBook2;

import java.util.Stack;

/*
https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
 */
public class EN2_2_MinimumNumberOfSwapsToMakeStringBalanced_LEETCODE {

    public static void main(String[] args) {

        System.out.println(minSwaps("][]["));

    }

    public static int minSwaps(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c =='['){
                stack.push(c);
            }else{
                if (!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }

        int open = stack.size()/2;

        return (open+1)/2;
    }
}
