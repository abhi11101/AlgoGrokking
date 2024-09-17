package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/maximal-rectangle/description/
 */
public class A8_MaximalRectangle_LEETCODE {

    public static void main(String[] args) {

        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'}};

        System.out.println(maximalRectangle(matrix));

    }

    public static int maximalRectangle(char[][] matrix) {

        int[][] heights = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                heights[i][j] = matrix[i][j] - '0';
            }
        }

        int area = largestRectangleArea(heights[0]);

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (heights[i][j]!=0){
                    heights[i][j] += heights[i-1][j];
                }else{
                    heights[i][j] = 0;
                }

            }
            area = Math.max(area, largestRectangleArea(heights[i]));
        }

        return area;
    }

    public static int largestRectangleArea(int[] heights) {

        int[] prevSmaller  = previousSmallerElement(heights);
        int[] nextSmaller = nextSmallerElement(heights);

        int max = 0;
        for (int i = 0; i < heights.length; i++) {

            int ans = heights[i] *(nextSmaller[i]-prevSmaller[i]-1);
            max = Math.max(max, ans);

        }
        return max;
    }

    public static int[] previousSmallerElement(int[] heights) {

        int[] ans = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < heights.length; i++) {

            int height = heights[i];
            while (!stack.isEmpty()){

                int top = stack.peek();
                int val = top==-1 ? -1 : heights[top];
                if (val<height){
                    ans[i] = top;
                    stack.push(i);
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        return ans;
    }

    public static int[] nextSmallerElement(int[] heights) {

        int[] ans = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        int size = heights.length;
        for (int i = heights.length-1; i >= 0; i--) {

            int height = heights[i];
            while (!stack.isEmpty()){

                int top = stack.peek();
                int val = heights[top];

                if (val<height){
                    ans[i] = top;
                    stack.push(i);
                    break;
                }else{
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                ans[i] = size;
                stack.push(i);
            }
        }

        return ans;
    }
}
