package com.CodeHelp.C9_Stack.Assignment;

import java.util.Arrays;

public class A11_NStackInArray {

    public static void main(String[] args) {

        NStack nStack = new NStack(10,3);
        nStack.push(1,1);
        nStack.push(2,1);
        nStack.push(10,2);
        nStack.push(20,2);

        System.out.println(nStack.pop(1));
        System.out.println(nStack.pop(2));
    }

}

class NStack{

    int[] arr;
    int noOfStacks;
    int freeSpot;
    int[] top;
    int[] next;


    public NStack(int sizeOfMainArray, int NoOfStacks) {

        this.noOfStacks = NoOfStacks;

        arr = new int[sizeOfMainArray];
        top = new int[NoOfStacks];
        next = new int[sizeOfMainArray];
        freeSpot =0;

        Arrays.fill(top,-1);

        for (int i =0; i<next.length-1;i++){
            next[i] = i+1;
        }
        next[next.length-1] = -1;
    }

    public boolean push(int value, int stackNo){

        if (freeSpot==-1){
            System.out.println("Stack Overflow");
            return false;
        }

        int index = freeSpot;
        freeSpot = next[index];
        next[index] = top[noOfStacks - stackNo];
        arr[index] = value;
        top[noOfStacks - stackNo] = index;

        return true;
    }

    public int pop(int stackNo){

        if (top[noOfStacks - stackNo]==-1){
            System.out.println("Stack Underflow");
            return -1;
        }

        int index = top[noOfStacks - stackNo];
        top[noOfStacks - stackNo] = next[index];
        int poppedElement = arr[index];
        next[index] = freeSpot;
        freeSpot = index;

        return poppedElement;
    }

}