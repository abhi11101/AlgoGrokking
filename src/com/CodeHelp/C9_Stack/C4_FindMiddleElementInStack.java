package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C4_FindMiddleElementInStack {

    public static int ans=-1;
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        System.out.println(findMiddleElement(stack,stack.size()));

    }

    public static int findMiddleElement(Stack<Integer> stack, int size) {

        if (size==0){
            ans =-1;
            return ans;
        }
        if (stack.size()==size/2+1){
            ans = stack.peek();
            return ans;
        }

        int temp = stack.peek();
        stack.pop();

        findMiddleElement(stack,size);

        stack.push(temp);

        return ans;
    }
}
