package com.CodeHelp.C10_Queue.Assignment;

import java.util.LinkedList;
import java.util.Queue;

/*
https://leetcode.com/problems/implement-stack-using-queues/description/
 */
public class A2_ImplementStackUsingQueues_LEETCODE {


    public static void main(String[] args) {

        A2_MyStackUsingTwoQueue stack = new A2_MyStackUsingTwoQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.getTop());
        stack.pop();
        System.out.println(stack.getTop());


        A2_MyStackUsingOneQueue stack2 = new A2_MyStackUsingOneQueue();
        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        stack2.push(400);
        System.out.println(stack2.getTop());
        stack2.pop();
        System.out.println(stack2.getTop());

    }


}

class A2_MyStackUsingTwoQueue{

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public A2_MyStackUsingTwoQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    void push(int x){

        queue2.add(x);

        while (!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }

        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }

    }

    void pop(){

        if (queue1.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            queue1.poll();
        }

    }

    int getTop(){
        if (queue1.isEmpty()){
            return -1;
        }else{
            return queue1.peek();
        }
    }

}

class A2_MyStackUsingOneQueue{

    Queue<Integer> queue1;

    public A2_MyStackUsingOneQueue(){
        queue1 = new LinkedList<>();
    }

    void push(int x){

        queue1.add(x);

        for (int i = 0; i< queue1.size()-1 ; i++){
            int front  = queue1.peek();
            queue1.poll();
            queue1.add(front);
        }

    }

    void pop(){

        if (queue1.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            queue1.poll();
        }

    }

    int getTop(){

        if (queue1.isEmpty()){
            return -1;
        }
        return queue1.peek();
    }


}