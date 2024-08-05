package com.CodeHelp.C1_Arrays.Assignment;

public class A9_FactorialLargeNumber {

    public static void main(String[] args) {

        doFactorial(8);
    }

    public static void doFactorial(int n) {

            int[] arr = new int[500];
            arr[0]= 1;
            int size = 1;

            for (int i =2;i<=n;i++){

                size = multiply(arr,i,size);
            }

            for (int i =size-1 ;i>=0;i--){
                System.out.print(arr[i]);
            }

    }

    public static int multiply(int[] arr, int num , int size){

        int prod =0;
        int carry =0;

        for (int i =0;i<size;i++){
            prod = arr[i]*num + carry;
            arr[i] = prod%10;
            carry= prod/10;
        }

        while (carry!=0){
            arr[size] = carry%10;
            carry = carry/10;
            size++;
        }

        return size;
    }

}
