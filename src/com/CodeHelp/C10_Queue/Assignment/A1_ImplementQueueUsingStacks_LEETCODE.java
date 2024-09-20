package com.CodeHelp.C10_Queue.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/implement-queue-using-stacks/description/
 */
public class A1_ImplementQueueUsingStacks_LEETCODE {

    public static void main(String[] args) {

        A1_QueueMorePOP queue = new A1_QueueMorePOP();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println(queue.getFront());
        queue.pop();
        System.out.println(queue.getFront());


        A1_MyQueueMorePush queue2 = new A1_MyQueueMorePush();
        queue2.push(100);
        queue2.push(200);
        queue2.push(300);
        System.out.println(queue2.getFront());
        queue2.pop();
        System.out.println(queue2.getFront());

    }

}

class A1_QueueMorePOP{

    Stack<Integer> stack;
    Stack<Integer> reversed;


    public A1_QueueMorePOP() {
        stack = new Stack<>();
        reversed = new Stack<>();
    }

    void push(int data){

        while (!stack.isEmpty()){
            reversed.push(stack.pop());
        }
        reversed.push(data);

        while (!reversed.isEmpty()){
            stack.push(reversed.pop());
        }

    }

    void pop(){
        stack.pop();
    }

    int getFront(){
        if (stack.isEmpty()){
            return -1;
        }else{
            return stack.peek();
        }
    }

}

class A1_MyQueueMorePush{

    Stack<Integer> stack;
    Stack<Integer> reversed;

    public A1_MyQueueMorePush() {
        stack = new Stack<>();
        reversed = new Stack<>();
    }


    void push(int data){
        stack.push(data);
    }


    void pop(){

        if (reversed.isEmpty()){

            while (!stack.isEmpty()){
                reversed.push(stack.pop());
            }
        }

        reversed.pop();

    }

    int getFront(){
        if (reversed.isEmpty() && stack.isEmpty()){
            return -1;
        }else if (reversed.isEmpty() && !stack.isEmpty()){
            while (!stack.isEmpty()){
                reversed.push(stack.pop());
            }
            return reversed.peek();
        }else{
            return reversed.peek();
        }
    }


}