package com.CodeHelp.Extra_NoteBook2;

import java.util.Stack;

/*
https://leetcode.com/problems/asteroid-collision/description/
 */
public class EN2_10_AsteroidCollision_LEETCODE {

    public static void main(String[] args) {

        int[] nums1 = {5,10,-5};
        int[] nums2 = {8,-8};
        int[] nums3 = {10,2,-5};
        int[] nums4 = {-2,-1,1,2};

        int[] ans1 = asteroidCollision(nums1);
        int[] ans2 = asteroidCollision(nums2);
        int[] ans3 = asteroidCollision(nums3);
        int[] ans4 = asteroidCollision(nums4);

        printArray(ans1);
        printArray(ans2);
        printArray(ans3);
        printArray(ans4);

    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        boolean larger = false;
        for (int i = 0; i < asteroids.length; i++) {

            int current = asteroids[i];
            if (stack.isEmpty() || stack.peek()<0 || (stack.peek()>0 && current>0)){
                stack.push(current);
            }else{

                while (!stack.isEmpty() && stack.peek()>0){

                    int top = stack.peek();

                    if (Math.abs(current)>Math.abs(top)){
                        stack.pop();
                        larger = true;
                    }else if (Math.abs(current)==Math.abs(top)){
                        stack.pop();
                        larger = false;
                        break;
                    }else{
                        larger = false;
                        break;
                    }

                }
                if (larger)stack.push(current);
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }
        return ans;
    }

    public static void printArray(int[] arr) {

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
