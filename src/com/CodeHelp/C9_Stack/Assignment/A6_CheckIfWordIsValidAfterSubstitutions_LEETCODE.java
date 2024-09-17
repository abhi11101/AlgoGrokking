package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/description/
 */
public class A6_CheckIfWordIsValidAfterSubstitutions_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isValidUsingRecursion("aabcbc"));
        System.out.println(isValidUsingRecursion("abcabcababcc"));
        System.out.println(isValidUsingRecursion("abccba"));
        System.out.println("------------------------");
        System.out.println(isValid("aabcbc"));
        System.out.println(isValid("abcabcababcc"));
        System.out.println(isValid("abccba"));

    }

    public static boolean isValid(String s) {
        if (s.charAt(0)!='a')return false;

        Stack<Character> stack = new Stack<>();
        for (char currentChar : s.toCharArray()) {
            if (currentChar == 'a'){
                stack.push(currentChar);
            }else if (currentChar == 'b'){
                if (!stack.isEmpty() && stack.peek() == 'a'){
                    stack.push(currentChar);
                }else{
                    return false;
                }

            }else if (currentChar == 'c' ){
                if (!stack.isEmpty() && stack.peek() == 'b'){
                    stack.pop();
                    stack.pop();
                }else{
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static boolean isValidUsingRecursion(String s) {

        if (s.length()==0)return true;

        int pos = s.indexOf("abc");

        if (pos!=-1){

            String left = s.substring(0,pos);
            String right = s.substring(pos+3);

            return isValidUsingRecursion(left+right);
        }
        return false;
    }
}
