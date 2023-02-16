package com.DSA.Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ArrayPowerSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Deque<Integer> list = new ArrayDeque<>();
        find(arr,0,list);
    }

    public static void find(int[] input, int i, Deque<Integer> output){
        if (i==input.length){
            show(output);
            return;
        }
        output.addLast(input[i]);
        find(input,i+1,output);
        output.removeLast();
        find(input,i+1,output);

    }
    private static void show(Deque<Integer> output){
        if (output.size()==0) System.out.print("{}");
        else {
        for (int x : output){
            System.out.print(x + " ");
        }}
        System.out.println();
    }
}
