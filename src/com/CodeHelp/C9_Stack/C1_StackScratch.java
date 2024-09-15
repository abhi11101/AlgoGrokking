package com.CodeHelp.C9_Stack;

public class C1_StackScratch {

    public static void main(String[] args) {

        C1_Stack stack = new C1_Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        printStack(stack);
        System.out.println("Stack Size " + stack.getSize());
        stack.pop();
        stack.getTop();

    }

    public static void printStack(C1_Stack stack) {

        while (!stack.isEmpty()){
            System.out.print(stack.getTop() + " ");
            stack.pop();
        }
        System.out.println();
    }
}

class C1_Stack{

    public int[] arr;
    public int size;
    public int top;

    public C1_Stack(int size){
        arr = new int[size];
        this.size = size;
        top = -1;
    }

    public void push(int data){
        if (size-top>1){
            top++;
            arr[top] = data;

        }else{
            System.out.println("Stack Overflow, cannot push " + data);
        }
    }

    public int pop(){
        if (top>=0){
            return arr[top--];
        }else {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
    }

    public int getTop(){
        if (top>=0){
            return arr[top];
        }else {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
    }

    public int getSize(){
        return top+1;
    }

    public boolean isEmpty(){
        if (top>=0){
            return false;
        }else {
            return true;
        }
    }
}