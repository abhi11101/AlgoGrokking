package com.CodeHelp.C10_Queue;

public class C2_CircularQueueScratch {

    public static void main(String[] args) {


    }

}

class C2_ScratchCircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;

    C2_ScratchCircularQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    public void push(int data){

        if (isFull()){
            System.out.println("Queue Overflow");
        }
        else if (front==-1){
            front=0;
            rear =0;
            arr[rear] = data;
        }
        else if (rear==size-1 && front!=0){
            rear =0;
            arr[rear] = data;
        }else{
            rear++;
            arr[rear] = data;
        }
    }

    public void pop(){

        if(isEmpty()){
            System.out.println("Queue Underflow");
        }
        else if (front==rear){
            System.out.println(arr[front]);
            front = -1;
            rear = -1;
        } else if (front ==size-1) {
            front =0;
        }else{
            front++;
        }
    }

    private boolean isFull(){


        if ((front==0 && rear==size-1) || (rear == front-1) ){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){

        if (front==rear){
            return true;
        }else{
            return false;
        }

    }

}