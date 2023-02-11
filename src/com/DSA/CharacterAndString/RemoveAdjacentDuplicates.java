package com.DSA.CharacterAndString;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
      //  work("abbaca");
        System.out.println(fasterApproach("aabbaca"));
    }
    public static String fasterApproach(String s){
        char[] c = s.toCharArray();
        int j = 0;
        System.out.println(c.length);
        for(int i=0;i<s.length();i++,j++){
            System.out.println("J "+ j);
            c[j] = c[i];
            System.out.println(c[j]);
            if(j > 0 && c[j] == c[j-1]){
                j -= 2;
                System.out.println("if " + j);
            }
        }
        return new String(c, 0, j);
    }
    public static void work(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if (stack.size()!=0){
            if (stack.peek()==c){
                stack.pop();
            }else {
                stack.push(c);
            }
            }else stack.push(c);
        }
        for (char c : stack){
            System.out.print(c +" ");
        }


    }
}
