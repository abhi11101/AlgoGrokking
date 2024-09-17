package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

public class A1_MinimumCountBracketReversal {

    public static void main(String[] args) {

        System.out.println(countRev("}{{}}{{{"));
        System.out.println(countRev("{{}{{{}{{}}{{"));

        System.out.println(countRev("{{}{{{{}}}}}{}{}{{{{{{{{{}}}}}}}}}"));

    }

    public static int countRev (String s) {

        if (s.length()%2!=0)return -1;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c=='{')
                stack.push(c);
            else{
                if (!stack.isEmpty() && stack.peek()=='{')
                    stack.pop();
                else{
                    stack.push(c);
                }
            }
        }
        if (stack.isEmpty())return 0;
        int count =0;
        while (!stack.isEmpty()){
            char first = stack.pop();
            char second = stack.pop();

            if (first==second){
                count++;
            }else{
                count+=2;
            }

        }
        return count;
    }
}
