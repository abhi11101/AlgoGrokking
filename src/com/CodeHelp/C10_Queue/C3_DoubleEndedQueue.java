package com.CodeHelp.C10_Queue;

public class C3_DoubleEndedQueue {

    public static void main(String[] args) {

        DequeueScratch dequeue = new DequeueScratch(5);
        dequeue.pushFront(10);
        dequeue.pushRear(100);
        dequeue.pushFront(20);
        dequeue.pushRear(50);
        System.out.println("Size " + dequeue.getSize());
        System.out.println("Front " + dequeue.getFront());
        System.out.println("Rear " + dequeue.getRear());
        dequeue.popFront();
        System.out.println("Front " + dequeue.getFront());

    }
}
class DequeueScratch {

    int[] arr;
    int size;
    int front;
    int rear;
    int count;  // to track the number of elements in the deque

    DequeueScratch(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = 0;
        count = 0;  // initially, the deque is empty
    }

    void pushRear(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            arr[rear] = data;
            rear = (rear + 1) % size;  // circular increment
            count++;
        }
    }

    void pushFront(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
        } else {
            front = (front - 1 + size) % size;  // circular decrement
            arr[front] = data;
            count++;
        }
    }

    void popFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            front = (front + 1) % size;  // circular increment
            count--;
        }
    }

    void popRear() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            rear = (rear - 1 + size) % size;  // circular decrement
            count--;
        }
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return arr[front];
        }
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            return arr[(rear - 1 + size) % size];  // circular decrement
        }
    }

    public boolean isFull() {
        return count == size;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getSize() {
        return count;
    }
}