package com.CodeHelp.C10_Queue;

public class C1_QueueScratch {

    public static void main(String[] args) {

        C1_ScratchQueue queue = new C1_ScratchQueue(10);
        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Size " + queue.getSize());
        queue.pop();
        System.out.println("Size " + queue.getSize());
        System.out.println("Front " + queue.getFront());
        System.out.println("Empty " + queue.isEmpty());

        queue.push(40);
        queue.push(50);
        queue.push(60);
        queue.push(70);
        System.out.println("Size " + queue.getSize());
        queue.push(80);
        queue.push(90);
        queue.push(100);
        System.out.println("Size " + queue.getSize());
        queue.push(120);
        System.out.println("Size " + queue.getSize());

    }

}

class C1_ScratchQueue{

    int[] arr;
    int front;
    int rear;
    int size ;
    C1_ScratchQueue(int size){
        arr = new int[size];
        front =0;
        rear =0;
        this.size = size;
    }

    public void push(int data){
        System.out.println("Rear " + rear);
        if (rear == size){
            System.out.println("Queue Overflow");
        }else{
            arr[rear] = data;
            rear++;
        }
    }

    public void pop(){

        if (front==rear){
            System.out.println("Queue Underflow");
        }else{
            System.out.println(arr[front]);
            front++;
            if (front==rear){
                front=0;
                rear=0;
            }

        }
    }

    public int getFront(){

        if (front==rear){
            System.out.println("Queue Underflow");
            return -1;
        }else{
            return arr[front];
        }
    }

    public boolean isEmpty(){

        if (front==rear){
            return true;
        }else{
            return false;
        }
    }

    public int getSize(){
        return rear-front;
    }



}