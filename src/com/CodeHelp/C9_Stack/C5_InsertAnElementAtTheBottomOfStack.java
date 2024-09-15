package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C5_InsertAnElementAtTheBottomOfStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(8);

        printStack(stack);

        System.out.println("Stack size " + stack.size());
        insertAtBottom(stack,10);
        printStack(stack);
        System.out.println("Stack size " + stack.size());

    }

    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {

        if (st.isEmpty()) {
            st.push(x);
            return st;
        }

        int temp = st.peek();
        st.pop();

        insertAtBottom(st, x);

        st.push(temp);

        return st;

    }

    public static void printStack(Stack<Integer> st) {

        for (int i : st){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
