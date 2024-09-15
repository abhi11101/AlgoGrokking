package com.CodeHelp.C9_Stack;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/min-stack/description/
 */
public class C10_MinStack_LEETCODE {

    public static void main(String[] args) {


        C10_MinStack stack = new C10_MinStack();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(10);
        System.out.println(stack.getMin());
        System.out.println(stack.top());

    }


}

class C10_MinStack {

    List<int[]> stack;

    public C10_MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {

        int[] data = stack.isEmpty() ? new int[]{val,val} : stack.get(stack.size() - 1);
        int min = Math.min(val, data[1]);

        stack.add(new int[]{val, min});
    }

    public void pop() {
        stack.removeLast();
    }

    public int top() {
        return stack.get(stack.size()-1)[0];
    }

    public int getMin() {
        return stack.get(stack.size()-1)[1];
    }
}