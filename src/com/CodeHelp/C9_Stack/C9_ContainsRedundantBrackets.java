package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C9_ContainsRedundantBrackets {

    public static void main(String[] args) {

        System.out.println(checkRedundancy("((a+b))"));
        System.out.println(checkRedundancy("(a+b+(c+d))"));
        System.out.println(checkRedundancy("(b+c-d+(c))"));
        System.out.println(checkRedundancy("(a+b+(d))"));

    }

    public static boolean checkRedundancy(String s) {

        Stack<Character> stack = new Stack<>();
        boolean operator = false;
        for (char sChar : s.toCharArray()) {

            if (sChar=='(' || sChar=='+' || sChar=='-' || sChar=='*' || sChar=='/')
                stack.push(sChar);
            else if (sChar==')'){
                while (!stack.isEmpty()){
                    char temp = stack.pop();
                    if (temp=='+' || temp=='-' || temp=='*' || temp=='/')
                        operator = true;
                    else if (temp == '('){

                        if (operator){
                            operator = false;
                            break;
                        }else {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
