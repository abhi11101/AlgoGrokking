package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C6_ReverseAStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        printStack(stack);

        reverse(stack);
        printStack(stack);

    }

    public static void reverse(Stack<Integer> s)
    {
        if (s.isEmpty()){
            return;
        }

        int temp = s.peek();
        s.pop();

        reverse(s);

        insertAtBottom(s, temp);
    }

    public static void insertAtBottom(Stack<Integer> s, int i){

        if (s.isEmpty()){
            s.push(i);
            return;
        }

        int temp = s.peek();
        s.pop();

        insertAtBottom(s, i);
        s.push(temp);
    }

    public static void printStack(Stack<Integer> s){

        for (int i : s){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
