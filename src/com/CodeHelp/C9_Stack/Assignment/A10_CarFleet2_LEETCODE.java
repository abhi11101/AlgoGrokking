package com.CodeHelp.C9_Stack.Assignment;

import java.util.Arrays;
import java.util.Stack;

/*
https://leetcode.com/problems/car-fleet-ii/description/
 */
public class A10_CarFleet2_LEETCODE {

    public static void main(String[] args) {

        int[][] cars = {{1,2},{2,1},{4,3},{7,2}};
        double[] ans = getCollisionTimes(cars);
        printArray(ans);
    }

    public static double[] getCollisionTimes(int[][] cars) {

        double[] ans = new double[cars.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();

        for (int i = cars.length-1; i >= 0; i--) {

            while (!stack.isEmpty() && cars[stack.peek()][1]>=cars[i][1]){
                stack.pop();
            }

            while (!stack.isEmpty()){
                double collisionTime = (double) (cars[stack.peek()][0]-cars[i][0])/(cars[i][1]-cars[stack.peek()][1]);

                if (ans[stack.peek()]==-1 || collisionTime<=ans[stack.peek()]){
                    ans[i]=collisionTime;
                    break;
                }
                stack.pop();
            }
            stack.push(i);

        }

        return ans;
    }

    public static void printArray(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
