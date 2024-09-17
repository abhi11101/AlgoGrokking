package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/decode-string/
 */
public class A7_DecodeString_LEETCODE {

    public static void main(String[] args) {

        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));

        System.out.println(decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));

    }

    public static String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == ']'){

                StringBuilder stringToRepeat = new StringBuilder();
                while (!stack.isEmpty() &&  (stack.peek().charAt(0) < '0' || stack.peek().charAt(0)> '9')){
                    String data = stack.peek().charAt(0) == '[' ? "" : stack.peek();
                    stringToRepeat.append(data);
                    stack.pop();
                }
                StringBuilder numericTimes =  new StringBuilder();

                while (!stack.isEmpty() &&  stack.peek().charAt(0)>= '0' &&  stack.peek().charAt(0)<= '9'){
                    numericTimes.append(stack.pop());
                }

                String num = numericTimes.reverse().toString();
                int n = Integer.parseInt(num);

                StringBuilder decodedString = new StringBuilder();
                while (n>0){
                    decodedString.append(stringToRepeat);
                    n--;
                }

                stack.push(decodedString.toString());

            }else{
                stack.push(c+"");
            }

        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
