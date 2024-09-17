package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

/*
https://leetcode.com/problems/next-greater-node-in-linked-list/description/
 */
public class A2_NextGreaterNodEInLinkedList_LEETCODE {

    public static void main(String[] args) {

        A2_NextGreaterNodEInLinkedListNode head = new A2_NextGreaterNodEInLinkedListNode(2);
        A2_NextGreaterNodEInLinkedListNode second  = new A2_NextGreaterNodEInLinkedListNode(7);
        A2_NextGreaterNodEInLinkedListNode third = new A2_NextGreaterNodEInLinkedListNode(4);
        A2_NextGreaterNodEInLinkedListNode fourth = new A2_NextGreaterNodEInLinkedListNode(3);
        A2_NextGreaterNodEInLinkedListNode fifth = new A2_NextGreaterNodEInLinkedListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        int[] ans = nextLargerNodes(head);
        printArray(ans);

    }

    public static int[] nextLargerNodes(A2_NextGreaterNodEInLinkedListNode head) {

        int length = getLength(head);
        int[] res = new int[length];

        A2_NextGreaterNodEInLinkedListNode curr = head;
        int index =0;
        while (curr != null) {
            res[index] = curr.val;
            index++;
            curr = curr.next;
        }
        return nextGreaterElement(res);
    }

    public static int[] nextGreaterElement(int[] arr){

        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i =arr.length-1; i>=0;i--){

            int val = arr[i];
            while (!stack.isEmpty()){

                int data = stack.peek();
                if (data>val){
                    ans[i] = data;
                    stack.push(val);
                    break;
                }else{
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                ans[i]=0;
                stack.push(val);
            }

        }
        return ans;
    }

    public static int getLength(A2_NextGreaterNodEInLinkedListNode head) {

        A2_NextGreaterNodEInLinkedListNode curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }

    public static void printArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class A2_NextGreaterNodEInLinkedListNode {
    int val;
    A2_NextGreaterNodEInLinkedListNode next;
    public A2_NextGreaterNodEInLinkedListNode(int x) {
        val = x;
    }
    A2_NextGreaterNodEInLinkedListNode(int x, A2_NextGreaterNodEInLinkedListNode next) {
        val = x;
        this.next = next;
    }
}