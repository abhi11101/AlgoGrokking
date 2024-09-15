package com.CodeHelp.C9_Stack;

public class C2_TwoStacksInAnArray {

    public static void main(String[] args) {

        C2_Stack stack = new C2_Stack(10);

        stack.push1(10);
        stack.print();
        stack.push1(20);
        stack.print();
        stack.push1(30);
        stack.print();
        stack.push1(40);
        stack.print();
        stack.push1(50);
        stack.print();

        stack.push2(100);
        stack.print();
        stack.push2(200);
        stack.print();
        stack.push2(300);
        stack.print();
        stack.push2(400);
        stack.print();
        stack.push2(500);
        stack.print();
        stack.push2(600);

        stack.pop1();
        stack.print();

        stack.pop2();
        stack.print();
        stack.pop2();
        stack.print();
        stack.pop2();
        stack.print();
        stack.pop2();
        stack.print();
        stack.pop2();
        stack.print();
        stack.pop2();

        stack.pop1();
        stack.print();
        stack.pop1();
        stack.print();
        stack.pop1();
        stack.print();
        stack.pop1();
        stack.print();

        stack.pop1();

    }
}

class C2_Stack{

    int[] arr;
    int top1;
    int top2;
    int size;

    C2_Stack(int size){
        arr = new int[size];
        top1= -1;
        top2= size;
        this.size = size;
    }

    void push1(int data){
        if (top1 < top2-1){
            top1++;
            arr[top1] = data;
        }else{
            System.out.println("Stack1 Overflow cannot add " + data);
        }
    }

    void pop1(){
        if (top1>=0){
            System.out.println(arr[top1]);
            arr[top1]=0;
            top1--;
        }else{
            System.out.println("Stack1 is empty");
        }
    }

    void push2(int data){
        if (top2>top1+1){
            top2--;
            arr[top2] = data;
        }else{
            System.out.println("Stack2 Overflow cannot add " + data);
        }

    }

    void pop2(){
        if (top2<size){
            System.out.println(arr[top2]);
            arr[top2]=0;
            top2++;
        }else{
            System.out.println("Stack2 is empty");
        }
    }

    void print(){
        System.out.println("Top1 " + top1);
        System.out.println("Top2 " + top2);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("\n");
    }
}
