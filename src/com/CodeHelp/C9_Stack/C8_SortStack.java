package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C8_SortStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(50);
        stack.push(60);
        stack.push(30);
        stack.push(40);
        stack.push(10);

        printStack(stack);

        sort(stack);
        printStack(stack);

    }

    public static Stack<Integer> sort(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return stack;
        }

        int temp = stack.pop();

        sort(stack);
        insertSorted(stack, temp);

        return stack;
    }

    public static Stack<Integer> insertSorted(Stack<Integer> stack, int element){
        if (stack.isEmpty() || element < stack.peek()){
            stack.push(element);
            return stack;
        }

        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);

        return stack;
    }

    public static void printStack(Stack<Integer> stack){

        for (int i : stack){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
