package com.CodeHelp.C9_Stack;

import java.util.Stack;

/*
https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class C14_LargestRectangleInHistogram_LEETCODE {

    public static void main(String[] args) {

        int[] heights1 = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights1));

        int[] heights2 = {2,4};
        System.out.println(largestRectangleArea(heights2));

    }

    public static int largestRectangleArea(int[] heights) {

        int[] ans = new int[heights.length];

        int[] prevSmaller = previousSmallerElements(heights);
        int[] nextSmaller = nextSmallerElements(heights);
        System.out.println("Previous ");
        printArray(prevSmaller);
        System.out.println("Next ");
        printArray(nextSmaller);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {

            ans[i] = heights[i] *(nextSmaller[i]-prevSmaller[i]-1);
            max = Math.max(max, ans[i]);
        }
        return max;
    }

    public static int[] previousSmallerElements(int[] heights) {

        int[] ans  = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];

            while (!stack.isEmpty()){
                int top = stack.peek();
                int val = top==-1 ? -1 : heights[top];
                if (val<height){
                    ans[i]=top;
                    stack.push(i);
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        return ans;
    }

    public static int[] nextSmallerElements(int[] heights) {

        int[] ans = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        int size = heights.length;
        for (int i = heights.length - 1; i >= 0; i--) {
            int height = heights[i];
            while (!stack.isEmpty()){
                int top = stack.peek();
                int val = heights[top];
                if (val<height){
                    ans[i]=top;
                    stack.push(i);
                    break;
                }else{
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                ans[i]=size;
                stack.push(i);
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
