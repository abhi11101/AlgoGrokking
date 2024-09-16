package com.CodeHelp.C9_Stack;

import java.util.Stack;

public class C13_PreviousSmallerElement {

    public static void main(String[] args) {

        int[] data = {2,1,4,3};
        int[] ans = findPreviousSmallerElement(data);
        printArray(ans);

    }

    public static int[] findPreviousSmallerElement(int[] arr) {

        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < arr.length; i++) {

            int val = arr[i];
            while (!stack.isEmpty()){
                int top = stack.peek();
                if (top<val){
                    ans[i]=top;
                    stack.push(val);
                    break;
                }else{
                    stack.pop();
                }
            }

        }
        return ans;
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
