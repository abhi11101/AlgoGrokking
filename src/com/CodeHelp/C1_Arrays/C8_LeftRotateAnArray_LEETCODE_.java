package com.CodeHelp.C1_Arrays;

/*
https://leetcode.com/problems/rotate-array/description/
 */

public class C8_LeftRotateAnArray_LEETCODE_ {

    public static void main(String[] args) {

        int data[] = {1,2,3,4,5,6,7,8};
//        rightRotate(data,1);
        leftRotate(data,1);
    }

    private static void rightRotate(int[] arr, int d) {

        int n = arr.length;
        d = d%n;

        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);

        printArray(arr);
    }

    public static void leftRotate(int[] arr, int d) {

        int n = arr.length;
        d = d%n;

        reverse(arr,0,0+d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        printArray(arr);

    }

    private static void reverse(int[] data, int i, int j){

        while (i<j){
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
            i++;
            j--;
        }


    }

    private static void printArray(int[] arr) {

        for (int num: arr){
            System.out.print(num + " ");
        }

    }


}
