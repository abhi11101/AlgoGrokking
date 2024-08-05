package com.CodeHelp.C1_Arrays;

public class C3_ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        // Using for loop
        for (int i = 0; i < arr.length / 2; i++) {

            int val = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = val;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Using while loop
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int val = arr[start];
            arr[start] = arr[end];
            arr[end] = val;
            start++;
            end--;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        //Using XOR
        int data[] = {1, 1, 1, 1, 1, 1};
        reverseArrayUsingXOR(data);
        for (int num : data) {
            System.out.println(num);
        }
    }

    /*

        a = a^b
        b= a^b = (a^b)^b=(a^0) = a{original value}
        a=a^b = (a^b)^b = (a^b)^a{from above} = b^0 = b{original value}
     */
    public static void reverseArrayUsingXOR(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap array[i] and array[n-i-1] using XOR
            array[i] = array[i] ^ array[n - i - 1];
            array[n - i - 1] = array[i] ^ array[n - i - 1];
            array[i] = array[i] ^ array[n - i - 1];
        }

    }
}
